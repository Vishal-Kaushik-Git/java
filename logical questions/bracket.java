import java.util.Scanner;
import java.util.Stack;

public class bracket {

    public static boolean isvalid(String str){
     Stack<Character> stc = new Stack<>();
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                stc.push(ch);
            }else if(ch == '{'){
                stc.push(ch);
            }else if(ch == '['){
                stc.push(ch);
            }else{
            if(stc.size()==0){
                return false;
            }
            if(stc.peek() == '('){
                stc.pop();

            }else if(stc.peek() == '{'){
                stc.pop();
              
            }else if(stc.peek() == '['){
                    stc.pop();
                }
            }
        }
        if(stc.size()>0){
            return false;
        }
        return true;
        
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        System.out.println(isvalid(str));
        sc.close();
    }
}
