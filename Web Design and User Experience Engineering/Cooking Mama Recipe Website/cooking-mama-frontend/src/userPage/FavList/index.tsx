import React, {ReactElement, useState, useEffect, useTransition} from "react";
import { Link } from "react-router-dom";
import { Recipe } from "../../models/recipe";
import FavoriteIcon from "@mui/icons-material/Favorite";
import IconButton from "@mui/material/IconButton";
import Button from "@mui/material/Button";
import "../../dist/main.css";
import { useDispatch, useSelector } from "react-redux";
import { AppState } from "../../store";
import { useNavigate } from "react-router-dom";
import { setUser } from "../../store/slices/userSlice";
import {useTranslation} from "react-i18next";
const FAVRECIPE_PAGE_API = "http://localhost:3001/userInfoFavorites";

const FavList: React.FC = (): ReactElement => {
    const navigate = useNavigate();
    const [favRecipe, setFavRecipe] = useState<Recipe[]>([]);
    const dispatch = useDispatch();
    const user = useSelector((state: AppState) => state["user"]);
    const { t } = useTranslation();
    const fetchFavRecipe = async () => {
        try {
            const userId = user.userId;
            const response = await fetch(FAVRECIPE_PAGE_API + `?userId=${userId}`, {
                method: "GET",
                headers: {
                    "Content-Type": "application/json",
                },
            });
            const userData = await response.json();

            const favRecipes = userData.favorites;
            setFavRecipe(favRecipes);
        } catch (error) {
            console.error("Error fetching favorite recipes:", error);
        }
    };

    useEffect(() => {
        fetchFavRecipe();
    }, []);

    const handleRemoveFromFavorites = async (recipeId: string) => {
        // Implement the logic to remove the recipe from favorites
        try {
            const userId = user.userId;
            // const userId = localStorage.getItem('userId');
            const data = await fetch("http://localhost:3001/removeRecipeFromFav", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify({ recipeId, userId }),
            });
            const userData = await data.json();
            setFavRecipe(userData.favorites);
            dispatch(setUser(userData));
            alert("Successfully removed from favorties!");
            //   window.location.reload();
            // Optionally, you can refetch the updated favorites
            // const favoritesResponse = await axios.post('/getUserInfoFavorites', { userId });
            // setUserInfo({ ...userInfo, favorites: favoritesResponse.data.favorites });
        } catch (error) {
            console.error("Error removing recipe from favorites:", error);
            alert("Error removing from favorties!");
        }
    };
    const favRecipeEntries = favRecipe.map((recipe) => {
        return (
            <div className="card-container1">
                <div className="recipe-image1">
                    <img src={recipe.image} alt="recipe image" />
                </div>
                <div className="recipe-info1">
                    <div className="recipe-title1">{recipe.title}</div>
                    {/* <button onClick={() => handleRemoveFromFavorites(recipe.recipeId)}className="recipe-fav" >Fav</button> */}
                    <IconButton
                        color="error"
                        onClick={() => handleRemoveFromFavorites(recipe.recipeId)}
                        className="recipe-fav"
                    >
                        <FavoriteIcon />
                    </IconButton>
                </div>
            </div>
        );
    });

    return (
        <div className="list-wrapper">
            <div className="card-wrapper1">{favRecipeEntries}</div>
        </div>
    );
};

export default FavList;
