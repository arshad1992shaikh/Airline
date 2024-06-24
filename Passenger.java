package managementOfFlights;

public class Passenger {
    private String name;
    private String passportNumber;
    private Flight[] bookedFlights;
    private int bookedFlightCount;

    // Constructor to initialize the passenger details
    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.bookedFlights = new Flight[10]; // Initialize an array to store up to 10 booked flights
        this.bookedFlightCount = 0;
    }

    // Getters and setters for all attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Flight[] getBookedFlights() {
        return bookedFlights;
    }

    public void setBookedFlights(Flight[] bookedFlights) {
        this.bookedFlights = bookedFlights;
    }

    public int getBookedFlightCount() {
        return bookedFlightCount;
    }

    public void setBookedFlightCount(int bookedFlightCount) {
        this.bookedFlightCount = bookedFlightCount;
    }

    // toString() method to provide a string representation of the passenger details
    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", bookedFlightCount=" + bookedFlightCount +
                '}';
    }

    /*The bookFlight() method allows the passenger to book a flight. It checks if the passenger has already booked the maximum number of flights (10 in this case).
     *   If not, it adds the flight to the bookedFlights array, increments the bookedFlightCount, and calls the bookFlight() method on the Flight object to mark it as booked*/ 
    
    public void bookFlight(Flight flight) {
        if (bookedFlightCount < bookedFlights.length) {
            bookedFlights[bookedFlightCount] = flight;
            bookedFlightCount++;
            flight.bookFlight(); // Book the flight
            System.out.println("Flight booked successfully for " + name);
        } else {
            System.out.println("Maximum number of flights booked. Cannot book more flights.");
        }
    }

    // cancelBooking(Flight flight) method to cancel a booked flight for the passenger and update the booked flights array
    public void cancelBooking(Flight flight) {
        for (int i = 0; i < bookedFlightCount; i++) {
            if (bookedFlights[i] == flight) {
                bookedFlights[i] = null;
                bookedFlightCount--;
                flight.cancelBooking(); // Cancel the flight
                System.out.println("Booking canceled successfully for " + name);
                return;
            }
        }
        System.out.println("Flight not found in booked flights.");
    }
}