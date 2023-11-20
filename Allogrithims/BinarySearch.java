import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Enter the Number ");

        int NumbertoFind = sc.nextInt();

        System.out.println("Index Position of Number is " +binarySearch(numbers, NumbertoFind));

        sc.close();

    }
    
    private static int binarySearch(int[] numbers, int NumbertoFind){
        int low = 0;
        int high = numbers.length -1;

        while(high>=low){
         int MiddlePosition = (low + high)/2;
         int MiddleNumber = numbers[MiddlePosition];
         
         if(MiddleNumber == NumbertoFind){
            return MiddlePosition;
         }
         if(MiddleNumber > NumbertoFind){
            high = MiddlePosition - 1;
         }else if(MiddleNumber < NumbertoFind){
            low = MiddlePosition + 1;
         }
        }
        return -1;
    }
}