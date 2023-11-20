import java.util.Scanner;

public class TowerOfHanoi {

    public static void Bhrama(int n, String src, String help, String dest){
        if(n==1){
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        Bhrama(n-1, src, dest, help);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        Bhrama(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of disks ");
        int n = sc.nextInt();
        Bhrama(n, "A", "B", "C");
        sc.close();
    }
}
