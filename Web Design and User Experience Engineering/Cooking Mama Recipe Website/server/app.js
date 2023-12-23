import express from 'express';
import recipesRoutes from './routes/recipesRoutes.js';
import userInfoRoutes from './routes/userInfoRoutes.js';
import connectDB from './db/connect.js';
import dotenv from 'dotenv';
import cors from 'cors';

dotenv.config();

const app = express();

// Middleware
app.use(cors());
app.use(express.json({ limit: '100mb' }));
app.use(express.urlencoded({ limit: '100mb', extended: true }));


// Routes
app.use('/', recipesRoutes);
app.use('/', userInfoRoutes);

const port = 3001;
const start = async () => {
    try {
        await connectDB(process.env.MONGO_URI);
        app.listen(port, () => console.log(`Server is listening on port ${port}`));
    } catch (error) {
        console.log(error);
    }
};

start();
