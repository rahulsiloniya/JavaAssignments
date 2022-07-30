public class House {
    public static void main(String[] args) {
        int m = 6, n = 7;
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                for (int j = 0; j < 6; j++) System.out.print("* ");
                for (int j = 0; j < 7; j++) System.out.print("* ");
                System.out.println();
            }
            else {
                for (int k = 0; k < m; k++) System.out.print("* ");
                for (int k = m; k < n; k++) System.out.print("  ");
                for (int k = n; k < 13; k++) System.out.print("* ");
                System.out.println();
                m--;
                n++;
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 13; j++) {
                if (j == 0 || j == 12) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 13; i++) System.out.print("* ");
    }
}
