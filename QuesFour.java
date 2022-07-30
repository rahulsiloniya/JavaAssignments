public class QuesFour {
    public static void main(String[] args) {
        int s = 12, k = 1;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            s -= 2;
            k++;
            System.out.println();
        }
        for (int i = 0; i < 14; i++) System.out.print("*");
    }
}
