import java.util.Scanner;

public class Testing {

// public static void Test(int n){
//  if(n==0){
//     return;
//  }

// System.out.println("Hello World " +n);
// Test(n-1);
// System.out.println("Hello World " +n);

// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Numbers of time you wanna print ");
//         int n = sc.nextInt();
//         Test(n);
//         sc.close();
//     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        str = sb.substring(2);
        System.out.println(str);

        sc.close();
    }

}
