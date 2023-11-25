import java.util.Scanner;
import java.util.Stack;

public class BalancedBrac {
    public static void main(String[] args){

        System.out.print("Enter your Expression : ");
        Scanner scn = new Scanner(System.in);
        String str =scn.nextLine();
        scn.close();
        Stack<Character> stc = new Stack<>();

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){

                while(stc.peek() != '('){
                    stc.pop();
                }
                stc.pop();

            }else if(ch == '}'){
                while (stc.peek() != '{') {
                    stc.pop();
                }
                stc.pop();

            }else if (ch == ']') {
                while (stc.peek() != '[') {
                    stc.pop();
                }
                stc.pop();
            }else{
                stc.push(ch);
            }
        }
if(stc.isEmpty()){
    System.out.println("Balanced Bracket");
    System.out.println(stc);
}else{
    System.out.println("Unbalanced Bracket");
    System.out.println(stc);
}

    }
}
