import * as userService from '../services/userInfoService.js';
const getUserInfo = async (req, res) => {
    try {
        console.log(req.query.userId);
        const userInfo = await userService.getUserInfo(req, res);
        res.status(200).json(userInfo);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
}

const getUserInfoFavorites = async (req, res) => {
    try {
        const userInfo = await userService.getUserInfoFavorites(req, res);
        res.status(200).json(userInfo);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
}

const addUserInfo = async (req, res) => {
    try {
        const userInfo = await userService.addUserInfo(req, res);
        res.status(200).json(userInfo);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
}

const updateUserInfo = async (req, res) => {
    try {
        const userInfo = await userService.updateUserInfo(req, res);
        res.status(200).json(userInfo);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
}

// add more status message to show api result
const signUp = async (req, res) => {
    try {
        const userInfo = await userService.signUp(req, res);
        if(userInfo === null){
            try {
                const user = await userService.addUserInfo(req, res);
                if(user != null){
                    res.json({ statusMessage: "Signup Success"});
                }
            } catch (err) {
                res.json({ statusMessage: "network error1"});
            }
        }else if(userInfo != null){
            res.json({ statusMessage: "email already exists"});
        }
    } catch (err) {
        res.json({ statusMessage: "network error"});
    }
}

const login = async (req, res) => {
    try {
        console.log(req.body.username);
        const userInfo = await userService.login(req, res);
        if (userInfo !== null) {
            res.status(200).json({
                userInfo: userInfo,
                statusMessage: "Login Success"
            });
        } else {
            res.status(200).json({
                statusMessage: "Wrong Username or Password"
            });
        }
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
}

export { getUserInfo,getUserInfoFavorites,addUserInfo,updateUserInfo, signUp, login};