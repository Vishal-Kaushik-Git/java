import java.util.Scanner;

public class MutlipleX {
    public static int MultipleofX(int x, int n){
        if(x == 0){
         return 0;
        }
        if(n == 0){
            return 1;
        }
        int value = MultipleofX(x, n-1);
        int calculate = x * value;
        return calculate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x ");
        int x = sc.nextInt();
        System.out.println("Enter value of n ");
        int n = sc.nextInt();
        int result = MultipleofX(x, n);
        System.out.println("Result is " +result);
        sc.close();
    }
}
