package cityBike;



public class Bike {

    /*
    (10) Create a Java class cityBike.Bike containing following parameters:
           bikeID (Integer)
           color
           state (which can be CanBeRended, CanNotBeRented, InService, Discarded (aka so broken that the service do not pay off)

     (10) Create a cityBike.Bike constructor that is using a static variable to create and increment BikeID automatically on creation of new cityBike.Bike object.
     (10) Create 8 or more cityBike.Bike objects in your main().
     (10) Put in your main() all existing Bikes in a HashMap that uses bikeID as a source for key value.
    */


    private Integer bikeID;
    private String colour;
    private BikeState state;
    public enum BikeState{CanBeRended, CanNotRended, InService, Discarded}
    private static int bikeCounter = 1;


    public Bike(String colour, BikeState state){
        this.bikeID = bikeCounter++;
        this.colour = colour;
        this.state = state;
    }

    public Integer getBikeID(){
        return this.bikeID;
    }

    public void setBikeID(Integer bikeID){
        this.bikeID = bikeID;
    }


    public String getColour(){
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public BikeState getState(){
        return this.state;
    }

    public void setState(BikeState state) {
        this.state = state;
    }

}

