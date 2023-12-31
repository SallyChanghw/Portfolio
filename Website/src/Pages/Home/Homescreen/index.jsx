import HeroSection from "../HeroSection";
import MySkills from "../MySkills";
import AboutMe from "../AboutMe";
import MyPortfolio from "../MyPortfolio";
import ContactMe from "../ContactMe";
import Footer from "../Footer";
import MyExperience from "../MyExperience"

export default function Home(){
    return(
        <>
            <HeroSection />
            <MySkills/>
            <AboutMe/>
            <MyExperience/>
            <MyPortfolio/>
            <ContactMe/>
            <Footer/>
        </>
    )
}