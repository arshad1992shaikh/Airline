package managementOfFlights;
//This is a Java class called WrapperUtil that provides four static methods for working with arrays and strings. Here's a breakdown of each method:

public class WrapperUtil {
    /*This method finds the maximum value in an array of Integer objects. It takes an array of Integer objects as input and returns the maximum value as an Integer object. 
     * If the input array is null or empty, the method returns null.

      Here's how it works:

      It checks if the input array is null or empty. If so, it returns null.
      It initializes a variable max with the first element of the array.
      It iterates through the rest of the array, comparing each element with the current max value. If it finds a larger value, it updates max.
      Finally, it returns the maximum value max.
      Example: WrapperUtil.findMax(new Integer[] {1, 2, 3, 4, 5}) would return 5.*/
    public static Integer findMax(Integer[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        Integer max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /*This method calculates the average of an array of Double objects. It takes an array of Double objects as input and returns the average value as a Double object. 
     * If the input array is null or empty, the method returns null.

      Here's how it works:

      It checks if the input array is null or empty. If so, it returns null.
      It initializes a variable sum to 0.
      It iterates through the array, adding each element to the sum.
      Finally, it returns the average value by dividing the sum by the length of the array.
      Example: WrapperUtil.calculateAverage(new Double[] {1.0, 2.0, 3.0, 4.0, 5.0}) would return 3.0.*/
    public static Double calculateAverage(Double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    /*This method converts a binary string (a string consisting of only '0' and '1' characters) to a Boolean array.
     *  It takes a binary string as input and returns a Boolean array where each element corresponds to a character in the input string.

     Here's how it works:

     It creates a Boolean array of the same length as the input string.
     It iterates through the input string, converting each character to a Boolean value (true if the character is '1', false if it's '0').
     Finally, it returns the Boolean array.
     Example: WrapperUtil.convertToBooleanArray("10101") would return a Boolean array [true, false, true, false, true].*/ 
    public static Boolean[] convertToBooleanArray(String binaryString) {
        Boolean[] booleanArray = new Boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            booleanArray[i] = binaryString.charAt(i) == '1';
        }
        return booleanArray;
    }

    /*This method converts a binary string (a string consisting of only '0' and '1' characters) to a Boolean array. 
     * It takes a binary string as input and returns a Boolean array where each element corresponds to a character in the input string.

      Here's how it works:

     It creates a Boolean array of the same length as the input string.
     It iterates through the input string, converting each character to a Boolean value (true if the character is '1', false if it's '0').
     Finally, it returns the Boolean array.
     Example: WrapperUtil.convertToBooleanArray("10101") would return a Boolean array [true, false, true, false, true].*/
    public static String convertToBinaryString(Boolean[] booleanArray) {
        StringBuilder binaryString = new StringBuilder();
        for (Boolean bool : booleanArray) {
            binaryString.append(bool ? '1' : '0');
        }
        return binaryString.toString();
    }
}