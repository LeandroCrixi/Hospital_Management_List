# Hospital_Management_List
Hospital Patient Management List

Data Structures and Algorithms

Leandro Crixi


We have decided to create a Java Programming Graphical User Interface (GUI) for our project instead of having all the code running on the output Terminal from NetBeans or Eclipse.
We are also using text files to save and read all the data from patients and tickets.
There is an image file also to have it on the main Frame.

1.	GUI Interfaces
1.1.	Hospital mngt list Java file

Hospital mngt list is the Open System Frame has Menu and Menu Items that allows users to navigate over all the project’s Frames. 
Inside the menu File, the Menu Items README and Exit. README menu brings the user to a Java file that reads an information contained in a README file and the Exit menu close the system.

1.2.	Modify Patients Java file

Modify Patients Frame allows users to change any patients’ information. 
When the button SEARCH is clicked, all patients’ information appears inside the Text Area, then, the user must find the right patient and go ahead with the alteration that has to be done on it. More the one alteration is allowed to execute in this case, as soon the button SAVE is clicked all the alterations will be saved into the system.
When the button CLEAR is clicked, all the information in the Text Area is cleaned, this means any alteration has been done in the system.

1.3.	README Java file
README Frame is a simple README file that explains and teach users everything about the system. It explains the function of all Frames and button functions. This frame is only readable.
1.4.	Register Patient Java file

Register Patient Frame allows users to register new patients into the system, information as PPS Number, name, surname, Phone Number, City, and email are required, PPS Number and Name must be inserted. As soon as the button SAVE is clicked, the new patient will be registered into the system.
When the button CLEAR is clicked, all the information is cleaned, this means any new registration has been done in the system.

1.5.	Ticket Generator Java file
Ticket Generator Frame allows users to link a patient with a ticket number into the system. You can search a patient by its PPS number and after the button SEARCH is clicked the patients’ information shows up in the Text Area.
Users are allowed also to insert a new ticket into the system, after the placement criteria. If a new ticket has to be added at the end place into the list, the button TICKET has to be clicked. If a new ticket has to be added to a specific place, a POSITION has to be described and the button TICKET has to be clicked. If, a new ticket has to be added at the very first place on the list the button PRIORITY has to be clicked.
As soon the new ticket has been created the Ticket Number, the patients’ PPS Number, and Name, previously searched, will be added to the Ticket List.
1.6.	Ticket List Java file
Ticket List Frame allows users to take a look into the Ticket List and delete a Ticket from the List if is necessary.
If, the button SEARCH is clicked the Ticket List is presented in the Text Area. Or, the user can search by a specific PPS Number its position.
If the user would like to delete a Ticket from the List, the Ticket Number has to be presented in the field, and, as soon the button DELETE has been clicked the selected ticket is deleted from the Ticket List.

2.	Methods
2.1.	Patient Java file
Patient Java Class has its privates Parameters, Constructor, Get and Set Methods and public Methods.
The main functionality of Patient Java Class is dealing with Patient Database, like, inserting a new Patient, updating a Patients’ information or even deleting a Patient.
2.1.1.1.	Save Patient Method is called by Register Patient Java file. It has parameters as, String pps, String name, String surname, String phone, String city, String email. All information will be stored in a String details variable. Details variable is stored then in an Array List, and it will be saved in a text file called Patient_List.txt.
2.1.1.2.	Update Patient Method is called by Modify Patient Java file. It has parameters as, String pps Number, String filename, JTextArea txt_area. All information from the JTextArea will be included as new, inside the Patient_List.txt. It means that any alteration made on any Patient will be stored in the text file.
2.2.	Read Write Java file
Read Write Java Class has its privates Parameters, Constructor, Get and Set Methods and public Methods.
The main functionality of Read Write Java Class is dealing basically everything with a relation to Tickets Functions like reading the ticket list, creating a new ticket and deleting tickets.
2.2.1.1.	Search Array Method is called by Modify Patient Java file and from Ticket Generator Java file. It has parameters as, String ppsNumber, String filename, JTextArea txt_area. All information from the text file will be set inside the JTextArea, as soon the SEARCH button is clicked. In Ticket Generator Java file, you can also filter the search by PPS Number as well.
2.2.1.2.	Search Linked Method is called by Ticket List Java file. It has parameters as, String ppsNumber, String filename, JTextArea txt_area.  All information from the text file will be set inside the JTextArea, as soon the SEARCH button is clicked. In Ticket Generator Java file, you can also filter the search by PPS Number as well.
2.2.1.3.	Ticket Generator Method is called by Ticket Generator Java file. It has parameters as, JTextArea patient, String filename, JSpinner position. This method checks first if the JSpinner position is equal to 0(zero) or not. If it is equal to 0(zero), as soon the button TICKET is clicked a new ticket will be added at the end of the Ticket List.txt, getting the first 20 characters from JTextArea, previously filtered by PPS Number. If JSpinner position is not equal to 0(zero), as soon the button TICKET is clicked a new ticket will be added at the same position as the JSpinner position (an int number) of the Ticket List.txt, getting the first 20 characters from JTextArea, previously filtered by PPS Number.
2.2.1.4.	Ticket Priority Method is called by Ticket Generator Java file. It has parameters as, JTextArea patient, String filename. As soon the button PRIORITY is clicked a new ticket will be added at the very first position of the Ticket List.txt, getting the first 20 characters from JTextArea, previously filtered by PPS Number.
2.2.1.5.	Delete Method is called by Ticket List Java file. It has parameters as, String filename, JTextField field. The method will check the number typed in the JTextField, and, as soon the button DELETE has clicked the ticket, typed in the JTextField, is deleted from the Ticket List.txt.
2.2.1.6.	Read Me Method is called by README Java file. It has parameters as, String filename, JTextArea txt_area. As soon the README Java file is open the Read Me Method is called and set the JTextArea with the information from README.txt.

3.	How to Use
3.1.	Ticket > Generator Frame
SEARCH button:  when this button is clicked without a parameter the hole patient list appears on the screen. But if you have a parameter, it will search for whatever information that contains the value.
TICKET button: when this button is clicked, the method first checks if the user has selected a position to insert the new ticket. If the position is equal to 0(zero), the new ticket is added at the last position in the list, but if the user has selected a position the new ticket will be added according to the position previously selected by the user. 
PRIORITY button: When this button is clicked, a new ticket is added at the very first position in the List.
3.2.	Ticket > List Frame
SEARCH button:  when this button is clicked without a parameter the hole ticket list appears on the screen. But if you have a parameter, it will search for whatever information that contains the value.
DELETE button: To delete a ticket, the user must type the ticket number to delete it.
3.3.	Patients > Register Frame
CLEAR button: When this button is clicked all the fields are cleaned.
SAVE button: When this button is clicked all information about the new patient is registered in the Patient_List.txt
3.4.	Patients > Modify Frame
In this Frame, the user is allowed to modify and update any information about the patient.
SEARCH button: When this button is clicked all the patients are displayed in the frame, displaying all their details, as pps Number, name, phone number, etc.
CLEAR button: When this button is clicked the JTextArea is cleaned.
SAVE button: When this button is clicked all modifications done will be saved in the Patient_List.txt.


