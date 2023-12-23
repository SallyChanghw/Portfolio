import mongoose from "mongoose";
import {Recipe} from "./recipes.js";

const userInfoSchema = new mongoose.Schema({
    userId: {
        type: String,
        required: true,
        unique: true
    },
    username: {
        type: String,
        required: true
    },
    email:{
        type: String,
        required: true
    },
    password:{
        type:String,
        required: true
    },
    postedRecipes: {
        type: [{
            type: mongoose.Schema.Types.ObjectId,
            ref: 'Recipe'
        }],
    },
    favorites: {
        type: [{
            type: mongoose.Schema.Types.ObjectId,
            ref: 'Recipe'
        }],
    }
});
const UserInfo = mongoose.model('UserInfo', userInfoSchema);
export { UserInfo };
