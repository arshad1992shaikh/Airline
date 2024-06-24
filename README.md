
# Airline Management System

## Overview
This project is a simple airline management system implemented in Java. It includes functionalities for managing flights, passengers, and bookings. Additionally, it provides utility methods for string manipulation and wrapper class operations.

## Description of the Assignment
The objective of this assignment is to design and implement an airline management system in Java. The system should allow for managing flights, registering passengers, and handling bookings. Moreover, it should include utility classes to perform common operations on strings and wrapper classes.

### Requirements:
1. **Flight Management**: Create a `Flight` class to represent flight details and manage flight bookings.
2. **Passenger Management**: Create a `Passenger` class to manage passenger details and their booked flights.
3. **Airline Management**: Create an `Airline` class to manage the overall system, including adding/removing flights and registering/unregistering passengers.
4. **String Utilities**: Create a `StringUtil` class to provide methods for common string operations.
5. **Wrapper Utilities**: Create a `WrapperUtil` class to provide methods for operations involving wrapper classes.
6. **Main Class**: Implement a `Main` class to demonstrate and test the functionality of the system.

## Classes

### 1. `Flight`
Represents a flight with details such as flight number, origin, destination, departure time, arrival time, and availability status.

#### Methods:
- Constructor: Initializes flight details.
- Getters and Setters: Access and modify flight attributes.
- `bookFlight()`: Books the flight if available.
- `cancelBooking()`: Cancels the booking if it was booked.
- `toString()`: Provides a string representation of the flight details.

### 2. `Passenger`
Represents a passenger with details such as name, passport number, and an array of booked flights.

#### Methods:
- Constructor: Initializes passenger details.
- Getters and Setters: Access and modify passenger attributes.
- `bookFlight(Flight flight)`: Books a flight for the passenger.
- `cancelBooking(Flight flight)`: Cancels a booked flight for the passenger.
- `toString()`: Provides a string representation of the passenger details.

### 3. `Airline`
Manages the airline system, including flights and passengers.

#### Methods:
- Constructor: Initializes the airline with a maximum number of flights and passengers.
- `addFlight(Flight flight)`: Adds a new flight.
- `removeFlight(String flightNumber)`: Removes a flight based on flight number.
- `registerPassenger(Passenger passenger)`: Registers a new passenger.
- `unregisterPassenger(String passportNumber)`: Unregisters a passenger based on passport number.
- `bookFlight(String passportNumber, String flightNumber)`: Books a flight for a passenger.
- `cancelBooking(String passportNumber, String flightNumber)`: Cancels a booking for a passenger.
- `listAvailableFlights()`: Lists all available flights.
- `listBookedFlights()`: Lists all booked flights.

### 4. `StringUtil`
Provides utility methods for string manipulation.

#### Methods:
- `countOccurrences(String str, char ch)`: Counts occurrences of a character in a string.
- `reverseString(String str)`: Reverses a given string.
- `isPalindrome(String str)`: Checks if a string is a palindrome.
- `capitalizeWords(String str)`: Capitalizes the first letter of each word in a string.

### 5. `WrapperUtil`
Provides utility methods for operations involving wrapper classes.

#### Methods:
- `findMax(Integer[] numbers)`: Finds the maximum value in an array of integers.
- `calculateAverage(Double[] numbers)`: Calculates the average of an array of doubles.
- `convertToBooleanArray(String binaryString)`: Converts a binary string to a Boolean array.
- `convertToBinaryString(Boolean[] booleanArray)`: Converts a Boolean array to a binary string.

## Main Class
The `Main` class tests the system by:
- Instantiating flights, passengers, and the airline.
- Adding flights and registering passengers.
- Performing bookings and cancellations.
- Listing available and booked flights.
- Testing string manipulation and wrapper class operations.

## How to Run
1. Compile the Java files:
   ```bash
   javac managementOfFlights/*.java
