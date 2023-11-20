import java.util.Random;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        Random rand = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) { // Remove the extra semicolon
            array[i] = rand.nextInt(100);
            // System.out.println(array); // This will print the reference to the array, not its contents
        }

        System.out.println("Original Array: " + Arrays.toString(array)); // Print the entire array

        Bubblesort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array)); // Print the sorted array
    }

    private static void Bubblesort(int[] number) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    swapped = true;
                    int temp = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = temp;
                }
            }
        }
    }
}
