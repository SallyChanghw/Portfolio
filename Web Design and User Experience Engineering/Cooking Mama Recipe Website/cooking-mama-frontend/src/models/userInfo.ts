import {Recipe} from "./recipe";
export interface UserInfo {
    userId: string,
    username: string,
    email: string,
    password: string,
    postedRecipes: Recipe[],
    favorites: Recipe[]
}