import { ReactElement, useEffect, useState } from "react";
import NavBar from "./NavBar";
import Feed from "./Feed";
import EditCard from "../recipePage/EditCard";
import {Box, Button, Modal, Typography} from '@mui/material';
import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { setRecipeList } from "../store/slices/recipeSlice";
const HOME_PAGE_API = 'http://localhost:3001/homepage';

const HomePage: React.FC = (): ReactElement => {
    const {recipeList} = useSelector((state: any) => state.recipe);
    // const [recipeList, setRecipeList] = useState([]);
    const [open, setOpen] = React.useState(false);
    const dispatch = useDispatch();

    const handleOpen = () => setOpen(true);
    const handleClose = () => {
        setOpen(false);
        fetchRecipeList();
    };
    const fetchRecipeList = async () => {
        try {
            const response = await fetch(HOME_PAGE_API, {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json',
                }
            });
            const data = await response.json();
            dispatch(setRecipeList(data));
        } catch (error) {
            console.error('Failed to send data:', error);
        }
    }

    // auto fetch recipe list info once enter homepage
    useEffect(() => {
        fetchRecipeList();
    }, []);

    return (
        <div>
            <NavBar></NavBar>
            <Feed recipeList={recipeList}></Feed>
            <Modal
                open={open}
                onClose={handleClose}
                aria-labelledby="modal-modal-title"
                aria-describedby="modal-modal-description"
            >
                <Box >
                    <EditCard recipe={null} handleClose={handleClose} />
                </Box>
            </Modal>
        </div>
    )
}

export default HomePage;