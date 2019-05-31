
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Rent {

    private Integer bikeRentID;
    private GregorianCalendar rentStart;
    private GregorianCalendar rentEnd;

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
