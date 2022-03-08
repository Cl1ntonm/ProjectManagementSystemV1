public class Person {
    //Attributes
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String address;

    // Contractor
    public Person (String name, String surname, String phoneNumber,String email, String address){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;

    }


    //Setters
    public void setName(String newName){
        name = newName;
    }
    public void setSurname(String newSurnane){
        surname = newSurnane;
    }
    public void setPhoneNumber(String newPhoneNumber){
        phoneNumber = newPhoneNumber;
    }
    public void setEmail(String newEmail){
        email = newEmail;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }

    //Getters
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }

    //Methods

    public String toString(){
        String personObject =
                  "Name: " + name +" "+ surname
                + "\nPhone Number: " + phoneNumber
                + "\nEmail Address: " + email
                + "\nAddress : " + address;
        return personObject;
    }




}

