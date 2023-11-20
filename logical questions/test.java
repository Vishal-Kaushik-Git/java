public class test {
    public static void main(String[] args){

int n =3;
String a1 = "A";
String b1 = "B";
String c1 = "C";
rFnc(n,a1,b1,c1);

    }

   public static void rFnc(int a, String a2, String b2, String c2){
      
    if(a==1){
    System.out.println("Transfer "+a+" from "+a2+" to "+c2);
    return;
    }
    //  disk S  D  H
    rFnc(a-1,a2,c2,b2);
    System.out.println("Transfer "+a+" from "+a2+" to "+c2);
    //  disk H  S  D
    rFnc(a-1,b2,a2,c2);
    }
}
