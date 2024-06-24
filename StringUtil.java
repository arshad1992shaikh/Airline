package managementOfFlights;
// This is a Java class called StringUtil that provides four static methods for string manipulation. Here's a breakdown of each method:
public class StringUtil {
   //This method counts the number of occurrences of a character ch in a given string str. 
	//It iterates through each character of the string using a for loop and increments a counter count whenever it finds a match. The method returns the total count of occurrences.
	//Example: StringUtil.countOccurrences("hello", 'l') would return 2, since the character 'l' appears twice in the string "hello".
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    //This method reverses a given string str. It uses a StringBuilder object to build the reversed string.
    //It iterates through each character of the original string in reverse order (from last to first) and appends each character to the StringBuilder.
    // Finally, it returns the reversed string as a String object.
    //Example: StringUtil.reverseString("hello") would return "olleh".
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    //This method checks if a given string str is a palindrome. 
    //It uses the reverseString method to reverse the string and then compares the original string with the reversed string using the equals method.
    //If they are equal, the method returns true, indicating that the string is a palindrome.
    //Example: StringUtil.isPalindrome("madam") would return true, since "madam" is a palindrome.
    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    // This method capitalizes the first letter of each word in a given string str. It uses a StringBuilder object to build the capitalized string.
    // It iterates through each character of the original string and checks if the character is a whitespace character.
    // If it is, it sets a flag capitalizeNext to true. If the flag is true, it capitalizes the next non-whitespace character using Character.toUpperCase and appends it to the StringBuilder.
    //Finally, it returns the capitalized string as a String object.
    //Example: StringUtil.capitalizeWords("hello world") would return "Hello World"
    public static String capitalizeWords(String str) {
        StringBuilder capitalized = new StringBuilder();
        boolean capitalizeNext = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                capitalized.append(ch);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                capitalized.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                capitalized.append(ch);
            }
        }
        return capitalized.toString();
    }
}