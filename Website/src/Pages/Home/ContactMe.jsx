import React, {useRef} from "react";
import emailjs from '@emailjs/browser';


export default function ContactMe(){
    const form = useRef();

    const sendEmail = (e) => {
        e.preventDefault();
    
        emailjs.sendForm('service_40zsbjn', 'template_g2p2dfa', form.current, '5z8NoxgWt_tGkCT7v')
          .then((result) => {
              console.log(result.text);
          }, (error) => {
              console.log(error.text);
          });
          alert("Message Sent Successfully!");
          e.target.reset();
      };


    return(
        <section id="Contact" className="contact-section">
            <div className="sub-title">
                <h2>Contact Me</h2>
                <p className="text-lg">
                    Please fill up the form to reach out me!
                </p>
            </div>
            <form className="contact-form-container" onSubmit={sendEmail} ref={form}>
                <div className="container">
                    <label htmlFor="first-name" className="contact-label">
                        <span className="text-md">First Name</span>
                        <input
                            type="text"
                            className="contact-input text-md"
                            name="first-name"
                            id="first-name"
                            required
                        />
                    </label>
                    <label htmlFor="last-name" className="contact-label">
                        <span className="text-md">Last Name</span>
                        <input
                            type="text"
                            className="contact-input text-md"
                            name="last-name"
                            id="last-name"
                            required
                        />
                    </label>
                    <label htmlFor="email" className="contact-label">
                        <span className="text-md">Email</span>
                        <input
                            type="email"
                            className="contact-input text-md"
                            name="email"
                            id="email"
                            required
                        />
                    </label>
                </div>
                <label htmlFor="title" className="contact-label">
                    <span className="text-md">Title</span>
                        <input
                            type="text"
                            className="contact-input text-md"
                            name="title"
                            id="title"
                            required
                        />
                </label>
                <label htmlFor="message" className="contact-label">
                    <span className="text-md">Message</span>
                    <textarea
                        className="contact-input text-md"
                        name="message"
                        id="message"
                        rows="4"
                        placeholder="Type your message..."
                        required
                    />
                </label>
                <label htmlFor="checkbox" className="checkbox-label">
                    <input type="checkbox" required name="checkbox"
                    id="checkbox"/>
                    <span className="text-sm">I accept the terms</span>
                </label>
                <div>
                    <button type="submit" class="btn btn-primary contact-form-btn">Submit</button>
                </div>
            </form>
        </section>
    )
}