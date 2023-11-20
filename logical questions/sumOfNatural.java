import java.util.Scanner;

public class sumOfNatural {

public static void NaturalNumber(int endValue, int sum, int startValue){
    if(startValue == endValue){
      sum += startValue;
      System.out.println("sum is " +sum);
      return;
     }
     sum += startValue;
     NaturalNumber(endValue, sum, ++startValue);
}

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the end value ");
       int endValue = sc.nextInt();
       sc.close();
      NaturalNumber(endValue, 0 , 1);

  }
}