import java.time.LocalDate;

public class Project {

    // Assigning class Attributes of various essential construction (project) characteristic
    // all marked as private to limit access
    private int projectNumber;
    private String projectName;
    private String projectType;
    private String projectAddress;
    private int projectErfNumber;
    private double projectCostAmount;
    private double projectPaidAmount;
    private LocalDate projectDeadline;
    private String projectFinalized;

    // assigning (Person) object for use
    private Person projectCustomer;
    private Person projectArchitect;
    private Person projectContractor;


    // Constructor method , to pass through variables needed to flesh out and create the class object

    public Project(int projectNumber, String projectName, String projectType, String projectAddress,
                   int projectErfNumber, double projectCostAmount, double projectPaidAmount,
                   LocalDate projectDeadline, String projectFinalized, Person projectCustomer,
                   Person projectArchitect, Person projectContractor){
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.projectType = projectType;
        this.projectAddress = projectAddress;
        this.projectErfNumber = projectErfNumber;
        this.projectCostAmount = projectCostAmount;
        this.projectPaidAmount = projectPaidAmount;
        this.projectDeadline = projectDeadline;
        this.projectFinalized = projectFinalized;
        this.projectCustomer = projectCustomer;
        this.projectArchitect = projectArchitect;
        this.projectContractor = projectContractor;

    }

    // Providing Setter methods for each encapsulated Attribute

    public void setProjectNumber(int newProjectNumber){
        projectNumber = newProjectNumber;
    }
    public void setProjectName(String newProjectName){
        projectName = newProjectName;
    }
    public void setProjectType(String newProjectType){
        projectType = newProjectType;
    }
    public void setProjectAddress(String newProjectAddress){
        projectAddress = newProjectAddress;
    }
    public void setProjectErfNumber(int projectErfNumber) {
        this.projectErfNumber = projectErfNumber;
    }
    public void setProjectCostAmount(double projectCostAmount) {
        this.projectCostAmount = projectCostAmount;
    }
    public void setProjectPaidAmount(double projectPaidAmount) {
        this.projectPaidAmount = projectPaidAmount;
    }
    public void setProjectDeadline(LocalDate projectDeadline) {
        this.projectDeadline = projectDeadline;
    }
    public void setProjectFinalized(String projectFinalized) {
        this.projectFinalized = projectFinalized;
    }

    // Providing Getter methods for each encapsulated Attribute

    public int getProjectNumber(){
        return projectNumber;
    }
    public String getProjectName(){
        return projectName;
    }
    public String getProjectType(){
        return projectType;
    }
    public String getProjectAddress(){
        return projectAddress;
    }
    public int getProjectErfNumber(){
        return projectErfNumber;
    }
    public double getProjectCostAmount(){
        return projectCostAmount;
    }
    public double getProjectPaidAmount(){
        return projectPaidAmount;
    }
    public LocalDate getProjectDeadline(){
        return projectDeadline;
    }
    public String getProjectFinalized(){
        return projectFinalized;
    }


    //Methods

    // method that , when called , will display all the objects Project related information
    // including the details of personal objects (Customer , architect, contractor )
     public String toString(){
         String allProjectInfo =
                 "Full Project details:"
                         + "Project Number :" + projectNumber
                         + "\nProject Name :" + projectName
                         + "\nProject Type :" + projectType
                         + "\nProject Address :" + projectAddress
                         + "\nProject ERF Number :" + projectErfNumber
                         + "\nProject Cost :" + projectCostAmount
                         + "\nProject Paid Amount :" + projectPaidAmount
                         + "\nProject Deadline: " + projectDeadline
                         + "\nProject Finalized :" + projectFinalized
                         + "\n"
                         + "\nCustomer Details: " + projectArchitect.toString() + "\n"
                         + "\nArchitect Details: " + projectCustomer.toString() + "\n"
                         + "\nContractor Details: " + projectContractor.toString() + "\n";
         return allProjectInfo;



    }




}
