package managementOfFlights;
//The Main class is the entry point of the program. It contains the main method, which is the starting point of the program.
public class Main {
    public static void main(String[] args) {
        /*
          Three Flight objects are created with the following details:*/
        Flight flight1 = new Flight("AA123", "Mumbai", "London", "10:00 AM", "1:00 PM");
        Flight flight2 = new Flight("BA456", "London", "New York", "11:00 AM", "2:00 PM");
        Flight flight3 = new Flight("CA789", "Delhi", "Mumbai", "9:00 AM", "12:00 PM");

        // Two Passenger objects are created with the following details:
        Passenger passenger1 = new Passenger("Shaikh Arshad", "P123456");
        Passenger passenger2 = new Passenger("Rhutvik Sir", "P654321");

        // An Airline object is created with a maximum capacity of 5 flights and 5 passengers
        Airline airline = new Airline(5, 5); // Max 5 flights and 5 passengers for simplicity

        //The three flights are added to the airline, and the two passengers are registered with the airline.
        airline.addFlight(flight1);
        airline.addFlight(flight2);
        airline.addFlight(flight3);

        // The program attempts to book flights for the two passengers:
        airline.registerPassenger(passenger1);
        airline.registerPassenger(passenger2);

        // Perform bookings, The program lists the available flights and booked flights.
        airline.bookFlight(passenger1.getPassportNumber(), flight1.getFlightNumber());
        airline.bookFlight(passenger2.getPassportNumber(), flight2.getFlightNumber());

        // List available and booked flights
        airline.listAvailableFlights();
        airline.listBookedFlights();

        // The program cancels the booking for passenger1 on flight1.
        airline.cancelBooking(passenger1.getPassportNumber(), flight1.getFlightNumber());

        // The program lists the available flights and booked flights again after the cancellation
        airline.listAvailableFlights();
        airline.listBookedFlights();

        /*StringUtil Class Testing

        The program tests the StringUtil class by performing the following operations:

        Counting the occurrences of 'l' in the string "hello world"
        Reversing the string "hello world"
        Checking if "hello world" is a palindrome
        Capitalizing the words in "hello world"*/
        String testString = "hello world";
        System.out.println("Occurrences of 'l' in '" + testString + "': " + StringUtil.countOccurrences(testString, 'l'));
        System.out.println("Reversed string of '" + testString + "': " + StringUtil.reverseString(testString));
        System.out.println("Is '" + testString + "' a palindrome? " + StringUtil.isPalindrome(testString));
        System.out.println("Capitalized words in '" + testString + "': " + StringUtil.capitalizeWords(testString));
        

        /*WrapperUtil Class Testing
        The program tests the WrapperUtil class by performing the following operations:

        Finding the maximum value in an array of integers
        Calculating the average value in an array of doubles
        Converting a binary string to a boolean array and back to a binary string*/
        Integer[] integers = {1, 2, 3, 4, 5};
        System.out.println("Max value in integers array: " + WrapperUtil.findMax(integers));
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Average value in doubles array: " + WrapperUtil.calculateAverage(doubles));
        String binaryString = "10101";
        Boolean[] booleanArray = WrapperUtil.convertToBooleanArray(binaryString);
        System.out.print("Boolean array from binary string '" + binaryString + "': ");
        for (Boolean bool : booleanArray) {
            System.out.print(bool + " ");
        }
        System.out.println();
        System.out.println("Binary string from boolean array: " + WrapperUtil.convertToBinaryString(booleanArray));
    }
}/*The program uses the following classes:

   Flight: represents a flight with a flight number, origin, destination, departure time, and arrival time
   Passenger: represents a passenger with a name and passport number
   Airline: represents an airline with a maximum capacity for flights and passengers, and methods for adding flights, registering passengers, booking flights, and canceling bookings
   StringUtil: provides utility methods for string manipulation, such as counting occurrences, reversing strings, checking palindromes, and capitalizing words
   WrapperUtil: provides utility methods for working with wrapper classes, such as finding maximum values, calculating averages, and converting between binary strings and boolean arrays*/
