package managementOfFlights;

public class Flight {
	/*The Flight class has the following attributes:

      flightNumber: a string representing the unique identifier of the flight
      origin: a string representing the origin of the flight
      destination: a string representing the destination of the flight
      departureTime: a string representing the departure time of the flight
      arrivalTime: a string representing the arrival time of the flight
      isAvailable: a boolean indicating whether the flight is available for booking or not*/
    private String flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private boolean isAvailable;

    /*The constructor initializes the Flight object with the provided parameters:

     flightNumber
     origin
     destination
     departureTime
     arrivalTime
     The isAvailable attribute is set to true by default, indicating that the flight is initially available for booking.*/
    public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.isAvailable = true;
    }

    //The class provides getters and setters for all attributes, allowing external classes to access and modify the flight details.
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // The toString() method provides a string representation of the flight details, including the flight number, origin, destination, departure time, arrival time, and availability status.
    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    /*The bookFlight() method sets the isAvailable status to false when a flight is booked. 
     * If the flight is already booked (i.e., isAvailable is false), it prints a message indicating that the flight is not available for booking.*/ 
    public void bookFlight() {
        if (isAvailable) {
            setAvailable(false);
            System.out.println("Flight booked successfully!");
        } else {
            System.out.println("Flight is not available for booking.");
        }
    }

    // cancelBooking() method to set the isAvailable status to true when canceled
    public void cancelBooking() {
        if (!isAvailable) {
            setAvailable(true);
            System.out.println("Booking canceled successfully!");
        } else {
            System.out.println("Flight is already available for booking.");
        }
    }
}