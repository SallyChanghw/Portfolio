/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Hospital.Appointment.Appointment;
import Hospital.Children.Children;
import Hospital.Children.ChildrenHistory;
import Hospital.Doctor.Doctor;
import Hospital.Doctor.DoctorHistory;
import Hospital.Organization.AdminOrganization;
import Hospital.Organization.DoctorOrganization;
import Hospital.Organization.PatientOrganization;
import Hospital.Organization.StaffOrganization;
import Hospital.Role.AdminRole;
import Hospital.Role.ChildrenRole;
import Hospital.Role.DoctorRole;
import Hospital.Role.ParentRole;
import Hospital.Role.PurchasingOfficerRole;
import Hospital.UserAccount.UserAccount;
import Hospital.UserAccount.UserAccountDirectory;
import java.util.List;
import Hospital.Enterprise.ManufacturerDirectory;
import Hospital.Enterprise.Manufacturer;
import Hospital.Parent.Parent;
import Hospital.Parent.ParentHistory;
import Hospital.PurchasingOfficer.PurchasingOfficer;
import Hospital.PurchasingOfficer.PurchasingOfficerHistory;

/**
 *
 * @author josie
 */
public class ConfigureAHospital {
    
    public static Hospital configure(){
        
        Hospital hospital = Hospital.getInstance();
        
        // add Organization & get history
        AdminOrganization adminOrganization = new AdminOrganization();
        hospital.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        DoctorOrganization doctorOrganization = new DoctorOrganization();
        hospital.getOrganizationDirectory().getOrganizationList().add(doctorOrganization);
        DoctorHistory doctorHistory = hospital.getDoctorHistory();
        
        PatientOrganization patientOrganization = new PatientOrganization();
        hospital.getOrganizationDirectory().getOrganizationList().add(patientOrganization);
        ParentHistory parentHistory = hospital.getParentHistory();
        ChildrenHistory childrenHistory = hospital.getChildrenHistory();
        
        StaffOrganization staffOrganization = new StaffOrganization();
        hospital.getOrganizationDirectory().getOrganizationList().add(staffOrganization);
        PurchasingOfficerHistory purchasingOfficerHistory = hospital.getPurchasingOfficerHistory();
        
        // UserAccount
        // role - Admin
        UserAccount account1 = new UserAccount();
        account1.setUsername("admin");
        account1.setPassword("admin");
        account1.setRole(new AdminRole());          
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account1);
        
        // role - Doctor          
//      addDoctor(String ssnID,String name,String location, String department,String specialty,String time,String status)
        Doctor doctor01 = doctorHistory.addDoctor("100-45-6789","Rodney Harris","Rainbow Kids Medical Center","Cardiology", "Heart Failure","", "");
        UserAccount account2 = new UserAccount();
        account2.setUsername("doc");
        account2.setPassword("doc");
        account2.setRole(new DoctorRole());
        account2.setDoctor(doctor01);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account2);
        
        Doctor doctor06 = doctorHistory.addDoctor("101-45-6789","Michael Gordon","Rainbow Kids Medical Center","Cardiology", "Interventional Cardiology","", "");
        UserAccount account26 = new UserAccount();
        account26.setUsername("doc6");
        account26.setPassword("doc6");
        account26.setRole(new DoctorRole());
        account26.setDoctor(doctor06);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account26);
        
        Doctor doctor02 = doctorHistory.addDoctor("103-45-6789","Wendy Obrien","Dreamscape Healing Center","Neurology", "Movement Disorders","", "");
        UserAccount account21 = new UserAccount();
        account21.setUsername("doc1");
        account21.setPassword("doc1");
        account21.setRole(new DoctorRole());
        account21.setDoctor(doctor02);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account21);
        
        Doctor doctor08 = doctorHistory.addDoctor("104-45-6789","Kaitlyn Brown","Dreamscape Healing Center","Neurology", "Neuro-ophthalmology","", "");
        UserAccount account28 = new UserAccount();
        account28.setUsername("doc8");
        account28.setPassword("doc8");
        account28.setRole(new DoctorRole());
        account28.setDoctor(doctor08);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account28);
        
  
        Doctor doctor03 = doctorHistory.addDoctor("106-45-6789","Phyllis Li","Joyful Center","Orthopedic", "Sports Medicine","", "");
        UserAccount account22 = new UserAccount();
        account22.setUsername("doc2");
        account22.setPassword("doc2");
        account22.setRole(new DoctorRole());
        account22.setDoctor(doctor03);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account22);
        
        Doctor doctor10 = doctorHistory.addDoctor("107-45-6789","Alexandria Jackson","Joyful Center","Orthopedic", "Spine Surgery","", "");
        UserAccount account210 = new UserAccount();
        account210.setUsername("doc10");
        account210.setPassword("doc10");
        account210.setRole(new DoctorRole());
        account210.setDoctor(doctor10);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account210);
        
        
        Doctor doctor04 = doctorHistory.addDoctor("109-45-6789","Heather Chan","Lifeline Cancer Care Pavilion","Oncology", "Genitourinary Oncology","", "");
        UserAccount account23 = new UserAccount();
        account23.setUsername("doc3");
        account23.setPassword("doc3");
        account23.setRole(new DoctorRole());
        account23.setDoctor(doctor04);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account23);
        
        Doctor doctor12 = doctorHistory.addDoctor("110-45-6789","Douglas Byrd","Lifeline Cancer Care Pavilion","Oncology", "Radiation Oncology","", "");
        UserAccount account212 = new UserAccount();
        account212.setUsername("doc12");
        account212.setPassword("doc12");
        account212.setRole(new DoctorRole());
        account212.setDoctor(doctor12);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account212);
        
        
        Doctor doctor05 = doctorHistory.addDoctor("112-45-6789","Robert Logan","GastroCare Center","Gastroenterology", "Hepatology","", "");
        UserAccount account24 = new UserAccount();
        account24.setUsername("doc4");
        account24.setPassword("doc4");
        account24.setRole(new DoctorRole());
        account24.setDoctor(doctor05);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account24);
        
        Doctor doctor14 = doctorHistory.addDoctor("113-45-6789","Bruce Elliott","GastroCare Center","Gastroenterology", "Motility Disorders, Nutritional Gastroenterology","", "");
        UserAccount account214 = new UserAccount();
        account214.setUsername("doc14");
        account214.setPassword("doc14");
        account214.setRole(new DoctorRole());
        account214.setDoctor(doctor14);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account214);
       
        
        // role - Parent
//      addParent(String ssnID,String name,String feedback,String status)
        Parent parent01 = parentHistory.addParent("200-45-6789","Alvin Villa","","");
        UserAccount account31 = new UserAccount();
        account31.setUsername("par");
        account31.setPassword("par");
        account31.setRole(new ParentRole());  
        account31.setParent(parent01);
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account31);
        
        Parent parent02 = parentHistory.addParent("201-45-6789","Tammy Doyle","","");
        UserAccount account32 = new UserAccount();
        account32.setUsername("par1");
        account32.setPassword("par1");
        account32.setRole(new ParentRole());  
        account32.setParent(parent02);
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account32);
        
        Parent parent03 = parentHistory.addParent("202-45-6789","Eric Soto","","");
        UserAccount account33 = new UserAccount();
        account33.setUsername("par2");
        account33.setPassword("par2");
        account33.setRole(new ParentRole());  
        account33.setParent(parent03);
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account33);
        
        // role - Children              
//        Children children01 = childrenHistory.defaultChildren("223-45-6789", "Children01", 2, "Male", "", "");
        Children children01 = parent01.newChildren("300-45-6789","Martha Villa");
        UserAccount account4 = new UserAccount();
        account4.setUsername("chi");
        account4.setPassword("chi");        
        account4.setRole(new ChildrenRole());   
        account4.setChildren(children01);
        children01.setAge(6);
        children01.setBirthday("09/25/2017");
        children01.setGender("F");
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account4);
        
        Children children04 = parent01.newChildren("301-45-6789","Shannon Villa");
        UserAccount account43 = new UserAccount();
        account43.setUsername("chi3");
        account43.setPassword("chi3");        
        account43.setRole(new ChildrenRole());   
        account43.setChildren(children04);
        children04.setAge(6);
        children04.setBirthday("09/25/2017");
        children04.setGender("M");
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account43);
        
        Children children05 = parent01.newChildren("302-45-6789","Amy Villa");
        UserAccount account44 = new UserAccount();
        account44.setUsername("chi4");
        account44.setPassword("chi4");        
        account44.setRole(new ChildrenRole());   
        account44.setChildren(children05);
        children05.setAge(3);
        children05.setBirthday("11/09/2020");
        children05.setGender("M");
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account44);
        
        
        Children children02 = parent02.newChildren("303-45-6789","Jeremiah Doyle");
        UserAccount account41 = new UserAccount();
        account41.setUsername("chi1");
        account41.setPassword("chi1");        
        account41.setRole(new ChildrenRole());   
        account41.setChildren(children02);
        children02.setAge(8);
        children02.setBirthday("06/30/2015");
        children02.setGender("F");
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account41);
        
        Children children06 = parent02.newChildren("304-45-6789","Charles Doyle");
        UserAccount account45 = new UserAccount();
        account45.setUsername("chi5");
        account45.setPassword("chi5");        
        account45.setRole(new ChildrenRole());   
        account45.setChildren(children06);
        children06.setAge(8);
        children06.setBirthday("06/30/2015");
        children06.setGender("F");
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account45);
        
        Children children07 = parent02.newChildren("305-45-6789","Shane Doyle");
        UserAccount account46 = new UserAccount();
        account46.setUsername("chi6");
        account46.setPassword("chi6");        
        account46.setRole(new ChildrenRole());   
        account46.setChildren(children07);
        children07.setAge(8);
        children07.setBirthday("06/30/2015");
        children07.setGender("F");
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account46);
        
        
        Children children03 = parent03.newChildren("306-45-6789","Jennifer Soto");
        UserAccount account42 = new UserAccount();
        account42.setUsername("chi2");
        account42.setPassword("chi2");        
        account42.setRole(new ChildrenRole());   
        account42.setChildren(children03);
        children03.setAge(7);
        children03.setBirthday("10/20/2016");
        children03.setGender("M");
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account42);
        
        Children children08 = parent03.newChildren("307-45-6789","Ashley Soto");
        UserAccount account47 = new UserAccount();
        account47.setUsername("chi7");
        account47.setPassword("chi7");        
        account47.setRole(new ChildrenRole());   
        account47.setChildren(children08);
        children08.setAge(2);
        children08.setBirthday("10/30/2021");
        children08.setGender("F");
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account47);
        
        Children children09 = parent03.newChildren("308-45-6789","Christine Soto");
        UserAccount account48 = new UserAccount();
        account48.setUsername("chi8");
        account48.setPassword("chi8");        
        account48.setRole(new ChildrenRole());   
        account48.setChildren(children09);
        children09.setAge(10);
        children09.setBirthday("10/20/2013");
        children09.setGender("M");
        patientOrganization.getUserAccountDirectory().getUserAccountList().add(account48);
        
        // role - Purchasing Officer
//        PurchasingOfficer po01 = purchasingOfficerHistory.addPurchasingRequest();
        UserAccount account5 = new UserAccount();
        account5.setUsername("purchase");
        account5.setPassword("purchase");
        account5.setRole(new PurchasingOfficerRole());
//        account5.setPurchasingOfficer(po01);
        staffOrganization.getUserAccountDirectory().getUserAccountList().add(account5);
        
        //enterprise - manufacturer
        ManufacturerDirectory manufacturerDirectory = hospital.getManufacturerDirectory();
        Manufacturer manufacturer1 = manufacturerDirectory.addManufacturer("Pfizer","pfizer","Pfizer","Vaccine",100,500);
        Manufacturer manufacturer2 = manufacturerDirectory.addManufacturer("Johnson","johnson","Johnson","Remicade",500,4000);
        Manufacturer manufacturer3 = manufacturerDirectory.addManufacturer("Merck","merck","Merck","Vaccine",30,2000);
        Manufacturer manufacturer4 = manufacturerDirectory.addManufacturer("AbbVie","abbVie","AbbVie","Humira",500,1000);
        Manufacturer manufacturer5 = manufacturerDirectory.addManufacturer("Novartis","novartis","Novartis","Diovan",1000,800);
        Manufacturer manufacturer6 = manufacturerDirectory.addManufacturer("GSK","gsk","GSK","Zantac",900,6000);
        Manufacturer manufacturer7 = manufacturerDirectory.addManufacturer("Roche","roche","Roche","Tamiflu",400,5000);
        
        // Appointment Schedule Data
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Morning Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Afternoon Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Night Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor02.getDoctorID(), doctor02.getDepartment()
                    , "Morning Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor02.getDoctorID(), doctor02.getDepartment()
                    , "Afternoon Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor02.getDoctorID(), doctor02.getDepartment()
                    , "Night Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Morning Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Afternoon Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor02.getDoctorID(), doctor02.getDepartment()
                    , "Night Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Morning Clinic", "2023-12-13", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor02.getDoctorID(), doctor02.getDepartment()
                    , "Afternoon Clinic", "2023-12-13", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Night Clinic", "2023-12-12", 20, "Verified");
        
        hospital.getAppointmentHistory().newAppSchedule(doctor03.getDoctorID(), doctor03.getDepartment()
                    , "Afternoon Clinic", "2023-12-12", 30, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor03.getDoctorID(), doctor03.getDepartment()
                    , "Night Clinic", "2023-12-12", 30, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor03.getDoctorID(), doctor03.getDepartment()
                    , "Morning Clinic", "2023-12-13", 30, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor03.getDoctorID(), doctor03.getDepartment()
                    , "Afternoon Clinic", "2023-12-13", 30, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor03.getDoctorID(), doctor03.getDepartment()
                    , "Night Clinic", "2023-12-12", 30, "Verified");
        
        hospital.getAppointmentHistory().newAppSchedule(doctor04.getDoctorID(), doctor04.getDepartment()
                    , "Morning Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor04.getDoctorID(), doctor04.getDepartment()
                    , "Afternoon Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor04.getDoctorID(), doctor04.getDepartment()
                    , "Night Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor05.getDoctorID(), doctor05.getDepartment()
                    , "Morning Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor05.getDoctorID(), doctor05.getDepartment()
                    , "Afternoon Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor05.getDoctorID(), doctor05.getDepartment()
                    , "Night Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor04.getDoctorID(), doctor04.getDepartment()
                    , "Morning Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor04.getDoctorID(), doctor04.getDepartment()
                    , "Afternoon Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor05.getDoctorID(), doctor05.getDepartment()
                    , "Night Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor04.getDoctorID(), doctor04.getDepartment()
                    , "Morning Clinic", "2023-12-13", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor05.getDoctorID(), doctor05.getDepartment()
                    , "Afternoon Clinic", "2023-12-13", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor04.getDoctorID(), doctor04.getDepartment()
                    , "Night Clinic", "2023-12-12", 20, "Verified");
        
        hospital.getAppointmentHistory().newAppSchedule(doctor06.getDoctorID(), doctor06.getDepartment()
                    , "Morning Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor06.getDoctorID(), doctor06.getDepartment()
                    , "Afternoon Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor06.getDoctorID(), doctor06.getDepartment()
                    , "Night Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor06.getDoctorID(), doctor06.getDepartment()
                    , "Morning Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor06.getDoctorID(), doctor06.getDepartment()
                    , "Afternoon Clinic", "2023-12-12", 20, "Verified");        
        hospital.getAppointmentHistory().newAppSchedule(doctor06.getDoctorID(), doctor06.getDepartment()
                    , "Morning Clinic", "2023-12-13", 20, "Verified");     
        hospital.getAppointmentHistory().newAppSchedule(doctor06.getDoctorID(), doctor06.getDepartment()
                    , "Night Clinic", "2023-12-12", 20, "Verified");        
        hospital.getAppointmentHistory().newAppSchedule(doctor08.getDoctorID(), doctor08.getDepartment()
                    , "Afternoon Clinic", "2023-12-12", 30, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor08.getDoctorID(), doctor08.getDepartment()
                    , "Night Clinic", "2023-12-12", 30, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor08.getDoctorID(), doctor08.getDepartment()
                    , "Morning Clinic", "2023-12-13", 30, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor08.getDoctorID(), doctor08.getDepartment()
                    , "Afternoon Clinic", "2023-12-13", 30, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor08.getDoctorID(), doctor08.getDepartment()
                    , "Night Clinic", "2023-12-12", 30, "Verified");
        
        
        hospital.getAppointmentHistory().newAppSchedule(doctor10.getDoctorID(), doctor10.getDepartment()
                    , "Morning Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor10.getDoctorID(), doctor10.getDepartment()
                    , "Afternoon Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor10.getDoctorID(), doctor10.getDepartment()
                    , "Night Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor10.getDoctorID(), doctor10.getDepartment()
                    , "Night Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor10.getDoctorID(), doctor10.getDepartment()
                    , "Afternoon Clinic", "2023-12-13", 20, "Verified");
        
       
        hospital.getAppointmentHistory().newAppSchedule(doctor12.getDoctorID(), doctor12.getDepartment()
                    , "Morning Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor12.getDoctorID(), doctor12.getDepartment()
                    , "Afternoon Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor12.getDoctorID(), doctor12.getDepartment()
                    , "Night Clinic", "2023-12-11", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor12.getDoctorID(), doctor12.getDepartment()
                    , "Night Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor12.getDoctorID(), doctor12.getDepartment()
                    , "Afternoon Clinic", "2023-12-13", 20, "Verified");
        
        hospital.getAppointmentHistory().newAppSchedule(doctor14.getDoctorID(), doctor14.getDepartment()
                    , "Morning Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor14.getDoctorID(), doctor14.getDepartment()
                    , "Afternoon Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor14.getDoctorID(), doctor14.getDepartment()
                    , "Night Clinic", "2023-12-10", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor14.getDoctorID(), doctor14.getDepartment()
                    , "Morning Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor14.getDoctorID(), doctor14.getDepartment()
                    , "Afternoon Clinic", "2023-12-12", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor14.getDoctorID(), doctor14.getDepartment()
                    , "Morning Clinic", "2023-12-13", 20, "Verified");
        hospital.getAppointmentHistory().newAppSchedule(doctor14.getDoctorID(), doctor14.getDepartment()
                    , "Night Clinic", "2023-12-12", 20, "Verified");
        
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Morning Clinic", "2023-12-20", 20, "Pending");
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Afternoon Clinic", "2023-12-20", 20, "Pending");
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Night Clinic", "2023-12-20", 20, "Pending");
        hospital.getAppointmentHistory().newAppSchedule(doctor02.getDoctorID(), doctor02.getDepartment()
                    , "Morning Clinic", "2023-12-21", 20, "Pending");
        hospital.getAppointmentHistory().newAppSchedule(doctor02.getDoctorID(), doctor02.getDepartment()
                    , "Afternoon Clinic", "2023-12-21", 20, "Pending");
        hospital.getAppointmentHistory().newAppSchedule(doctor02.getDoctorID(), doctor02.getDepartment()
                    , "Night Clinic", "2023-12-21", 20, "Pending");
        hospital.getAppointmentHistory().newAppSchedule(doctor01.getDoctorID(), doctor01.getDepartment()
                    , "Morning Clinic", "2023-12-30", 20, "Rejected");
        
        // Appointment Data
        Appointment appointment08 = hospital.getAppointmentHistory().newAppointment(children01.getSSNID(), children01.getName(),
                    doctor03.getDoctorID(), doctor03.getDepartment(), "2023-11-10","Morning Clinic", "Completed");
        appointment08.setDescription("Martha was brave, good job!"); appointment08.setMedicine("Vaccine");
        appointment08.setFeedback("Martha felt better.");
        
        Appointment appointment04 = hospital.getAppointmentHistory ().newAppointment(children01.getSSNID(),children01.getName(),
                    doctor02.getDoctorID(), doctor02.getDepartment(), "2023-11-10", "Afternoon Clinic", "Assessed");
        appointment04.setDescription("need to come back"); appointment04.setMedicine("Zantac");
        
        Appointment appointment01 = hospital.getAppointmentHistory().newAppointment(children01.getSSNID(), children01.getName(),
                    doctor01.getDoctorID(), doctor01.getDepartment(), "2023-12-10","Morning Clinic", "Canceled");
        appointment01.setDescription("patient didn't show up");
        
        Appointment appointment19 = hospital.getAppointmentHistory().newAppointment(children01.getSSNID(), children01.getName(),
                    doctor01.getDoctorID(), doctor01.getDepartment(), "2023-12-12","Afternoon Clinic", "Completed");
        appointment19.setDescription("Martha has to come back."); appointment19.setMedicine("Tamiflu");
        appointment19.setFeedback("Nice and caring doctor Harris.");
        
        Appointment appointment21 = hospital.getAppointmentHistory().newAppointment(children01.getSSNID(), children01.getName(),
                    doctor01.getDoctorID(), doctor01.getDepartment(), "2023-12-13","Afternoon Clinic", "Assessed");
        appointment21.setDescription("Martha are getting better, no worries."); appointment21.setMedicine("Remicade");
        
        Appointment appointment17 = hospital.getAppointmentHistory().newAppointment(children01.getSSNID(), children01.getName(),
                    doctor06.getDoctorID(), doctor06.getDepartment(), "2023-12-13","Morning Clinic", "Completed");
        appointment17.setDescription("Martha was brave, good job!"); appointment17.setMedicine("Vaccine");
        appointment17.setFeedback("Martha got a fever, felt better now.");
        
        Appointment appointment20 = hospital.getAppointmentHistory().newAppointment(children01.getSSNID(), children01.getName(),
                    doctor01.getDoctorID(), doctor01.getDepartment(), "2023-12-20","Night Clinic", "Pending");
        
        
        
        Appointment appointment05 = hospital.getAppointmentHistory ().newAppointment(children04.getSSNID(), children04.getName(),
                    doctor02.getDoctorID(), doctor02.getDepartment(), "2023-11-10", "Morning Clinic", "Completed");
        appointment05.setDescription("no problem"); appointment05.setMedicine("") ;
        appointment05.setDescription("Shannon was cute and brave!"); appointment05.setMedicine("Vaccine");
        appointment05.setFeedback("Shannon got a fever afterwards. But she felt better.");
        
        Appointment appointment10 = hospital.getAppointmentHistory().newAppointment(children04.getSSNID(), children04.getName(),
                    doctor04.getDoctorID(), doctor04.getDepartment(), "2023-12-10","Night Clinic", "Completed");
        appointment10.setDescription("Shannon's wound was getting better"); appointment10.setMedicine("Remicade");
        appointment10.setFeedback("Shannon felt better. Doctor Chan was nice and helpful.");
        
        Appointment appointment13 = hospital.getAppointmentHistory().newAppointment(children04.getSSNID(), children04.getName(),
                    doctor05.getDoctorID(), doctor05.getDepartment(), "2023-12-11","Night Clinic","Assessed");
        appointment13.setDescription("Well done."); appointment13.setMedicine("Diovan");
        
        
        

        
        Appointment appointment18 = hospital.getAppointmentHistory().newAppointment(children07.getSSNID(), children07.getName(),
                    doctor01.getDoctorID(), doctor01.getDepartment(), "2023-12-10","Morning Clinic","Completed");
        appointment18.setDescription("Shane was brave, good job!"); appointment18.setMedicine("Vaccine");
        appointment18.setFeedback("Shane felt better.");
        
        Appointment appointment02 =hospital.getAppointmentHistory().newAppointment(children02.getSSNID(), children02.getName(),
                    doctor01.getDoctorID(), doctor01.getDepartment(), "2023-12-10","Afternoon Clinic","Completed");
        appointment02.setDescription("Jeremiah should take more rest."); appointment02.setMedicine("Humira");
        appointment02.setFeedback("The doctor was nice and caring");
        
        Appointment appointment03 = hospital.getAppointmentHistory ().newAppointment(children03.getSSNID(), children03.getName() ,
                    doctor01.getDoctorID(), doctor01.getDepartment(), "2023-12-02", "Afternoon Clinic", "Assessed");
        appointment03.setDescription("it's okay"); appointment03.setMedicine ("Vaccine" );
        
        
        
        
        Appointment appointment06 = hospital.getAppointmentHistory().newAppointment(children02.getSSNID(), children02.getName(),
                    doctor02.getDoctorID(), doctor02.getDepartment(), "2023-12-13","Afternoon Clinic", "Pending");
        
        Appointment appointment07 = hospital.getAppointmentHistory().newAppointment(children02.getSSNID(), children02.getName(),
                    doctor02.getDoctorID(), doctor02.getDepartment(), "2023-10-10","Morning Clinic", "Completed");
        appointment07.setDescription("Wendy was cute and brave!"); appointment07.setMedicine("Vaccine");
        appointment07.setFeedback("Wendy got a fever afterwards. But she felt better.");
        
        
        
        Appointment appointment09 = hospital.getAppointmentHistory().newAppointment(children02.getSSNID(), children02.getName(),
                    doctor03.getDoctorID(), doctor03.getDepartment(), "2023-12-10","Afternoon Clinic", "Pending");
        
       
        
        
        Appointment appointment11 = hospital.getAppointmentHistory().newAppointment(children06.getSSNID(), children06.getName(),
                    doctor04.getDoctorID(), doctor04.getDepartment(), "2023-12-10","Night Clinic", "Pending");
        
        Appointment appointment12 = hospital.getAppointmentHistory().newAppointment(children08.getSSNID(), children08.getName(),
                    doctor04.getDoctorID(), doctor04.getDepartment(), "2023-12-10","Afternoon Clinic", "Assessed");
        
        
        
        Appointment appointment14 = hospital.getAppointmentHistory().newAppointment(children06.getSSNID(), children06.getName(),
                    doctor05.getDoctorID(), doctor05.getDepartment(), "2023-12-11","Night Clinic", "Assessed");
        
        Appointment appointment15 = hospital.getAppointmentHistory().newAppointment(children06.getSSNID(), children06.getName(),
                    doctor05.getDoctorID(), doctor05.getDepartment(), "2023-12-12","Afternoon Clinic", "Pending");
        
        Appointment appointment16 = hospital.getAppointmentHistory().newAppointment(children06.getSSNID(), children06.getName(),
                    doctor05.getDoctorID(), doctor05.getDepartment(), "2023-10-10","Morning Clinic", "Completed");
        appointment16.setDescription("Charles was brave and sweet!"); appointment16.setMedicine("Vaccine");
        appointment16.setFeedback("Charles felt better. Doctor Logan was nice and helpful.");

        
       
        return hospital;
    }
}
