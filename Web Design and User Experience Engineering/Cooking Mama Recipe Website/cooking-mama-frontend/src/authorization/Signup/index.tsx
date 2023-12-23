import React, {useEffect} from 'react';
import Button from '@mui/material/Button';
import CssBaseline from '@mui/material/CssBaseline';
import TextField from '@mui/material/TextField';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import NavBar from '../../homepage/NavBar';
import { createTheme, ThemeProvider } from '@mui/material/styles';
import { useNavigate } from "react-router-dom";
import '../../dist/main.css';
import { useTranslation } from 'react-i18next';
const Signup: React.FC = (): React.ReactElement => {
    const defaultTheme = createTheme();
    const [emailError, setEmailError] = React.useState('')
    const [passwordError, setPasswordError] = React.useState('');
    const API_URL = 'http://localhost:3001/signup';
    const navigate = useNavigate();
    const { t } = useTranslation();
    const handleSubmit = async (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();
        setPasswordError('');
        setEmailError('');
        const formData = new FormData(event.currentTarget);
        const formDataObject = {
            username: formData.get('username'),
            email: formData.get('email'),
            password: formData.get('password'),
        };
        if(formData.get('password') !== formData.get('password comfirmation')){
            setPasswordError('Password does not match');
            return;
        }
        try {
            const response = await fetch(API_URL, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(formDataObject),
            });
            const responseData = await response.json();
            if(responseData.statusMessage === 'Signup Success') {
                console.log('Signup successfully');
                navigate('/login');
            }else if(responseData.statusMessage === 'email already exists'){
                setEmailError('Email already exists');
            }
        } catch (error) {
            console.error('Failed to send data:', error);
        }
    };



    return (
        <>
        <NavBar></NavBar>
        <ThemeProvider theme={defaultTheme}>
            <Container component="main" maxWidth="xs">
                <CssBaseline />
                <Box
                    sx={{
                        marginTop: 8,
                        display: 'flex',
                        flexDirection: 'column',
                        alignItems: 'center',
                    }}
                >
                    <div className="form-title">
                        {t('Register')}
                    </div>
                    <Box component="form" onSubmit = {handleSubmit} noValidate sx={{ mt: 1 }}>
                        <TextField
                            margin="normal"
                            required
                            fullWidth
                            id="username"
                            label={t('user name')}
                            name="username"
                            autoFocus
                        />
                        <TextField
                            margin="normal"
                            required
                            fullWidth
                            id="email"
                            label={t('Email Address')}
                            name="email"
                            autoComplete="email"
                            autoFocus
                        />
                        {
                            emailError && <div style={{color: 'red'}}>{emailError}</div>
                        }
                        <TextField
                            margin="normal"
                            required
                            fullWidth
                            name="password"
                            label={t('Password')}
                            type="password"
                            id="password"
                        />
                        <TextField
                            margin="normal"
                            required
                            fullWidth
                            name="password comfirmation"
                            label={t('Confirm Password')}
                            type="password"
                            id="password comfirmation"
                        />
                        {
                            passwordError && <div style={{color: 'red'}}>{passwordError}</div>
                        }
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
                            {t('Register')}
                        </Button>
                    </Box>
                </Box>
            </Container>
        </ThemeProvider>
        </>

    );
}

export default Signup;

