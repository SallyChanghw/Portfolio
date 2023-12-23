import express from 'express';
import { getAllRecipes, postRecipe, getRecipeById, addRecipe2Fav, removeRecipeFromFav, updateRecipe, createNewPost } from '../controllers/recipesController.js';

const router = express.Router();

router.route('/homepage').get(getAllRecipes);
router.route('/addRecipe').post(postRecipe);
router.route('/showRecipe').get(getRecipeById);
router.route('/addRecipe2Fav').post(addRecipe2Fav);
router.route('/removeRecipeFromFav').post(removeRecipeFromFav);

router.route('/updateRecipe').put(updateRecipe);

router.route("/createNewPost").post(createNewPost);

export default router;
