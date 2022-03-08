import java.time.LocalDate;
import java.util.Scanner;

public class Poised {
    public static void main(String[] args) {

        // Declare base variable values

        Project newProjectDetails = null;
        Person newCustomer = null;
        Person newArchitect = null;
        Person newContractor = null;

        // Setting up user keyboard input
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");

        // while loop with switch structure used for menu options
        int userChoice ;
        while (true){

            // displaying the options available for the user
            System.out.println("____________________________________________");
            System.out.println("Welcome to the Poised Construction ");
            System.out.println("Please choose one of the following options");
            System.out.println("By Typing in one of the numbers '1' to '7' ");
            System.out.println("\n1. Add New Project details");
            System.out.println("2. Display all Project info");
            System.out.println("3. Change Project Deadline ");
            System.out.println("4. Change total amount paid ");
            System.out.println("5. Update Contractor details ");
            System.out.println("6. Finalize the Project");
            System.out.println("7. To exit\n ");
            System.out.println("Enter your menu choice: ");

            // taking in the user selection
            userChoice = scanner.nextInt();

            switch (userChoice){
                    case 1:
                        //Add New Project details
                        //this option allow the user to enter all the project details
                        // as well as the personal involved ie .Customer, Architect and Contractor

                        System.out.println("---------------------------------");
                        System.out.println("OPTION 1. ADD NEW PROJECT DETAILS");
                        System.out.println("\nPlease Enter the Project Number ");
                        int projectNumber = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Please enter a Project name ," +
                                " \nShould you rather prefer an Auto name Press 'x':");
                        String projectName = scanner.nextLine();

                        System.out.println("Please Enter The Project Type :");
                        String projectType = scanner.nextLine();

                        System.out.println("Please Enter the Project Address");
                        String projectAddress = scanner.nextLine();

                        System.out.println("Please Enter the Project ERF Number ");
                        int projectErfNumber = scanner.nextInt();

                        System.out.println("Please Enter the Project Total Cost ");
                        double projectCostAmount = scanner.nextDouble();

                        System.out.println("Please Enter the amount Paid to date");
                        double projectPaidAmount = scanner.nextDouble();

                        // Separating the input of the date , so as to be in the correct format
                        System.out.println("Please Enter the DeadLine");
                        System.out.println("Enter year");
                        int year = scanner.nextInt();
                        System.out.println("Enter month eg 1-12");
                        int month = scanner.nextInt();
                        System.out.println("Enter date");
                        int date = scanner.nextInt();
                        LocalDate projectDeadline = LocalDate.of(year, month, date);

                        System.out.println("Is Project Finalized, 'yes' or 'no'");
                        String projectFinalized = scanner.next();
                        scanner.nextLine();


                        // Accepting  Customer details
                        System.out.println("Customer Detail:");
                        System.out.println("Please Enter Customer First Name");
                        String customerName = scanner.nextLine();
                        System.out.println("Please Enter Customer Surname");
                        String customerSurname = scanner.nextLine();
                        System.out.println("Please Enter the customer TelePhone Number ");
                        String customerTelephone = scanner.nextLine();
                        System.out.println("Please Enter the Customer email  ");
                        String customerEmail = scanner.next();
                        System.out.println("Please Enter the Customer Address");
                        String customerAddress = scanner.next();
                        scanner.nextLine();

                        //Creating the Customer object
                        newCustomer = new Person(customerName, customerSurname, customerTelephone
                                ,customerEmail, customerAddress);

                        //Accepting Architect details
                        System.out.println("Architect Details:");
                        System.out.println("Please Enter Architect First Name");
                        String architectName = scanner.nextLine();
                        System.out.println("Please Enter Architect Surname");
                        String architectSurname = scanner.nextLine();
                        System.out.println("Please Enter the Architect TelePhone Number ");
                        String architectTelephone = scanner.nextLine();
                        System.out.println("Please Enter the Architect email  ");
                        String architectEmail = scanner.next();
                        System.out.println("Please Enter the Architect Address");
                        String architectAddress = scanner.next();
                        scanner.nextLine();

                        //Creating the Architect object
                        newArchitect = new Person(architectName, architectSurname, architectTelephone
                                ,architectEmail, architectAddress);

                        //Accepting Contractor details
                        System.out.println("Contractor Details:");
                        System.out.println("Please Enter Contractor First Name");
                        String contractorName = scanner.nextLine();
                        System.out.println("Please Enter Contractor Surname");
                        String contractorSurname = scanner.nextLine();
                        System.out.println("Please Enter the Contractor TelePhone Number ");
                        String contractorTelephone = scanner.nextLine();
                        System.out.println("Please Enter the Contractor email  ");
                        String contractorEmail = scanner.next();
                        System.out.println("Please Enter the Contractor Address");
                        String contractorAddress = scanner.next();
                        scanner.nextLine();

                        //Creating the Contractor object
                        newContractor = new Person(contractorName, contractorSurname, contractorTelephone
                                ,contractorEmail, contractorAddress);

                        // Auto generate project name, as per user request , the type and surname are
                        // joined and assigned to from the auto project name
                        if (projectName.equals("x")){
                            projectName = projectType  + " " + customerSurname;
                        }

                        //Creating Project object
                        newProjectDetails = new Project(projectNumber, projectName, projectType
                                ,projectAddress, projectErfNumber, projectCostAmount, projectPaidAmount
                                , projectDeadline, projectFinalized, newCustomer, newArchitect, newContractor );

                        break;
                    case 2:
                        //This option will Display all project and related person details

                        // condition used to ensure that appropriate message is displayed if
                        // no project info is available as yet
                        System.out.println("OPTION 2. DISPLAY ALL PROJECT INTO ");
                        if (newProjectDetails == null){
                            System.out.println("\nSorry No Project info loaded as yet \nPlease choose Option 1. to Enter info");
                        }
                        else{
                            System.out.println("---------------------------------");

                            //passing through the method from Project class to display al the
                            // captured information in String format
                            System.out.println(newProjectDetails);
                            System.out.println("");
                        }

                        break;
                    case 3:
                        //This Option will you to change Due Date of the Project

                        // condition used to ensure that appropriate message is displayed if
                        // no project info is available as yet
                        System.out.println("---------------------------------");
                        System.out.println("OPTION 3. CHANGE DEADLINE DATE");
                        if (newProjectDetails == null){
                            System.out.println("\nSorry No Project info loaded as yet \nPlease choose Option 1. to Enter info");
                        }
                        else{
                            // Displaying the original information using getters in the Project class and then
                            // accepting the updated values to be added to the object
                            System.out.println("The Current DeadLine Date is: " + newProjectDetails.getProjectDeadline());
                            System.out.println("Please Enter the New DeadLine");
                            System.out.println("Enter year");
                            year = scanner.nextInt();
                            System.out.println("Enter month eg 1-12");
                            month = scanner.nextInt();
                            System.out.println("Enter date");
                            date = scanner.nextInt();

                            // Updating the Project object using the  class setters
                            newProjectDetails.setProjectDeadline(LocalDate.of(year, month, date));
                        }
                        break;
                    case 4:
                        //This Option allows you to change total amount paid
                        System.out.println("---------------------------------");
                        System.out.println("OPTION 4. CHANGE TOTAL AMOUNT PAID");

                        // condition used to ensure that appropriate message is displayed if
                        // no project info is available as yet
                        if (newProjectDetails == null){
                            System.out.println("\nSorry No Project info loaded as yet \nPlease choose Option 1. to Enter info");
                        }
                        else{
                            // Displaying the original information using getters in the Project class and then
                            // updating the values using the class's setters
                            System.out.println("The Total Amount Paid so far: " + newProjectDetails.getProjectPaidAmount());
                            System.out.println("Please Enter the new amount");
                            double newAmount = scanner.nextDouble();
                            newProjectDetails.setProjectPaidAmount(newAmount);
                        }
                        break;
                    case 5:
                        //This Option allows you to update Contractor details

                        // condition used to ensure that appropriate message is displayed if
                        // no project info is available as yet
                        System.out.println("OPTION 5. UPDATE CONTRACTOR DETAILS");
                        if (newProjectDetails == null){
                            System.out.println("\nSorry No Project info loaded as yet \nPlease choose Option 1. to Enter info");
                        }
                        else {
                            // Displaying the original information using getters in the Project class and then
                            // accepting the updated values to be added to the object
                            System.out.println("The Current Contractor details : \n" + newContractor.toString());
                            System.out.println("\nPlease Enter New First name: ");
                            String newName = scanner.next();
                            scanner.nextLine();
                            System.out.println("Please Enter New Surname: ");
                            String newSurname = scanner.nextLine();
                            System.out.println("Please Enter New Telephone number: ");
                            String newTelephone = scanner.nextLine();
                            System.out.println("Please Enter New Email Address: ");
                            String newEmail = scanner.nextLine();
                            System.out.println("Please Enter New Address: ");
                            String newAddress = scanner.nextLine();

                            // Updating the contractor (Person) objects values using the class's setters
                            newContractor.setName(newName);
                            newContractor.setSurname(newSurname);
                            newContractor.setPhoneNumber(newTelephone);
                            newContractor.setEmail(newEmail);
                            newContractor.setAddress(newAddress);
                        }
                        break;
                    case 6:
                        // This Option allows the user to Finalize the project(mark completion)
                        // ie. change the status , and the then displays the invoice for amount owing
                        // if the total cost is not yet fully paid

                        // condition used to ensure that appropriate message is displayed if
                        // no project info is available as yet
                        System.out.println("OPTION 6.FINALIZE THE PROJECT ");
                        if (newProjectDetails == null){
                            System.out.println("\nSorry No Project info loaded as yet \nPlease choose Option 1. to Enter info ");
                        }
                        else {
                            // Checks if the total cost is filly paid?
                            if (newProjectDetails.getProjectPaidAmount() != newProjectDetails.getProjectCostAmount()) {

                                // If there is still an amount owing , the remainder is calculated for displayed
                                double remainingAmount =
                                        newProjectDetails.getProjectCostAmount() - newProjectDetails.getProjectPaidAmount();

                                // Displays the Invoice , containing customer details and amount owing
                                System.out.println("\nINVOICE");
                                System.out.println(newCustomer.toString());
                                System.out.println("Total Owing: " + remainingAmount);

                                // changing the Status ie. Finalise variable to 'yes'
                                newProjectDetails.setProjectFinalized("yes");

                            }
                            else{
                                //if found that the bill is paid up , changing status ie.
                                // Finalize variable to paid up , and display the new status
                                newProjectDetails.setProjectFinalized("yes");
                                System.out.println("Project is now Marked as FINALIZED");
                            }
                        }


                        break;
                    case 7:
                        //This option exits the program
                        System.exit(0);
                        break;
                    default:
                        // Should a user enter an incorrect option, the following message is displayed
                        // allowing user to make a correct chose
                        System.out.println("This is not a valid option \nPlease choose another ");


                }
            }

        }



    }


