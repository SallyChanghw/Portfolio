import React, { ReactElement } from "react";
import Stack from "@mui/material/Stack";
import SearchIcon from "@mui/icons-material/Search";
import HomeIcon from "@mui/icons-material/Home";
import CreateIcon from "@mui/icons-material/Create";
import AccountCircleIcon from "@mui/icons-material/AccountCircle";
import { createTheme, ThemeProvider } from "@mui/material/styles";
import { useNavigate } from "react-router-dom";
import "../../dist/main.css";
import EditCard from "../../recipePage/EditCard";
import { Box, Button, Modal, Typography } from "@mui/material";
import LanguageIcon from '@mui/icons-material/Language';
import { useDispatch, useSelector } from "react-redux";
import { AppState } from "../../store";
import { useTranslation } from 'react-i18next';
import i18n from "../../index";
import { setLanguage } from "../../store/slices/i18nSlice";

// declare self-made theme styles
declare module "@mui/material/styles" {
  interface Palette {
    ochre: Palette["primary"];
  }

  interface PaletteOptions {
    ochre?: PaletteOptions["primary"];
  }
}

declare module "@mui/material/Button" {
  interface ButtonPropsColorOverrides {
    ochre: true;
  }
}

const theme = createTheme({
  palette: {
    ochre: {
      main: "#000000",
    },
  },
});

const NavBar: React.FC = (): ReactElement => {
  const { t } = useTranslation();
  const navigate = useNavigate();
  const dispatch = useDispatch();
  const { language } = useSelector((state: any) => state.i18n);
  const [open, setOpen] = React.useState(false);
  const handleOpen = () => setOpen(true);
  const handleClose = () => {
    setOpen(false);
  };
  const user = useSelector((state: AppState) => state.user);
  return (
    <ThemeProvider theme={theme}>
      <div className="navBar-container">
        <div className="navBar-title">Cooking Mama</div>
        <Stack direction="row" spacing={3} className="navBar-buttons">
          {
            language === 'en' ? (
              <Button size="large"
                color="ochre"
                startIcon={<LanguageIcon />}
                onClick={() => { i18n.changeLanguage('cn'); dispatch(setLanguage('cn')) }}>
                language
              </Button>
            ) : (
              <Button size="large"
                color="ochre"
                startIcon={<LanguageIcon />}
                onClick={() => { i18n.changeLanguage('en'); dispatch(setLanguage('en')) }}>
                language
              </Button>
            )
          }
          <Button
            size="large"
            color="ochre"
            startIcon={<SearchIcon />}
            onClick={() => navigate("/search")}
          >
            {t('Search')}
          </Button>
          <Button
            size="large"
            color="ochre"
            startIcon={<HomeIcon />}
            onClick={() => navigate("/homepage")}
          >
            {t('Home')}
          </Button>
          <Button
            size="large"
            color="ochre"
            startIcon={<CreateIcon />}
            onClick={() => {
              if (user.userId === "") {
                alert("Please login first");
                navigate("/login");
                return;
              }
              handleOpen();
            }}
          >
            {t('Create')}
          </Button>
          <Modal
            open={open}
            onClose={handleClose}
            aria-labelledby="modal-modal-title"
            aria-describedby="modal-modal-description"
          >
            <Box>
              {/* open create recipe card */}
              <EditCard recipe={null} handleClose={handleClose} />
            </Box>
          </Modal>
          <Button
            size="large"
            color="ochre"
            startIcon={<AccountCircleIcon />}
            onClick={() => {
              if (user.userId === "") {
                alert("Please login first");
                navigate("/login");
                return;
              }
              navigate("/userProfile");
            }}
          >
            {t('Profile')}
          </Button>
        </Stack>
      </div>
    </ThemeProvider>
  );
};

export default NavBar;
