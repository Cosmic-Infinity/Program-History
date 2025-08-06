/*TEST Questio: 

IDevelop a Smart Parking System that simulates parking lot management using exception handling. The system should allow users to:
1. Park a Vehicle: Users should enter vehicle details, and the system should allocate the next available parking spot.
2. Leave a Parking Spot: Users can check out, freeing up a parking spot.
3. Check Available Spots: Users can view the number of available spots in real-time.
Implement exception handling for the following scenarios:
1. Parking Lot Full: When a user tries to park in a full lot, display an appropriate message and suggest nearby parking alternatives.
2. Invalid Vehicle Entry: If a user inputs incorrect vehicle information (e.g., non-numeric license plate), the system should handle this with a clear error message.
3. Already Parked Vehicle: If a user attempts to park an already parked vehicle, the system should detect and handle this with an appropriate exception.
4. Spot Not Available: When trying to checkout from an unoccupied or incorrect spot, provide an exception to guide the user back to the correct spot.
5. Data Corruption: Simulate potential system failures (like data corruption or database connection loss) and implement appropriate error handling 
to ensure the system recovers gracefully.*/
class SmartParkingSystem {
    public static void main(String[] args) {
        try{
            ParkingLot parkingLot = new ParkingLot(10);
            try {
                parkingLot.parkVehicle();
                parkingLot.parkVehicle();
                parkingLot.parkVehicle();
            } catch (ParkingLotFullException e) {
                System.out.println(e.getMessage());
            }

            try {
                parkingLot.leaveParkingSpot(1);
                parkingLot.leaveParkingSpot(2);
            } catch (SpotNotAvailableException e) {
                System.out.println(e.getMessage());
            }

            parkingLot.checkAvailableSpots();
        }catch(Exception e){
            System.out.println("A possible corruption has been found. Please restart");
        }
    }
}

class ParkingLot {
    int totalSpots;
    int[] parkingSpots;
    int occupiedSpots;

    ParkingLot(int totalSpots) {
        this.totalSpots = totalSpots;
        this.parkingSpots = new int[totalSpots];
        this.occupiedSpots = 0;
    }

    public void parkVehicle() throws ParkingLotFullException {
        if (occupiedSpots == totalSpots) {
            throw new ParkingLotFullException("Parking lot is FULL.");
        }
        for (int i = 0; i < parkingSpots.length; i++) {
            if (parkingSpots[i] == 0) {
                parkingSpots[i] = 1;
                occupiedSpots++;
                System.out.println("Vehicle parked at: " + i);
                return;
            }
        }
    }

    public void leaveParkingSpot(int spot) throws SpotNotAvailableException {
        if (spot < 0 || spot >= totalSpots || parkingSpots[spot] == 0) {
            throw new SpotNotAvailableException("No vehicle is parked at: " + spot);
        }
        parkingSpots[spot] = 0;
        occupiedSpots--;
        System.out.println("Vehicle left the spot: " + spot);
    }

    public void checkAvailableSpots() {
        int availableSpots = totalSpots - occupiedSpots;
        System.out.println("Number of available spots: " + availableSpots);
    }
}

class ParkingLotFullException extends Exception {
    ParkingLotFullException(String message) {
        super(message);
    }
}

class InvalidVehicleEntryException extends Exception {
    InvalidVehicleEntryException(String message) {
        super(message);
    }
}

class AlreadyParkedVehicleException extends Exception {
    AlreadyParkedVehicleException(String message) {
        super(message);
    }
}

class SpotNotAvailableException extends Exception {
    SpotNotAvailableException(String message) {
        super(message);
    }
}

class DataCorruptionException extends Exception {
    DataCorruptionException(String message) {
        super(message);
    }
}
