import java.util.Scanner;
import java.util.Stack;

public class bracket {
    public static boolean isValid(String str) {
        Stack<Character> stc = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);   
        if (ch == '(' || ch == '{' || ch == '[') {
                stc.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (isMatchingPair(stc.peek(), ch)) {
                    stc.pop();
                } else {
                    return false;
                }
            }
            System.out.println(stc);
        }
        return stc.isEmpty();
    }

    public static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') || (opening == '{' && closing == '}') || (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Expression: ");
        str = sc.nextLine();
        System.out.println(isValid(str));
        sc.close();
    }
}
