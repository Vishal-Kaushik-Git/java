import java.util.Scanner;

public class factorial {

public static void Factorial(int n, int f){
    if(n==1 || n==0){
        System.out.println("Factorial is " +f);
        return;
    }
    f = f*n;
    Factorial(--n, f);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int n = sc.nextInt();
    int f = 1;
    Factorial(n, f);

    sc.close();
} 
}
