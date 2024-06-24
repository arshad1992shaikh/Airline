package managementOfFlights;

public class Airline {
	/*The Airline class has the following attributes:

          flights: an array of Flight objects representing the flights managed by the airline
          passengers: an array of Passenger objects representing the passengers registered with the airline
          flightCount: an integer representing the number of flights currently managed by the airline
          passengerCount: an integer representing the number of passengers currently registered with the airline*/
    private Flight[] flights;
    private Passenger[] passengers;
    private int flightCount;
    private int passengerCount;

    /*The constructor initializes the Airline object with the provided parameters:

      maxFlights: the maximum number of flights that can be managed by the airline
      maxPassengers: the maximum number of passengers that can be registered with the airline
      The flights and passengers arrays are initialized with the specified sizes, and the flightCount and passengerCount are set to 0*/ 
    public Airline(int maxFlights, int maxPassengers) {
        this.flights = new Flight[maxFlights];
        this.passengers = new Passenger[maxPassengers];
        this.flightCount = 0;
        this.passengerCount = 0;
    }

    // addFlight(Flight flight): adds a new flight to the flights array if the maximum number of flights has not been reached.
    public void addFlight(Flight flight) {
        if (flightCount < flights.length) {
            flights[flightCount] = flight;
            flightCount++;
            System.out.println("Flight added successfully.");
        } else {
            System.out.println("Maximum number of flights reached. Cannot add more flights.");
        }
    }

    // removeFlight(String flightNumber): removes a flight from the flights array based on the flight number.
    public void removeFlight(String flightNumber) {
        for (int i = 0; i < flightCount; i++) {
            if (flights[i].getFlightNumber().equals(flightNumber)) {
                flights[i] = null;
                flightCount--;
                System.out.println("Flight removed successfully.");
                return;
            }
        }
        System.out.println("Flight not found.");
    }

    // registerPassenger(Passenger passenger) method to register a new passenger in the system
    public void registerPassenger(Passenger passenger) {
        if (passengerCount < passengers.length) {
            passengers[passengerCount] = passenger;
            passengerCount++;
            System.out.println("Passenger registered successfully.");
        } else {
            System.out.println("Maximum number of passengers reached. Cannot register more passengers.");
        }
    }

    // unregisterPassenger(String passportNumber) method to unregister a passenger from the system based on passport number
    public void unregisterPassenger(String passportNumber) {
        for (int i = 0; i < passengerCount; i++) {
            if (passengers[i].getPassportNumber().equals(passportNumber)) {
                passengers[i] = null;
                passengerCount--;
                System.out.println("Passenger unregistered successfully.");
                return;
            }
        }
        System.out.println("Passenger not found.");
    }

    // bookFlight(String passportNumber, String flightNumber) method to book a flight for a passenger based on passport number and flight number
    public void bookFlight(String passportNumber, String flightNumber) {
        Passenger passenger = findPassenger(passportNumber);
        Flight flight = findFlight(flightNumber);
        if (passenger!= null && flight!= null) {
            passenger.bookFlight(flight);
        } else {
            System.out.println("Passenger or flight not found.");
        }
    }

    // cancelBooking(String passportNumber, String flightNumber) method to cancel a booked flight for a passenger based on passport number and flight number
    public void cancelBooking(String passportNumber, String flightNumber) {
        Passenger passenger = findPassenger(passportNumber);
        Flight flight = findFlight(flightNumber);
        if (passenger!= null && flight!= null) {
            passenger.cancelBooking(flight);
        } else {
            System.out.println("Passenger or flight not found.");
        }
    }

    // listAvailableFlights() method to list all available flights in the system
    public void listAvailableFlights() {
        System.out.println("Available Flights:");
        for (int i = 0; i < flightCount; i++) {
            if (flights[i].isAvailable()) {
                System.out.println(flights[i].toString());
            }
        }
    }

    // listBookedFlights() method to list all booked flights in the system
    public void listBookedFlights() {
        System.out.println("Booked Flights:");
        for (int i = 0; i < flightCount; i++) {
            if (!flights[i].isAvailable()) {
                System.out.println(flights[i].toString());
            }
        }
    }

    // Helper method to find a passenger based on passport number
    private Passenger findPassenger(String passportNumber) {
        for (int i = 0; i < passengerCount; i++) {
            if (passengers[i].getPassportNumber().equals(passportNumber)) {
                return passengers[i];
            }
        }
        return null;
    }

    // Helper method to find a flight based on flight number
    private Flight findFlight(String flightNumber) {
        for (int i = 0; i < flightCount; i++) {
            if (flights[i].getFlightNumber().equals(flightNumber)) {
                return flights[i];
            }
        }
        return null;
    }
}
