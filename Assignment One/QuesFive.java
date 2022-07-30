public class QuesFive {
    public static void main(String[] args) {
        int s = 7;
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                for (int j = 0; j < 14; j++) System.out.print("*");
                System.out.println();
            }
            else {
                s--;
                for (int j = 0; j < s; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < 7; i++) {
            if (i == 6) {
                for (int j = 0; j < 14; j++) System.out.print("*");
                System.out.println();
            }
            else {
                s++;
                for (int j = 0; j < s; j++) System.out.print("*");
                System.out.println();
            }
        }
    }
}
