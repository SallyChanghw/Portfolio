import { PayloadAction, createSlice } from '@reduxjs/toolkit';
import {UserInfo} from "../../models/userInfo";

export type UserState = UserInfo;
const initialState: UserState = {
    userId: '',
    username: '',
    email: '',
    password: '',
    postedRecipes: [],
    favorites: []
}
export const userSlice = createSlice({
    name: 'user',
    initialState: initialState,
    reducers: {
        setUser(state, action: PayloadAction<UserInfo>) {
            return action.payload;
        }
    }
});

export const { setUser } = userSlice.actions;
export default userSlice.reducer;