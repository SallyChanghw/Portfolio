import * as recipeService from '../services/recipesService.js';
// get all recipes
const getAllRecipes = async (req, res) => {
    try {
        const recipeList = await recipeService.getRecipes(req, res);
        res.status(200).json(recipeList);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
};
// add recipe
const postRecipe = async (req, res) => {
    try {
        const recipe = await recipeService.addRecipe(req, res);
        res.status(200).json(recipe);
    } catch (err) {
        res.status(400).json({ message: err.message });
    }
}

const getRecipeById = async (req, res) => {
    try {
        const recipe = await recipeService.getRecipeById(req, res);
        res.status(200).json(recipe);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
}
// add recipe to favorites
const addRecipe2Fav = async (req, res) => {
    try {
        const user = await recipeService.addRecipe2Fav(req, res);
        res.status(200).json(user);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
}
// remove recipe from favorites
const removeRecipeFromFav = async (req, res) => {
    try {
        const user = await recipeService.removeRecipeFromFav(req, res);
        res.status(200).json(user);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
}

const updateRecipe = async (req, res) => {
    try {
        const user = await recipeService.updateRecipe(req, res);
        res.status(200).json(user);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
}
// createPost with different themes
const createNewPost = async (req, res) => {
    try {
        const recipeList = await recipeService.createPost(req, res);
        res.status(200).json(recipeList);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
}

export { getAllRecipes, postRecipe, getRecipeById,addRecipe2Fav,removeRecipeFromFav, updateRecipe, createNewPost};
