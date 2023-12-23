import React, { ReactElement, useEffect, useState } from "react";
import Chip from "@mui/material/Chip";
import Stack from "@mui/material/Stack";
import Avatar from "@mui/material/Avatar";
import FavoriteBorderIcon from "@mui/icons-material/FavoriteBorder";
import FavoriteIcon from '@mui/icons-material/Favorite';
import "../../dist/main.css";
import { Recipe } from "../../models/recipe";
import Alert from "@mui/material/Alert";
import { useDispatch, useSelector } from "react-redux";
import { setUser } from "../../store/slices/userSlice";
import { useNavigate } from "react-router-dom";
interface RecipeProps {
  recipe: Recipe;
}
const RecipeCard: React.FC<RecipeProps> = (
  props: RecipeProps
): ReactElement => {
  const user = useSelector((state: any) => state["user"]);
  const [isAdded2F, setIsAdded2F] = useState(false);
  const dispatch = useDispatch();
  const navigate = useNavigate();
  const { recipe } = props;

  // check whether recipe was added to favorites
  const checkRecipeStatus = () => {
    const recipeList: Recipe[] = user.favorites;
    console.log(user);
    for (let r of recipeList) {
      if (r.recipeId === recipe.recipeId) {
        setIsAdded2F(true);
        return;
      }
    }
    setIsAdded2F(false);
  }

  const handleAdd2Favorites = async (recipeId: string) => {
    if (user.userId === "") {
      alert("Please login first");
      navigate("/login");
      return;
    }
    try {
      const userId = user.userId;
      const data = await fetch("http://localhost:3001/addRecipe2Fav", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ recipeId, userId }),
      });
      const userData = await data.json();
      dispatch(setUser(userData));
      alert("Successfully added to favorties!");
    } catch (error) {
      console.error("Error adding recipe to favorites:", error);
      alert("Error adding to favorties!");
    }
  };

  const handleRemoveFromFavorites = async (recipeId: string) => {
    if (user.userId === "") {
      alert("Please login first");
      navigate("/login");
      return;
    }
    // Implement the logic to remove the recipe from favorites
    try {
      const userId = user.userId;
      const data = await fetch("http://localhost:3001/removeRecipeFromFav", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ recipeId, userId }),
      });
      const userData = await data.json();
      dispatch(setUser(userData));
      alert("Successfully removed from favorties!");
      // Optionally, you can refetch the updated favorites
      // const favoritesResponse = await axios.post('/getUserInfoFavorites', { userId });
      // setUserInfo({ ...userInfo, favorites: favoritesResponse.data.favorites });
    } catch (error) {
      console.error("Error removing recipe from favorites:", error);
      alert("Error removing from favorties!");
    }
  };

  useEffect(() => {
    checkRecipeStatus();
  }, [user]);

  return (
    <div className="card-wrapper">
      <div className="card-container">
        <div className="recipe-author">
          <Avatar sx={{ width: 60, height: 60 }}>
            {recipe.author.substring(0, 1)}
          </Avatar>
        </div>
        <div className="recipe-image">
          <img src={recipe.image} alt="recipe imgae" />
        </div>
        <div className="recipe-info">
          <div className="recipe-title-line">
            <div className="recipe-title">{recipe.title}</div>
            {
              isAdded2F ? (
                <div onClick={() => handleRemoveFromFavorites(recipe.recipeId)} className="fav-button">
                  <FavoriteIcon sx={{ width: 25, height: 25 }} />
                </div>
              ) : (
                <div onClick={() => handleAdd2Favorites(recipe.recipeId)} className="fav-button">
                  <FavoriteBorderIcon sx={{ width: 25, height: 25 }} />
                </div>
              )
            }
          </div>
          <div>
            <Stack direction="row" spacing={1}>
              {recipe.tags.map((tag) => (
                <Chip label={tag} />
              ))}
            </Stack>
          </div>
          <div>
            <b>Ingredients:</b>
            <div>{recipe.ingredients}</div>
          </div>
          <div>
            <b>Description:</b>
            <div>{recipe.description}</div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default RecipeCard;
