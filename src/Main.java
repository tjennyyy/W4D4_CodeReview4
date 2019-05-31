import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        /*
        (10) Create 8 or more Bike objects in your main().
        (10) Put in your main() all existing Bikes in a HashMap that uses bikeID as a source for key value.
        */

        Bike b1 = new Bike("blue", Bike.BikeState.CanBeRended);
        Bike b2 = new Bike("red", Bike.BikeState.CanNotRended);
        Bike b3 = new Bike("green", Bike.BikeState.InService);
        Bike b4 = new Bike("yellow", Bike.BikeState.Discarded);
        Bike b5 = new Bike("grey", Bike.BikeState.CanBeRended);
        Bike b6 = new Bike("black", Bike.BikeState.InService);
        Bike b7 = new Bike("white", Bike.BikeState.CanNotRended);
        Bike b8 = new Bike("purple", Bike.BikeState.Discarded);

        HashMap<Integer, Bike.BikeState> allBikes = new HashMap<>();
        allBikes.put(b1.getBikeID(), b1.getState());
        allBikes.put(b2.getBikeID(), b2.getState());
        allBikes.put(b3.getBikeID(), b3.getState());
        allBikes.put(b4.getBikeID(), b4.getState());
        allBikes.put(b5.getBikeID(), b5.getState());
        allBikes.put(b6.getBikeID(), b6.getState());
        allBikes.put(b7.getBikeID(), b7.getState());
        allBikes.put(b8.getBikeID(), b8.getState());

        System.out.println(allBikes.get(b1.getState()));
        System.out.println(allBikes.get(b3.getBikeID()));
        System.out.println(allBikes.get(b5.getColour()));



        /*
        (10) Create Stations class containing following parameters:
             stationID (Integer)
             location (String)
             bikes: Bikes data structure is storing all Bikes that are currently in this station.
             Decide yourself what data structure you want to use
        (10) Create 3 Station object in your main() and put them in a HashMap stations
        */

        ArrayList<Bike> bs1 = new ArrayList<>();
        ArrayList<Bike> bs2 = new ArrayList<>();
        ArrayList<Bike> bs3 = new ArrayList<>();

        Station s1 = new Station("Karlsplatz", bs1);
        Station s2 = new Station("Oper", bs2);
        Station s3 = new Station("Schwedenplatz", bs3);

        HashMap<Integer, Station> allStations = new HashMap<>();
        allStations.put(s1.getStationID(), s1);
        allStations.put(s2.getStationID(), s2);
        allStations.put(s3.getStationID(), s3);

        System.out.println(allStations.get(s1.getStationID()));
        System.out.println(allStations.get(s2.getStationID()));

        /*
        (10) Create a method of Station class:
             addBike(... some parameter here ..) that is storing a Bike in a Station.
        (10) Demonstrate the usage of addBike(...)  method by calling it in your main() method (put 3 bikes in Station1, and put 4 bikes in Station2).
        */
        s1.addBike(b1);
        s1.addBike(b2);
        s1.addBike(b3);

        s2.addBike(b4);
        s2.addBike(b5);
        s2.addBike(b6);
        s2.addBike(b7);



        /*
        Create 4 users.
        (5) demonstrate the rental procedure:
            UserZ rents a bike bikeX from stationY1
            bikeX is removed from the data of that Station, and connected to a userZ
            userZ returns a bike to stationY2
        */

        User u1 = new User("Isis", "Pop");
        User u2 = new User("Nelson", "Pop");
        User u3 = new User("Iris", "Purple");
        User u4 = new User("Noah", "Purple");
        User u5 = new User("Matilda", "Hops");
        User u6 = new User("Matt", "Hops");
        User u7 = new User("Petra", "Flop");
        User u8 = new User("Peter", "Flop");

        HashMap<Integer, User> allUsers = new HashMap<>();
        allUsers.put(u1.getUserID(), u1);
        allUsers.put(u2.getUserID(), u2);
        allUsers.put(u3.getUserID(), u3);
        allUsers.put(u4.getUserID(), u4);

        System.out.println(allUsers.get(u3.getUserID()));
        System.out.println("User :" + allUsers.get(u1));





















        System.out.println();



    }
}
