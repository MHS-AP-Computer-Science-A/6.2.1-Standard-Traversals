import java.util.Arrays;

public class StandardTraversals {

    /**
     * Returns the number of elements in the array that are odd.
     */
    public static int countOdds(int[] arr) {
        // TODO: Write a standard for-loop traversal.
        // Use an if-statement to count only odd values.
        return 0;
    }

    /**
     * Returns the sum of all even numbers in the array.
     */
    public static int sumEvens(int[] arr) {
        // TODO: Write a standard for-loop traversal.
        // Use an if-statement to check whether a value is even.
        return 0;
    }

    /**
     * Returns the index of the first element > 12.
     * Returns -1 if no such element exists.
     */
    public static int firstGreaterThanTwelve(int[] arr) {
        // TODO: Standard for-loop.
        // Use an if-statement to check whether an element meets the criteria.
        return -1;
    }

    /**
     * Returns true if the array contains ANY negative number.
     */
    public static boolean containsNegative(int[] arr) {
        // TODO: Standard for-loop.
        // Use an if-statement to check for negatives.
        return false;
    }

    /**
     * MUST USE A WHILE LOOP:
     * Returns the number of elements less than 5.
     */
    public static int countLessThanFive(int[] arr) {
        // TODO: Write a while-loop traversal starting at index 0.
        // Use an if-statement to count values less than 5.
        return 0;
    }



     public static void main(String[] args) {

        // Create a random array of 10 integers from 0 to 19
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 23) - 2; // numbers -2 – 20
        }

        // Print the array
        System.out.println("Array:\n" + Arrays.toString(nums));
        System.out.println("\n");

        // Method calls
        System.out.println("Count of odd numbers: " + countOdds(nums));
        System.out.println("Sum of even numbers: " + sumEvens(nums));
        System.out.println("Index of first number greater than 12: " + firstGreaterThanTwelve(nums));
        System.out.println("Contains negative? " + containsNegative(nums));

        // Method that MUST use a while loop:
        System.out.println("Number of values less than 5: " + countLessThanFive(nums));
    }
}

