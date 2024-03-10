package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }
//passes

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }
//passes

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }
//passes

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }
//passes

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) ;
            return true;
        }
        return false;
    }
// passes

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length]; // creates new array at previous array length
        int temp = array.length; // creates counter that is just like i, but at the end of the array
        for (int i = 0; i < array.length; i++) { // iterates through array
            reversedArray[temp - 1] = array[i]; // temp is at the end, i is at the beginning
            temp = temp - 1; // makes the two switch
        }
        return reversedArray;
    }
// passes

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length; i++) { // iterates through array
            if (!array[i].equals(array[array.length - 1 - i])) { // if the array at i is the same it will return false
                return false;
            }

        }
        return true; // if it isn't, return true :)
    }
// passes

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String arrayAsString = array.toString(); // makes the array a string of characters

        for (char ch = 'a'; ch <= 'z'; ch++) { // loops through everything in the string as chars
            if (arrayAsString.contains(String.valueOf(ch))) { // if the array contains the value of each char
                return true; // return true
            }

        }
        return false; // return false if not :)
    }
// passes all but one??!?!?

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurences = 0; // set occurrences to 0

        for (String each : array) // for each string in the array,
            if (each.equals(value)) { // if that string equals the value you're trying to find
                occurences++; // increase
            }
        return occurences; // then return that number
    }
// passes

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int i, j; // use i to store the valueToRemove, use j to iterate
        for (i = 0, j = 0; j < array.length; j++) { // j is moving through the array to count
            if (!array[j].equals(valueToRemove)) { // if the array at j equals the value to remove,
                array[i++] = array[j]; // it'll move it to the ith position which doesn't exist
            }

        }
        array = Arrays.copyOf(array, i); // makes the original array the same, just with i
        return array;
    }
    // passes

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> newArray = new ArrayList<>(); // new array list initialized


        for (int i = 0; i < array.length-1; i++) { // makes counter that starts at the front and goes to the back
            if (!array[i].equals(array[i+1])) { // +1 because we're comparing to next letter. if the letter is not equal to the one before it,
                newArray.add(array[i]); // add to new array
            }
        }
         newArray.add(array[array.length-1]); // accounts for the last character because this would only go to 9

        return newArray.toArray(new String[0]); // returns array list but as a traditional array
    }
// passes
    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> newArray = new ArrayList<>(); // new array list because arrays can't do this
        String dupes = array[0]; // dupes = array at 0 because you need to account for the first index

        for (int i = 1; i < array.length; i++) { // loops through array at 1 because 0 is out of bounds
            if (array[i].equals(array[i - 1])) { // if the array at i is equal to the character before it,
                dupes += array[i]; // add to new string
            } else {
                newArray.add(dupes); // add the duplicates to the new array
                dupes = array[i]; // adds the old characters to the new one
            }
        }
        newArray.add(dupes); // add to last character
        return newArray.toArray(new String[0]); // returns the array list as a String array to pass test
    }
}

//passes

