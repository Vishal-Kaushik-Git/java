import java.util.Scanner;
import java.util.Stack;

public class bracket {
    public static void main(String[] args){
        Stack<Character> stc = new Stack<>();
        String str = new String();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string ");
        str = sc.nextLine();
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                stc.push(i);
            }
        }
    }
}
