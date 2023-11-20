import java.util.Scanner;

public class subsequence {

    public static void sequence(String str, int idx, String newstr){
        if(idx == str.length()){
          System.out.println(newstr);
            return;
        }
        sequence(str, idx+1, newstr + str.charAt(idx)); // include char at current idx
        sequence(str, idx+1, newstr); // exclude char at curent idx
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        sc.close();
        sequence(str, 0, "");

    }
}
