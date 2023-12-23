import React, { ReactElement, useState } from "react";
import NavBar from "../../homepage/NavBar";
import "../../scss/main.scss"
import {UserInfo} from "../../models/userInfo";
import {useDispatch} from "react-redux";
import {setUser} from "../../store/slices/userSlice";
import { useSelector } from "react-redux";
import {AppState} from "../../store";
import { useNavigate } from "react-router-dom";
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Box from '@mui/material/Box';
import Container from '@mui/material/Container';
import { createTheme, ThemeProvider } from '@mui/material/styles';
import Typography from "@mui/material/Typography";
import { Link as RouterLink } from 'react-router-dom';
import { useTranslation } from 'react-i18next';
const Login: React.FC = (): React.ReactElement => {
  const API_URL = "http://localhost:3001/login";
  const defaultTheme = createTheme();
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [errorMessage, setErrorMessage] = useState("");
  const dispatch = useDispatch();
  const user = useSelector((state: AppState) => state["user"]);
  const navigate = useNavigate();
  const { t } = useTranslation();
  const handleSubmit = async (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    try {
      const response = await fetch(API_URL, {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({username, password}),
      });
      // get the response from the server
      const data = await response.json();
      if (data.statusMessage === "Login Success") {
        console.log("Login successfully");
        const userInfo: UserInfo = {
          userId: data.userInfo.userId,
          username: data.userInfo.username,
          email: data.userInfo.email,
          password: data.userInfo.password,
          postedRecipes: data.userInfo.postedRecipes,
          favorites: data.userInfo.favorites,
        }
        dispatch(setUser(userInfo));
        navigate('/homepage');
      } else if (data.statusMessage === "Wrong Username or Password") {
          //check if the username and password are correct
        console.log("Wrong Username or Password");
        setUsername("");
        setPassword("");
        setErrorMessage("Wrong Username or Password");
      }
    } catch (error) {
      console.error("Failed to send data:", error);
    }

  };
  return (
      <>
        <NavBar></NavBar>
        <ThemeProvider theme={defaultTheme}>
          <Container component="main" maxWidth="xs">
            <Box
                sx={{
                  marginTop: 8,
                  display: 'flex',
                  flexDirection: 'column',
                  alignItems: 'center',
                }}
            >
              <div className="form-title">{t('Log In')}</div>
              <Box component="form" onSubmit={handleSubmit} noValidate sx={{ mt: 1 }}>
                <TextField
                    margin="normal"
                    required
                    fullWidth
                    id="username"
                    label= {t('user name')}
                    name="username"
                    autoFocus
                    value={username}
                    onChange={(e) => setUsername(e.target.value)}
                />
                <TextField
                    margin="normal"
                    required
                    fullWidth
                    name="password"
                    label={t('Password')}
                    type="password"
                    id="password"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                />
                {errorMessage && <div style={{color: 'red'}}>{errorMessage}</div>}
                <Button
                    type="submit"
                    variant="contained"
                    sx={{
                      mt: 10,
                      mb: 2,
                      width: '30%',
                      backgroundColor: '#1EAE69',
                      margin: 'auto',
                      display: 'block',
                    }}
                >
                  {t('Log In')}
                </Button>
                <Typography variant="body2" color="textSecondary" align="center" sx={{ mt: 2 }}>
                  {t('Not our member?')}{" "}
                  <RouterLink to="/signup" style={{ textDecoration: 'none' }}>
                    {t('Register')}
                  </RouterLink>
                </Typography>
              </Box>
            </Box>
          </Container>
        </ThemeProvider>
      </>
  );
  //
};

export default Login;
