public class hollowinbetween {
    public static void main(String[] args) {

        for (int i = 0; i <=4 ; i++) {
            for (int j = 0; j <= 6; j++) {
                if (i + j == 3 && i <= 2 && i >= 0 || i + j == 5 && i <= 3 && i >= 1 || i + j == 7 && i <= 4 && i >= 2
                        || i + j == 4 && i <= 2 && i >= 1 || i + j == 6 && i <= 3 && i >= 2) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
