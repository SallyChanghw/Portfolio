import { configureStore } from "@reduxjs/toolkit";
import { userSlice } from "./slices/userSlice";
import {recipeSlice} from "./slices/recipeSlice";
import { i18nSlice } from "./slices/i18nSlice";

export const store = configureStore({
    reducer: {
        [userSlice.name]: userSlice.reducer,
        [recipeSlice.name]: recipeSlice.reducer,
        [i18nSlice.name]: i18nSlice.reducer
    }
});
export type AppStore = typeof store;
export type AppState = ReturnType<AppStore['getState']>;
export type AppDispatch = typeof store.dispatch;