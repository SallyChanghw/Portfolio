import { Recipe } from '../models/recipes.js';
import { UserInfo} from "../models/userInfo.js";
//get all recipes
export const getRecipes = async (req, res) => {
    const recipeList = await Recipe.find({});
    return recipeList;
};
//get recipe by id
export const getRecipeById = async (req, res) => {
    const recipeId = req.body.recipeId;
    const recipe = await Recipe.findOne({recipeId: recipeId});
    return recipe;
};
//add recipe
export const addRecipe = async (req, res) => {
    const recipe = await Recipe.create(req.body.recipe);
    const user = await UserInfo.findOne({userId: req.body.user.userId});
    user.postedRecipes.push(recipe._id);
    await user.save();
    return recipe;
}
//add recipe to favorites
export const addRecipe2Fav = async (req, res) => {
    const recipeId = req.body.recipeId;
    const userId = req.body.userId;
    const recipe = await Recipe.findOne({recipeId: recipeId});
    const user = await UserInfo.findOne({userId: userId});
    user.favorites.push(recipe._id);
    await user.save();
    const userData = await UserInfo.findOne({userId: userId}).populate('favorites');
    return userData;
};
//remove recipe from favorites
export const removeRecipeFromFav = async (req, res) => {
    const recipeId = req.body.recipeId;
    const userId = req.body.userId;
    const recipe = await Recipe.findOne({recipeId: recipeId});
    const user = await UserInfo.findOne({userId: userId});
    user.favorites.pull(recipe._id);
    await user.save();
    return user;
};
//update recipe
export const updateRecipe =async (req, res) =>{
    const recipeId = req.body.recipeId;
    const oldRecipe = req.body;
    const recipe = await Recipe.findOneAndUpdate({ recipeId: recipeId }, oldRecipe,{ new: true }).exec();
    return recipe;
}

// createPost with different themes
export const createPost = async (req, res) => {
    const userId = req.body.userId;
    const theme = req.body.theme;
    const recipeBody = req.body.recipe;
    const recipe = await Recipe.create(recipeBody);
    const userInfo = await UserInfo.findOne({userId: userId});
    const postedList = userInfo.postedRecipes;
    postedList.unshift(recipe);

    await UserInfo.findOneAndUpdate({userId: userId}, {
        $set: {
            postedRecipes: postedList
        }
    });
    if (theme === "homepage") {
        return await Recipe.find({});
    } else {
        const userInfo = await UserInfo.findOne({userId: userId}).populate('postedRecipes');
        return userInfo.postedRecipes;
    }
}