import java.util.Scanner;

public class removeduplicate {

    // ----------------incomplete------------------------

    public static void Duplicate(String str, int idx, int idx2) {
        StringBuilder sb = new StringBuilder(str);
        if (idx == sb.length()-1) {
            System.out.println("Without Duplicate characters " +str);
            return;
        }
        if (sb.charAt(idx) == sb.charAt(idx2)) {
            sb.deleteCharAt(idx); 
        }else{
        Duplicate(sb.toString(), idx+1, idx2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        Duplicate(str, 0, 1);
        sc.close();

    }
}
