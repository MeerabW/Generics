/**
 * A utility class providing generic methods for array manipulation.
 * Includes methods to reverse an array and compute the sum of numeric arrays.
 * @author Meerab Wali
 * @version 2025-02-25
 */
public class GenericUtils {
    /**
     * Reverses the given array in-place.
     *
     * @param <T>   the type of elements in the array
     * @param array the array to be reversed
     * @return the reversed array
     */
    public <T> T[] reverse (T[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }
    /**
     * Calculates the sum of the elements in the given array.
     *
     * @param <T>   the type of elements in the array, must extend Number
     * @param array the array of numbers
     * @return the sum of all elements as a double
     */
    public  <T extends Number> double sum(T[] array) {
        double total = 0;
        for(int i= 0; i < array.length; i++) {
            total += array[i].doubleValue();
        }
        return total;
    }
}
