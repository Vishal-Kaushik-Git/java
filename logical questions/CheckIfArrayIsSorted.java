import java.util.Scanner;

public class CheckIfArrayIsSorted {

    public static boolean Sorted(int arr[], int idx) {
        if (arr[idx] <= arr[idx + 1]) {
            return Sorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the array ");
        arr[10] = sc.nextInt();
        boolean result = Sorted(arr, 0);
        System.out.println("Result is " + result);
        sc.close();

    }
}
