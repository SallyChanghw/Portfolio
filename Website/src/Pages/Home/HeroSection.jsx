export default function HeroSection(){
    return(
        <section id="heroSection" className="hero-section">
            <div className="hero-section-content-box">
                <div className="hero-section-content">
                    <p className="section-title">Hi! I'm Sally</p>
                    <h1 className="hero-section-title">
                        <span className="hero-section-title-color">Graduate Student</span>{""}
                    </h1>
                    <p className="hero-section-description">
                        Pursuing a Master's degree in Information System at Northeastern University!
                        <br />Seeking internship opportunities to leverage my skills
                    </p>
                </div>
                <a href="https://linkedin.com/in/chinchun-chang-94a38524a" target="_blank">
                    <button className="btn btn-primary">🔗 Get In Touch</button>
                </a>
            </div>
            <div className="hero-section-img">
                <img src="./img/hero_img.png" alt="Hero Section" />
            </div>
        </section>
    )
}