import java.util.Scanner;

public class febonnacci {

    public static void febonacci(int firstvalue, int nextvalue, int lastvalue){
       if(lastvalue == 0){
         return;
       }
     int sum = firstvalue + nextvalue;
     System.out.println(sum);
     febonacci(nextvalue, sum, lastvalue-1);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the last term ");
       int lastvalue = sc.nextInt();
       int firstvalue = 0;
       int nextvalue = 1;
       System.out.println(firstvalue);
       System.out.println(nextvalue);
       febonacci(firstvalue, nextvalue, lastvalue-2);
       sc.close();
    }
}
