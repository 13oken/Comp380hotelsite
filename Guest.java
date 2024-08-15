/**
*Guest class
*@since 8/10/2024
*@author Thanim Uddin
*Stores the information of a guest who is looking to reserve a room in the hotel. It will store the user's name, email, and phone number.
*/
public class Guest {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    
    /**
    *Constructor that creates a new Guest using the information provided by the user
    *@param name the guest's first and last name, email, and phone number
    */
    
    public Guest(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    /**
    *@return the guest's first name
    */
    
    public String getFirstName() {
        return firstName;
    }

    /**
    *Sets the guest's first name
    */
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
    *@return the guest's last name
    */
    
    public String getLastName() {
        return lastName;
    }

    /**
    *Sets the guest's last name
    */
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
    *@return the guest's email
    */
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
    *@return the guest's number
    */
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
