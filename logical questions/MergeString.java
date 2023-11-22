import java.util.Scanner;

public class MergeString {

    public static void Merge(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (str1.length() + str2.length()); i++) {
            if (i < str1.length()) {
                sb.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                sb.append(str2.charAt(i));
            }
        }
        System.out.println("Merge string " + sb);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string ");
        String str2 = sc.nextLine();
        Merge(str1, str2);
        sc.close();

    }
}