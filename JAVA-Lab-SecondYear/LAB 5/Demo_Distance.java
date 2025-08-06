/*
13. Create a base class Distance which stores the distance between two locations in miles
and a method travelTime(). The method prints the time taken to cover the distance when
the speed is 60 miles per hour. Now in a derived class DistanceMKS, override
travelTime() so that it prints the time assuming the distance is in kilometers and the
speed is 100 km per second. Demonstrate the working of the classes.
 */
public class Demo_Distance {
    public static void main(String[] args) {
        Distance distMiles = new Distance(120);
        distMiles.travelTime();
        System.out.println();

        DistanceMKS distKm = new DistanceMKS(120);
        distKm.travelTime();
    }
}

class Distance {
    double distanceInMiles;

    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public void travelTime() {
        double speedInMph = 60.0;
        double time = distanceInMiles / speedInMph;
        System.out.println("Travel time at 60 mph (in miles): " + time + " hours");
    }
}

class DistanceMKS extends Distance {

    public DistanceMKS(double distanceInKilometers) {
        super(distanceInKilometers);
    }

    public void travelTime() {
        double speedInKps = 100.0;
        double time = distanceInMiles / speedInKps;
        System.out.println("Travel time at 100 km/s (in kilometers): " + time + " seconds");
    }
}
