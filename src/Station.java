import java.util.ArrayList;
import java.util.Collection;

public class Station {

    private Integer stationID;
    private String location;
    private ArrayList<Bike> bikeInAStation;
    private static int stationCounter = 0;


    public Station(String location, ArrayList<Bike> bikeInAStation){
        this.stationID = stationCounter++;
        this.location = location;
        this.bikeInAStation = bikeInAStation;
    }

    public Integer getStationID(){
        return this.stationID;
    }

    public void setStationID(Integer stationID) {
        this.location = location;
    }

    public String getLocation(){
        return this.location;
    }

    public void setLocation(String location){
        this.location = location;
    }
    public ArrayList<Bike> getBikeInAStation(){
        return this.bikeInAStation;
    }

    public void setBikeInAStation(ArrayList<Bike> bikeInAStation){
        this.bikeInAStation = bikeInAStation;
    }

    public void addBike (Bike bike) {
       // this.bikeInAStation().add(bikeID);
        if (bikeInAStation.size() >= 5){
            System.out.println("Sorry, already full");
        }else {
            this.bikeInAStation.add(bike);
        }
    }
    public void removeBike(Bike bike){
        this.bikeInAStation.remove(bike);
    }


}







