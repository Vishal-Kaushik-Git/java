import java.util.Scanner;

public class stringinreverse {

    public static void string(String str, int idx){
        if(idx == 0){
        System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
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
