import java.util.Scanner;
public class movingelementinarray {

public static void MoveChar(String str, int idx, char ch){
     StringBuilder sb = new StringBuilder(str);
     if(idx == str.length()-1){
        System.out.println("New String " +sb);
              return;
     }
      if(ch == sb.charAt(idx)){
        sb.deleteCharAt(idx);
        sb.append(ch);
        System.out.println("New String " +sb);
     }
       MoveChar(str, idx+1, ch);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your old String ");
        String str = sc.nextLine();
        System.out.println("enter the character ");
        char ch = sc.next().charAt(0);
       MoveChar(str, 0, ch);
        sc.close();
    }
}
