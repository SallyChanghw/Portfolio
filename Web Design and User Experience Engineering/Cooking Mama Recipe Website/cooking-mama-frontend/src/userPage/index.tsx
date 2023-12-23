import { ReactElement } from "react";
import UserProfile from "./UserProfile";
import NavBar from "../homepage/NavBar";

const UserPage: React.FC = (): ReactElement => {
    return (
        <div>
            <NavBar></NavBar>
            <UserProfile></UserProfile>
        </div>
    )
}

export default UserPage;