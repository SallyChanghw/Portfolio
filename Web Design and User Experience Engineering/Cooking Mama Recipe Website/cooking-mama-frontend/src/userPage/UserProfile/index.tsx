import { ReactElement, useEffect, useState } from "react";
import FavList from "../FavList";
import Button from "@mui/material/Button";
import TextField from "@mui/material/TextField";
import { Recipe } from "../../models/recipe";
import "../../dist/main.css";
import History from "../History";
import { useSelector } from "react-redux";
import { AppState } from "../../store";
import { useNavigate } from "react-router-dom";
import {useTranslation} from "react-i18next";

const UserProfile: React.FC = (): ReactElement => {
    const API_URL = "http://localhost:3001/userInfo";
    const API_URL2 = "http://localhost:3001/updateUserInfo";
    const navigate = useNavigate();
    const user = useSelector((state: AppState) => state["user"]);

    // child navigation
    const [currentPage, setCurrentPage] = useState("profile");
    const [originalUserData, setOriginalUserData] = useState({
        username: "",
        userId: "",
        email: "",
        password: "",
    });

    // TBD
    const [userInfoFavList, setUserInfoFavList] = useState<Recipe[]>([]);
    const [userInfoRecipe, setUserInfoRecipe] = useState<Recipe[]>([]);

    const [updatedUserData, setUpdatedUserData] = useState(originalUserData);
    const [confirmPassword, setConfirmPassword] = useState("");
    const [editMode, setEditMode] = useState(false);
    const { t } = useTranslation();
    useEffect(() => {
        const fetchUserInfo = async () => {
            try {
                const userId = user.userId;
                //TODO
                const response = await fetch(`${API_URL}?userId=${userId}`, {
                    method: "GET",
                    headers: {
                        "Content-Type": "application/json",
                    },
                });
                console.log("000");
                const data = await response.json();
                setOriginalUserData(data);
                console.log(data);
                setUpdatedUserData(data);
                setUserInfoFavList(data?.favorites);
            } catch (error) {
                console.error("Failed to fetch user information:", error);
            }
        };

        fetchUserInfo();
    }, []);

    const editClick = () => {
        setEditMode(true);
    };

    const cancelClick = () => {
        setEditMode(false);
        setConfirmPassword("");

        // Reset user data to original data
        setUpdatedUserData(originalUserData);
    };


    const handleUpdate = async (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();
        if (updatedUserData.password !== confirmPassword) {
            alert("Password and confirm password do not match");
            return;
        }

        try {
            const response = await fetch(API_URL2, {
                method: "PUT",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify({ ...updatedUserData, confirmPassword }),
            });
            const data = await response.json();
            console.log("Information successfully ", data);
            alert("User Information Update successfully");
            setEditMode(false);
            setOriginalUserData(originalUserData);
        } catch (error) {
            console.error("Failed to send data:", error);
        }
    };

    return (
        <div>
            <div className="card-wrapper22">
                <div className="card-title2">
                    <div className="search-title">Profile</div>
                    {currentPage === 'profile' ? (
                        <div>
                            <Button
                                size="small"
                                variant="outlined"
                                color="success"
                                sx={{
                                    // color: '#1EAE69',
                                    borderRadius: 10,
                                    // margin: 'auto',
                                    margin: "10px",
                                }}
                                onClick={() => setCurrentPage("history")}
                            >
                                {t('My Recipe')}
                            </Button>

                            <Button
                                size="small"
                                variant="outlined"
                                color="success"
                                sx={{
                                    // color: '#1EAE69',
                                    borderRadius: 10,
                                    // margin: 'auto',
                                    margin: "5px",
                                }}
                                onClick={() => setCurrentPage("favorites")}
                            >
                                {t('My Favorite')}
                            </Button>
                        </div>
                    ) : (
                        currentPage === 'favorites' ? (
                            <div>
                                <Button
                                    size="small"
                                    variant="outlined"
                                    color="success"
                                    sx={{
                                        // color: '#1EAE69',
                                        borderRadius: 10,
                                        // margin: 'auto',
                                        margin: "10px",
                                    }}
                                    onClick={() => setCurrentPage('history')}
                                >
                                    {t('My Recipe')}
                                </Button>

                                <Button
                                    size="small"
                                    variant="outlined"
                                    color="success"
                                    sx={{
                                        // color: '#1EAE69',
                                        borderRadius: 10,
                                        // margin: 'auto',
                                        margin: "5px",
                                    }}
                                    onClick={() => setCurrentPage('profile')}
                                >
                                    {t('My Profile')}
                                </Button>
                            </div>
                        ) : (
                            <div><Button
                                size="small"
                                variant="outlined"
                                color='success'
                                sx={{
                                    // width: '10%',
                                    // borderColor: '#1EAE69',
                                    borderRadius: 10,
                                    margin: '10px'
                                    // margin: 'auto',
                                    // display: 'block',
                                }}
                                onClick={() => setCurrentPage('profile')}
                            >
                                {t('My Profile')}
                            </Button>
                                <Button
                                    size="small"
                                    variant="outlined"
                                    color='success'
                                    sx={{
                                        borderRadius: 10,
                                        margin: '10px'
                                    }}
                                    onClick={() => setCurrentPage('favorites')}
                                >
                                    {t('My Favorite')}
                                </Button></div>
                        )
                    )}
                </div>
            </div>
            {currentPage === "profile" ? (
                <div className="card-wrapper22">
                    <div className="card-container2">
                        {!editMode && (
                            <Button
                                size="small"
                                variant="contained"
                                sx={{
                                    backgroundColor: "#1EAE69",
                                    // margin: 'auto',
                                    marginBottom: "5px",
                                }}
                                onClick={editClick}
                            >
                                {t('Edit')}
                            </Button>
                        )}
                        <form onSubmit={editMode ? handleUpdate : undefined}>
                            <div>
                                <TextField
                                    type="text"
                                    value={updatedUserData.username}
                                    onChange={(e) =>
                                        setUpdatedUserData({
                                            ...updatedUserData,
                                            username: e.target.value,
                                        })
                                    }
                                    disabled={!editMode}
                                    margin="normal"
                                    required
                                    fullWidth
                                    label={t('user name')}
                                    name="Name"
                                    autoFocus
                                    sx={{ width: "100%", marginRight: "10px" }}
                                ></TextField>
                            </div>
                            <div>
                                <TextField
                                    type="text"
                                    value={updatedUserData.email}
                                    onChange={(e) =>
                                        setUpdatedUserData({
                                            ...updatedUserData,
                                            email: e.target.value,
                                        })
                                    }
                                    disabled={true}
                                    margin="normal"
                                    required
                                    fullWidth
                                    label={t('Email Address')}
                                    name="Email"
                                    autoFocus
                                    sx={{ width: "100%", marginRight: "10px" }}
                                ></TextField>
                            </div>
                            <div>
                                <TextField
                                    type="password"
                                    value={updatedUserData.password}
                                    onChange={(e) =>
                                        setUpdatedUserData({
                                            ...updatedUserData,
                                            password: e.target.value,
                                        })
                                    }
                                    disabled={!editMode}
                                    margin="normal"
                                    required
                                    fullWidth
                                    label={t('Password')}
                                    name="Password"
                                    autoFocus
                                    sx={{ width: "100%", marginRight: "10px" }}
                                ></TextField>
                            </div>
                            {editMode && (
                                <div>
                                    <div>
                                        <TextField
                                            type="password"
                                            value={confirmPassword}
                                            onChange={(e) => setConfirmPassword(e.target.value)}
                                            margin="normal"
                                            required
                                            fullWidth
                                            label={t('Confirm Password')}
                                            name="confirmPassword"
                                            autoFocus
                                            sx={{ width: "100%", marginRight: "10px" }}
                                        ></TextField>
                                    </div>
                                    <Button
                                        size="small"
                                        variant="contained"
                                        sx={{
                                            backgroundColor: "#1EAE69",
                                            marginTop: "20px",
                                            marginRight: "10px",
                                        }}
                                        onClick={cancelClick}
                                    >
                                        {t('Cancel')}
                                    </Button>
                                    <Button
                                        size="small"
                                        type="submit"
                                        variant="contained"
                                        sx={{
                                            backgroundColor: "#1EAE69",
                                            marginTop: "20px",
                                        }}
                                    >
                                        {t('Confirm')}
                                    </Button>
                                </div>
                            )}
                        </form>
                    </div>
                </div>
            ) : currentPage === "history" ? (
                <History />
            ) : (
                <FavList />
            )}
        </div>
    );
};

export default UserProfile;
