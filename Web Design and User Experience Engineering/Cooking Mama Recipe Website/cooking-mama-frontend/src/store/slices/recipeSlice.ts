import { PayloadAction, createSlice } from '@reduxjs/toolkit';
import { Recipe } from '../../models/recipe';

export type RecipeState = {
    recipeList: Recipe[];
};
const initialState: RecipeState = {
    recipeList: []
};
export const recipeSlice = createSlice({
    name: 'recipe',
    initialState: initialState,
    reducers: {
        setRecipeList(state, action: PayloadAction<Recipe[]>) {
            state.recipeList = action.payload;
        },
        addNewRecipe(state, action: PayloadAction<Recipe>) {
            state.recipeList.unshift(action.payload);
        }
    }
});

export const { setRecipeList, addNewRecipe } = recipeSlice.actions;
export default recipeSlice.reducer;