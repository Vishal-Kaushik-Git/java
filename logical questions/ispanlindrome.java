import java.util.Scanner;

public class ispanlindrome {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int x = sc.nextInt();
       int rNum = 0; // Reverse Number
       int oNum = x; // orginal Number

       while(x>0){

     int lDigit = x%10;
     rNum = rNum * 10 + lDigit;
     x = x/10; // value of x changed here that's why we used oNum

       }
       if(rNum == oNum){
        System.out.println("Number is palindrome");
       }else{
        System.out.println("Number is not palindrome");
       }
       sc.close();
    }
}
