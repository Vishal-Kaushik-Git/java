import java.util.Scanner;
import java.util.Stack;

public class bracket {
    public static boolean isValid(String str) {
        Stack<Character> stc = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')' || ch == '}' || ch == ']'){
                while(stc.peek() != '(' || stc.peek() != '{' || stc.peek() != '['){
                    stc.pop();
                }
                stc.pop();
            }else{
                stc.push(ch);
            }
            System.out.println(stc);
        }
        if(stc.size()>=0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Right Paranthesis ");
        str = sc.nextLine();
        System.out.println(isValid(str));
        sc.close();

    }
}
