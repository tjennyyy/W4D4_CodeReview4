
import java.util.Calendar;
import java.util.GregorianCalendar;




    /*
        Additional points: 
       (10) assure that a Station has the upper limit of bikes that can be returned (for instance, max 5 bikes).
       If someone wants to call the method addBike(...), and the station is full, report that to the user over System.out.println() and prevent
       (10) Add the rental tracking per user. User and Rent (new class) are connected, and the Rent class is tracking:
            BikeID,
            RentStart (DateTime)
            RentEnd (DateTime)  
    */


public class Rent {

     Integer bikeRentID;
     GregorianCalendar rentStart;
     GregorianCalendar rentEnd;

    public Rent(Integer bikeRentID, GregorianCalendar rentStart, GregorianCalendar rentEnd){
        this.bikeRentID = bikeRentID;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }

    public Integer getBikeRentID() {
        return bikeRentID;
    }

    public void setBikeRentID(Integer bikeRentID) {
        this.bikeRentID = bikeRentID;
    }

    public GregorianCalendar getRentStart() {
        return rentStart;
    }

    public void setRentStart(GregorianCalendar rentStart) {
        this.rentStart = rentStart;
    }

    public GregorianCalendar getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(GregorianCalendar rentEnd) {
        this.rentEnd = (GregorianCalendar) Calendar.getInstance();
    }

}
