import React, { ReactElement, useState, useEffect } from "react";
import { Link } from "react-router-dom"; 
import { Recipe } from "../../models/recipe";
import IconButton from "@mui/material/IconButton";
import { useNavigate } from "react-router-dom";
import { dividerClasses } from "@mui/material";
import EditCard from "../../recipePage/EditCard";
import EditIcon from '@mui/icons-material/Edit';
import {Box, Button, Modal, Typography} from '@mui/material';
import {useSelector} from "react-redux";
import {AppState} from "../../store";
import {useTranslation} from "react-i18next";
const MYRECIPE_PAGE_API = 'http://localhost:3001/userInfo';



const History: React.FC = (): ReactElement => {
    const [selectedRecipe, setSelectedRecipe] = useState<Recipe | null>(null);
    const navigate = useNavigate();
    const [myRecipe, setMyRecipe] = useState<Recipe[]>([]);
    const user = useSelector((state: AppState) => state["user"]);
    const [open, setOpen] = React.useState(false);
    const { t } = useTranslation();
    const handleClose = async () => {
        setOpen(false);
        await fetchMyRecipe();
    };
    // open modal
    const handleOpen = () => setOpen(true);
    const fetchMyRecipe = async ()  => {
        try {
            const userId = user.userId;
            const response = await fetch(`${MYRECIPE_PAGE_API}?userId=${userId}`, {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json',
                }
            });
            const data = await response.json();
            const myRecipe = data.postedRecipes;
            setMyRecipe(myRecipe);
        } catch (error) {
            console.error('Error fetching my recipes:', error);
        }
    }

    useEffect(() => {
        fetchMyRecipe();
    }, []);

    const handleUpdateClick = (recipe: Recipe) => {
        setSelectedRecipe(recipe);
        handleOpen();
    };



    const myRecipeEntries = myRecipe.map(recipe => {
        return (
            <div className="card-container1" key={recipe.recipeId}>
                <div className="recipe-image1">
                    <img src={recipe.image} alt="recipe imgae" />
                </div>
                <div className="recipe-info1">
                    <div className="recipe-title1">{recipe.title}</div>
                    <IconButton className="recipe-fav" color='success'  onClick={() => {handleUpdateClick(recipe);}}><EditIcon /></IconButton>
                </div>
            </div>
        );
    });

   
    return (
        <div>
            <div className="list-wrapper">
                <div className="card-wrapper1">
                    {myRecipeEntries}
                </div>
            </div>
            <Modal
                open={open}
                onClose={handleClose}
                aria-labelledby="modal-modal-title"
                aria-describedby="modal-modal-description"
            >
                <Box>
                    <EditCard recipe={selectedRecipe} handleClose={handleClose} />
                </Box>
            </Modal>
        </div>
    );
}

export default History;