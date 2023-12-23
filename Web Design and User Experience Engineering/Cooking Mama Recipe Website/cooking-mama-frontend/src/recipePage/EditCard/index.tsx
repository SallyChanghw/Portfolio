import { ReactElement, useState } from "react";
import React from "react";

import {
  Card,
  CardContent,
  TextField,
  Button,
  Box,
  Typography,
  Chip,
} from "@mui/material";
import { CardMedia } from "@mui/material";
import AddAPhotoIcon from "@mui/icons-material/AddAPhoto";
import { Recipe } from "../../models/recipe";
import { useDispatch, useSelector } from "react-redux";
import { AppState } from "../../store";
import uniqid from 'uniqid';
import {addNewRecipe, setRecipeList} from "../../store/slices/recipeSlice";
import {useEffect} from "react";
import {useNavigate} from "react-router-dom";
import {useTranslation} from "react-i18next";
interface EditCardProps {
  recipe: Recipe | null;
  handleClose: () => void;
}
const EditCard: React.FC<EditCardProps> = ({ recipe,handleClose }): ReactElement => {
  const [title, setTitle] = useState<string>("");
  const [description, setDescription] = useState<string>("");
  const [imagePreview, setImagePreview] = useState<string | null>(null);
  const [tags, setTags] = useState<string[]>([]);
  const [tagInput, setTagInput] = useState("");
  const [ingredientInput, setIngredientInput] = useState("");
  const [ingredients, setIngredients] = useState<string[]>([]);
  const [base64Image, setBase64Image] = useState(""); // storing base64 images
  const user = useSelector((state: AppState) => state["user"]);
  const navigate = useNavigate();
  const dispatch = useDispatch();
  const {t } = useTranslation();
  useEffect(() => {
    if (recipe) {
      console.log(recipe);
      setTitle(recipe.title);
      setDescription(recipe.description);
      setImagePreview(recipe.image);
      setTags(recipe.tags);
      setIngredients(recipe.ingredients);
      setBase64Image(recipe.image); // base64
    } else {
      // set default or empty form
      setTitle('');
      setDescription('');
      setImagePreview(null);
      setTags([]);
      setIngredients([]);
      setBase64Image('');
    }
  }, [recipe]);

  const createRecipe = async (event: React.MouseEvent) => {
      event.preventDefault();
      const recipe: Recipe = {
        author: user.username,
        recipeId: uniqid(),
        title: title,
        description: description,
        image: base64Image,
        tags: tags,
        ingredients: ingredients,
      };
      const combinedData = {
        recipe: recipe,
        user: user
      };
      console.log(user.postedRecipes);

      const response = await fetch("http://localhost:3001/addRecipe", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(combinedData),
      });
      handleClose();
      dispatch(addNewRecipe(recipe));
      alert("Successfully created a recipe!");
    };

    const updateRecipe = async (event: React.MouseEvent) => {
        event.preventDefault();
        const updateRecipe: Recipe = {
          author: user.username,
          recipeId: recipe===null?uniqid():recipe.recipeId,
          title: title,
          description: description,
          image: base64Image,
          tags: tags,
          ingredients: ingredients,
        }
      const response = await fetch("http://localhost:3001/updateRecipe", {
        method: "PUT",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(updateRecipe),
      });
      handleClose();
      alert("Successfully updated!");
    }


  const handleUploadClick = (event: React.ChangeEvent<HTMLInputElement>) => {
    if (event.target.files && event.target.files[0]) {
      const file = event.target.files[0];
      const reader = new FileReader();
      reader.onloadend = () => {
        if (typeof reader.result === "string") {
          setImagePreview(reader.result); // set image preview
          setBase64Image(reader.result); // store base64
        }
      };
      reader.readAsDataURL(file);
    }
  };
  const handleAddTag = () => {
    if (tagInput) {
      setTags([...tags, tagInput]);
      setTagInput("");
    }
  };
  const handleAddIngredient = () => {
    if (ingredientInput) {
      setIngredients([...ingredients, ingredientInput]);
      setIngredientInput("");
    }
  };
  const handleDeleteIngredient = (ingredientToDelete: string) => {
    setIngredients((prevIngredients) =>
      prevIngredients.filter((ingredient) => ingredient !== ingredientToDelete)
    );
  };

  const handleDelete = (tagToDelete: string) => {
    setTags((prevTags) => prevTags.filter((tag) => tag !== tagToDelete));
  };

  return (
    <Box
      display="flex"
      justifyContent="center"
      alignItems="center"
      minHeight="100vh"
    >
      <Card sx={{ width: 600 }}>
        <CardContent>
          {recipe === null &&<Typography variant="h5" component="div" gutterBottom>
            {t('Create Recipe')}
          </Typography>}
          {recipe !== null &&<Typography variant="h5" component="div" gutterBottom>
            {t('Edit')}
          </Typography>}
          <TextField
            fullWidth
            variant="outlined"
            label={t('Title')}
            margin="normal"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
          />
          <Box sx={{ display: "flex", alignItems: "center", gap: 1 }}>
            <TextField
              fullWidth
              variant="outlined"
              label={t('Ingredient')}
              margin="normal"
              value={ingredientInput}
              onChange={(e) => setIngredientInput(e.target.value)}
            />
            <Button variant="contained" onClick={handleAddIngredient}>
              {t('Add')}
            </Button>
          </Box>
          <Box
            sx={{ display: "flex", gap: 1, flexWrap: "wrap", marginBottom: 2 }}
          >
            {ingredients.map((ingredient, index) => (
              <Chip
                key={index}
                label={ingredient}
                onDelete={() => handleDeleteIngredient(ingredient)}
              />
            ))}
          </Box>
          {/*tags*/}
          <Box sx={{ display: "flex", alignItems: "center", gap: 1 }}>
            <TextField
              fullWidth
              variant="outlined"
              label={t('Tag')}
              margin="normal"
              value={tagInput}
              onChange={(e) => setTagInput(e.target.value)}
            />
            <Button variant="contained" onClick={handleAddTag}>
              {t('Add')}
            </Button>
          </Box>
          <Box
            sx={{ display: "flex", gap: 1, flexWrap: "wrap", marginBottom: 2 }}
          >
            {tags.map((tag, index) => (
              <Chip
                key={index}
                label={tag}
                onDelete={() => handleDelete(tag)}
              />
            ))}
          </Box>
          <Box sx={{ display: "flex", gap: 2, marginTop: 2 }}>
            <TextField
              sx={{
                flex: 1,
              }}
              variant="outlined"
              label={t('Description')}
              value={description}
              multiline
              rows={4}
              onChange={(e) => setDescription(e.target.value)}
            />
            <Box
              sx={{
                flex: 1,
                display: "flex",
                flexDirection: "column",
                alignItems: "center",
                justifyContent: "center",
                border: "1px dashed grey",
                minHeight: "100%",
              }}
            >
              <Button
                variant="text"
                component="label"
                startIcon={<AddAPhotoIcon />}
              >
                {t('Upload Picture')}
                <input type="file" hidden onChange={handleUploadClick} />
              </Button>
            </Box>
          </Box>
          {imagePreview && (
            <Card>
              <CardMedia
                component="img"
                image={imagePreview}
                alt="Uploaded Image"
                sx={{ mt: 3, maxHeight: 300, maxWidth: '100%', objectFit: 'cover' }}
              />
            </Card>
          )}
          <Box display="flex" justifyContent="flex-end" marginTop={2}>
            {recipe === null &&<Button
              variant="contained"
              onClick={createRecipe}
              style={{ marginRight: "16px" }}
            >
              {t('Create')}
            </Button>}
            {recipe !== null && <Button
                variant="contained"
                onClick={updateRecipe}
                style={{ marginRight: "16px" }}
                >
              {t('Update')}
                </Button>}
            <Button variant="contained" onClick={handleClose}>
              {t('Cancel')}
            </Button>
          </Box>
        </CardContent>
      </Card>
    </Box>
  );
};

export default EditCard;
