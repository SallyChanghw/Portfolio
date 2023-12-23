import { UserInfo } from '../models/userInfo.js';
import {parse} from "dotenv";
// get user id
export const getUserId = async () => {
    let userId;
    const userInfo = await UserInfo.find({});
    if (userInfo.length === 0) {
        userId = 0;
    } else {
        userId = (parseInt(userInfo[userInfo.length - 1].userId) + 1).toString();
    }
    return userId;
};

// connect to posted recipe history
export const getUserInfo = async (req, res) => {
    const userId = req.query.userId;
    const userInfo = await UserInfo.findOne({userId: userId}).populate('postedRecipes');
    console.log(userInfo);
    return userInfo;
}

// connect to favorites recipes
export const getUserInfoFavorites = async (req, res) => {
    const userId = req.query.userId;
    const userInfo = await UserInfo.findOne({userId: userId}).populate('favorites');
    return userInfo;
}
// add user info
export const addUserInfo = async (req, res) => {
    const userId = await getUserId();
    req.body.userId = userId;
    const userInfo = await UserInfo.create(req.body);
    return userInfo;
}
// update user info
export const updateUserInfo = async (req, res) => {
    const userId = req.body.userId;
    const oldInfo= req.body;
    const userInfo = await UserInfo.findOneAndUpdate({ userId: userId}, oldInfo,{ new: true }).exec();
    return userInfo;
}
// sign up
export const signUp = async (req, res) => {
    const email = req.body.email;
    const userInfo = await UserInfo.findOne({email: email});
    return userInfo;

}
// login
export const login = async (req, res) => {
    const userName = req.body.username;
    const password = req.body.password;
    const userInfo = await UserInfo.findOne({username: userName});
    if (userInfo.password === password) {
        return userInfo;
    } else {
        return null;
    }
}