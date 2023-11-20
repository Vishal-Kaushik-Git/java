import java.util.Scanner;

public class Adding_an_Integer {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int sum = 0;
         while(num>0){
            int last_Digit = num % 10;
            sum = sum + last_Digit;
            num = num / 10;
         }
         sc.close();
         System.out.println("Sum of an Integer is " +sum);
    
    }
}
