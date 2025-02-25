/**
 * Test class for the GenericUtils<T> class.
 * It tests both reversing arrays and calculating the sum of numeric arrays.
 * @author Meerab Wali
 * @version 2025-02-25
 */
public class UtilsTest {
        public static void main(String[] args) {
            testReverseArray();
            testSumArray();
        }

        /**
         * Tests the reverse method of the GenericUtils class with different types of arrays.
         */
        private static void testReverseArray() {
            System.out.println("Testing Reverse Method...");

            // Create a new instance of GenericUtils
            GenericUtils utils = new GenericUtils();

            // Test: Reversing a String array
            System.out.println("Testing reverse operation with String array...");
            String[] strArray = {"apple", "banana", "cherry", "date"};
            String[] reversedStrArray = utils.reverse(strArray);

            // Verifying reversed array output
            String expectedReversedStr = "date cherry banana apple";
            String actualReversedStr = String.join(" ", reversedStrArray);
            checkOutput(actualReversedStr, expectedReversedStr);

            // Test: Reversing an Integer array
            System.out.println("Testing reverse operation with Integer array...");
            Integer[] intArray = {1, 2, 3, 4, 5};
            Integer[] reversedIntArray = utils.reverse(intArray);

            // Verifying reversed array output
            String expectedReversedInt = "5 4 3 2 1";
            String actualReversedInt = String.join(" ", toStringArray(reversedIntArray));
            checkOutput(actualReversedInt, expectedReversedInt);

            System.out.println(); // Blank line for readability
        }

        /**
         * Tests the sum method of the GenericUtils class with different numeric arrays.
         */
        private static void testSumArray() {
            System.out.println("Testing Sum Method...");

            // Create a new instance of GenericUtils
            GenericUtils utils = new GenericUtils();

            // Test: Summing an Integer array
            System.out.println("Testing sum operation with Integer array...");
            Integer[] intNumbers = {10, 20, 30, 40, 50};
            double intSum = utils.sum(intNumbers);

            // Verifying sum output
            double expectedIntSum = 150.0;
            checkOutput(Double.toString(intSum), Double.toString(expectedIntSum));

            // Test: Summing a Double array
            System.out.println("Testing sum operation with Double array...");
            Double[] doubleNumbers = {1.5, 2.5, 3.5, 4.5};
            double doubleSum = utils.sum(doubleNumbers);

            // Verifying sum output
            double expectedDoubleSum = 12.0;
            checkOutput(Double.toString(doubleSum), Double.toString(expectedDoubleSum));

            System.out.println(); // Blank line for readability
        }

        /**
         * Converts an array of Integers to an array of Strings for easier comparison.
         *
         * @param array The array of Integers.
         * @return A String array representation of the Integer array.
         */
        private static String[] toStringArray(Integer[] array) {
            String[] stringArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                stringArray[i] = array[i].toString();
            }
            return stringArray;
        }

        /**
         * Compares the actual output with the expected output and prints the result.
         *
         * @param actual The actual output of the method call.
         * @param expected The expected output.
         */
        private static void checkOutput(String actual, String expected) {
            if (actual.equals(expected)) {
                System.out.println("Output is correct: " + actual + " ✅");
            } else {
                System.out.println("Incorrect output! Expected: " + expected + " but got: " + actual + " ❌");
            }
        }

}


