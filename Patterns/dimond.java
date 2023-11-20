public class dimond {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(i+j==5 || i+j==11 || i==5 && j==2 || i==6 && j==3 || i==2 && j==5 || i==3 && j==6){
                  System.out.print(" * ");
                }else
                 System.out.print("   ");
            }
            System.out.println();
        }
    }
}
