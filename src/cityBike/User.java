package cityBike;

import cityBike.Bike;

public class User {

    /*
    (10) Create cityBike.User class with parameters:
         userID
         name
         surname
        currentlyRentedBike: decide yourself if you are using a cityBike.Bike object, or a key (depending on your data model).
    */

    private int UserID;
    private String firstname;
    private String surname;
    private Bike currentlyRentedBike;
    static int userCounter;


    public User(String firstname, String surname) {
        this.UserID = userCounter++;
        this.firstname = firstname;
        this.surname = surname;

    }

    public int getUserID() {
        return this.UserID = UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getFirstname() {
        return this.firstname = firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return this.surname = surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Bike getCurrentlyRentedBike() {
        return this.currentlyRentedBike;
    }

    public void setCurrentlyRentedBike(Bike currentlyRentedBike) {
        this.currentlyRentedBike = currentlyRentedBike;
    }
}
