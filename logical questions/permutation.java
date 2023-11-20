import java.util.Scanner;

public class permutation {

  //--------------------------out of reach----------------------

    public static void Prem(String str, int idx){
          StringBuilder sb = new StringBuilder(str);
          if(idx == str.length()-1){
            System.out.println(str);
            return;
          }
          for(int i=0; i<str.length(); i++){
            str = sb.substring(0, idx) + sb.substring(idx+1);
            Prem(str, idx+1);
          }
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        Prem(str, 0);
        sc.close();
    }
}
