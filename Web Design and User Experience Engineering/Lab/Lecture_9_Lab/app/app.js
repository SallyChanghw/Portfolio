import cors from 'cors';
import express from 'express';
import mongoose from 'mongoose';
import registerRouter from './routes/index.js';
import models from './models/index.js';

const intialize = (app) =>{

    app.use(cors());
    app.use(express.json());
    app.use(express.urlencoded());
    mongoose.connect('mongodb+srv://sallychang:sally44338787@info6150.cpn6z4m.mongodb.net/coursedb?retryWrites=true&w=majority');
    registerRouter(app);

    // MongoDB connection

    // Intialize routes
}

export default intialize;