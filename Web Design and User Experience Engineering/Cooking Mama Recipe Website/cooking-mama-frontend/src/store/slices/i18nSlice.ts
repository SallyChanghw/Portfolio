import { PayloadAction, createSlice } from '@reduxjs/toolkit';

export type i18nState = {
    language: string
};
const initialState: i18nState = {
    language: 'en'
};
export const i18nSlice = createSlice({
    name: 'i18n',
    initialState: initialState,
    reducers: {
        setLanguage(state, action: PayloadAction<string>) {
            state.language = action.payload;
        }
    }
});

export const { setLanguage } = i18nSlice.actions;
export default i18nSlice.reducer;