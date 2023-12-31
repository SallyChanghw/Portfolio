import data from "../../data/index.json"
import { VerticalTimeline, VerticalTimelineElement }  from "react-vertical-timeline-component";
import "react-vertical-timeline-component/style.min.css";
import {FaBriefcase} from "react-icons/fa"
import "../../App.css";
import React from 'react';

export default function MyExperience(){
    return(
        <section id="Experience" className="experience-section">
            <div className="experience-container">
                 <p className="section-title">Recent Internship</p>
                 <h2 className="section-heading">My Experience</h2>
            </div>
            <div className="experience-timeline">
                <VerticalTimeline lineColor="var(--primary)">
                    {data?.experience?.map((item, index) => (
                        <VerticalTimelineElement
                            key={index}
                            date={item.date}
                            dateClassName="date"
                            contentStyle={{ background:"var(--tertiary)", color: 'var(--black)' }}
                            contentArrowStyle={{ borderRight: '7px solid var(--tertiary)' }}
                            iconStyle={{background:"var(--primary)", color:"var(--white)"}}
                            icon={<FaBriefcase/>}>
                                <h3 className="vertical-timeline-element-title">{item.title}</h3>
                                <p className="vertical-timeline-element-subtitle">{item.company}</p>
                                <p id="description">
                                    {item.description.split('\n').map((line, index) => (
                                        <React.Fragment key={index}>
                                        {line}
                                        <br />
                                        <br />
                                        </React.Fragment>
                                    ))}
                                    {/* {item.description} */}
                                </p>
                        </VerticalTimelineElement>
                    ))}
                </VerticalTimeline>
            </div>
        </section>
        

        // <section id="Experience" className="experience-section">
        //     <div className="experience-container">
        //         <p className="section-title">Recent Internship</p>
        //         <h2 className="section-heading">My Experience</h2>
        //     </div>

        //     <div className="experience-timeline">
        //         <ul>
        //             {data?.experience?.map((item, index) => (
        //                 <li key={index}>
        //                     <h3>{item.title}</h3>
        //                     <p>{item.company}</p>
        //                     <p>{item.description}</p>
        //                     <span>{item.date}</span>
        //                 </li>
                        
        //             ))}
                    
        //         </ul>
        //     </div>

        // </section>
                    // "description": "1. Tested new product functionalities on various platforms, including web and app\n 2.Wrote test cases of the Campus project to ensure the product met quality standards and achieved an exceptional success rate of over 90% in error-free implementation Produced development documents such as multilingual string sheets and operation manuals Worked and collaborated closely with development and product teams to analyze requirements Utilized tools such as Jira, Amplitude, and Excel to manage test cases and track defects"
    )
}