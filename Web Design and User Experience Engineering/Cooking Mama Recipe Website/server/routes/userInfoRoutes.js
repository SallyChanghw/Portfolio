import express from "express";
import {getUserInfo,addUserInfo,getUserInfoFavorites,updateUserInfo, signUp, login} from "../controllers/userInfoController.js";
const router = express.Router();
router.route("/userInfo").get(getUserInfo);
router.route("/addUserInfo").post(addUserInfo);
router.route("/userInfoFavorites").get(getUserInfoFavorites);

router.route("/updateUserInfo").put(updateUserInfo);

router.route("/signup").post(signUp);
router.route("/login").post(login);

export default router;