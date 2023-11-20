import java.util.Scanner;

public class testingpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int rNum = 0;
        while (x > 0) {

            int lDigit = x % 10;
            rNum = rNum * 10 + lDigit;
            x = x / 10;
             System.out.println("value of lDigit is " +lDigit);
             System.out.println("value of rNum is " +rNum);
             System.out.println("value of x is " +x);
        }
        sc.close();
    }
}