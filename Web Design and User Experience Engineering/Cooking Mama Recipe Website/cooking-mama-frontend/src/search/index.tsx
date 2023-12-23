import { ReactElement, useEffect, useState } from "react";
import Feed from "../homepage/Feed";
import Search from "./Search";
import NavBar from "../homepage/NavBar";
import { Recipe } from "../models/recipe";
import { useTranslation } from 'react-i18next';
import RecipeCard from "../homepage/Feed/RecipeCard";

const HOME_PAGE_API = 'http://localhost:3001/homepage';

const SearchPage: React.FC = (): ReactElement => {
    const [recipeList, setRecipeList] = useState<Recipe[]>([]);
    const [searchedRecipeList, setSearchedRecipeList] = useState<Recipe[]>([]);
    const [isSearchPerformed, setIsSearchPerformed] = useState(false);
    const {t} = useTranslation("common");

    const fetchRecipeList = async () => {
        try {
            const response = await fetch(HOME_PAGE_API, {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json',
                }
            });
            const data = await response.json();
            setRecipeList(data);
        } catch (error) {
            console.error('Failed to send data:', error);
        }
    }

    const handleSearch = (query: string) => {

        //Edit
        if (query.trim() === "") {
            setSearchedRecipeList([]);
            setIsSearchPerformed(false);
        }
        else {
            const filteredList = recipeList.filter(recipe =>
                recipe.title.toLowerCase().includes(query.toLowerCase()) ||
                recipe.tags.some(tag => tag.toLowerCase().includes(query.toLowerCase())) ||
                recipe.ingredients.some(ingredient => ingredient.toLowerCase().includes(query.toLowerCase())) ||
                recipe.description.toLowerCase().includes(query.toLowerCase())
            );
            setSearchedRecipeList(filteredList);
            setIsSearchPerformed(true);
        }
    }

    useEffect(() => {
        fetchRecipeList();
    }, []);

    return (
        <div>
            <NavBar />
            <div className="search-title">{t('Search for recipes')}</div>
            <Search onSearch={handleSearch} />
            {isSearchPerformed && (
                <div>
                    {searchedRecipeList.length ? (
                        <div>
                            <div className="result-title">{t("Results")}</div>
                            <div className="feed-list-container">
                                {searchedRecipeList.map((recipe) => {
                                    return <RecipeCard recipe={recipe} />;
                                })}
                            </div>
                        </div>
                    ) : (
                        <div className="result-container">No Result, try another keyword!</div>
                    )}

                </div>
            )}
        </div>
    )
}

export default SearchPage;