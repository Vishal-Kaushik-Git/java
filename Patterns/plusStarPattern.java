public class plusStarPattern {
    public static void main(String[] args) {
        int n=5;    
        for(int i =1; i<=n; i++){
            for(int j=0; j<Math.abs(i-3); j++){
                System.out.print("   ");
            }
            for(int j =1; j<=n- Math.abs(2*(i-3)); j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
   }
}
