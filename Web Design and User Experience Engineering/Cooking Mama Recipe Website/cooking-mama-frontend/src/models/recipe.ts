export interface Recipe {
    recipeId: string,
    image: string,
    title: string,
    tags: string[],
    ingredients: string[],
    description: string,
    author: string;
}