import java.util.Scanner;

public class FirstLastOfString {
   
    public static void string(String str, int idx){
        if(idx == str.length()-1){
        System.out.println("last cahracter of string is " +str.charAt(idx));
        }
        if(idx == 0){
        System.out.println("First character of string is " +str.charAt(idx));
            return;
        }
        // System.out.print(str.charAt(idx));
        string(str, idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String str = sc.nextLine();
        sc.close();
        string(str, str.length()-1);
    }
}
