import mongoose from 'mongoose';

// get author info from user model
const recipesSchema = new mongoose.Schema({
    recipeId: {
        type: String,
        required: true,
        unique: true
    },
    image: {
        type: String,
    },
    title: {
        type: String,
        required: true,
    },
    tags: {
        type: [String],
    },
    ingredients: {
        type: [String],
    },
    description: {
        type: String,
        required: true,
    },
    author: {
        type: String,
        required: true
    }

});

const Recipe = mongoose.model('Recipe', recipesSchema);
export  { Recipe };