# iCare System
A Hospital management iCare system is a  Management software tool that helps you efficiently manage the care of your patients.

## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Setup](#setup)
* [Usage](#usage)
* [Project Status](#project-status)
* [Contact](#contact)



## General Information

-An iCare System is a patient management system used to perform various functionalities under one system by a worker or Administrator.

-iCare System solves the problem of patient management in the Hospitals.

-Purpose of developing the iCare Project is to understand practically the use case,sequence and class diagram's in Software Engineering.

-With this system management software we developed we have accomplished the major terminologies in the field of software engineering.



## Technologies used
- Asp.Net 
- C# (MVC)
- Sql
- Html & CSS

## Tools used

- Microsoft Visual Studio
- Microsoft Sql Server Management studio
- Microsoft Word


## Features:
 Login Screen:
    
Worker Dashboard:
      
- iCARE shall provide a simple way to log in using a pen only. The user taps his name and can 
"ink" his password in the box. 

- "iCARE Board" and "My Board" are two main forms to be provided. iCARE Board shall bring 
up patient lists corresponding to the geographic unit view. Worker will assign himself to patients 
from the iCARE Board. "My Board" shall show only the active patients list of the logged on 
person, and hence My Board view can be different for doctors and nurses.  

- Palette will be another UI component to help simplify the choosing of documents among large 
number of potential documents. It's one tablet screen in size so the user can see all choices in 
one view which consists of a series of buttons for the user to tap on. The Palette shall be able to 
manage larger number of document choices than can fit on one screen. 

- iCARE shall provide a tool to create a new document and to be able to insert different types of 
text into the new and/or the old documents such as treatments, drug orders and prescriptions. 
This tool should also be able to recognize generic and brand drug names from a standard 
reference and supports auto completion. 

- iCARE shall provide a tool to import images using a scanner or by browsing the internal stored 
image files into the application. These imported files will then be converted to PDFs, to become 
a part of the iCARE documents repository.  

- Every PDF document in iCARE should be tagged with a metadata that includes Patient ID, 
Date of creation/imported, the user ID of the creator/importer, Modification date, the user ID 
of the modifier, Brief description. 

- Only iCARE administrator has the privileges to add workers (doctors and nurses) into the 
system, edit and delete their records. The administrator account will be shipped with the system. 

- Workers of iCARE shall be able to maintain (add, modify) patient records. Patient’s record 
should maintain (but not limited to) the following information: ID, name, address, date of birth, 
height, weight, bloodGroup, BedID, Treatment area. Each patient record will be associated with 
zero or more treatment records and a set of digital documents. 
 


## Setup
- Install Visual Studio
- Install SSMS  Microsoft Sql Server Management studio
- Create a database in the SSMS and now create tables relevant to the classes in the iCARE System.
- Create an MVC project in Visual studio.

Please find the below link for detailed setup:
https://www.youtube.com/watch?v=HeGNMgdQ79M

## Steps to follow:
- Create a project in visual studio with C#.
- search MVC then choose MVC.net web application
- Now we connect the Sql server 
- In the project directory go to models ->add new item ->Data (under c#) ->ADO.new entity data model ->Name it as you want to ->EF designer from DB 
- Create a Controller now for all the classes.
- The views are been created for all the document.
- Edit the generated .cshtml as per requirements

## Source Code of Index.cshtml:




## Usage
How does one go about using it?
Provide various use cases and code examples here.
- Login to the iCARE system with Administrator 
  
  -> Administrator is able to Add,Edit,Delete the Workers in our System.
  
- Login to the iCARE system with Worker
  
  -> Worker is able to Manage and View the Patients Record's.
  
  -> Worker is able to Treat and Assign Patients to himself.
  
  -> Worker is able to See his My board.
  
  -> Worker is able to see the Palette.
  
  -> Worker is able to see and manage the Documents.
  
  -> Icare system is interacting with the Drug management system.
  
  



## Project Status
Project is: Completed.



## Contact
Created by 
Group1_CSCE5430_002




