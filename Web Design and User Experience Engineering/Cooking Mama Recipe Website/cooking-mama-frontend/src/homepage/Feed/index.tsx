import { ReactElement } from "react";
import RecipeCard from "./RecipeCard";
import "../../dist/main.css";
import { Recipe } from "../../models/recipe";
import { useTranslation } from "react-i18next";
interface FeedProps {
    recipeList: Recipe[];
}

const Feed: React.FC<FeedProps> = (props: FeedProps): ReactElement => {
    const { recipeList } = props;
    const {t} = useTranslation();
    return (
        <div>
            <div className="feedlist-title">{t('Popular Recipe')}</div>
            {/* loop for feed list cards */}
            <div className="feed-list-container">
                {recipeList.map((recipe) => {
                    return <RecipeCard recipe={recipe} />;
                })}
            </div>
        </div>
    );
};

export default Feed;
