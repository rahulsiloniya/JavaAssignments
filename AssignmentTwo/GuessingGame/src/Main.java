import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player one = new Player();
        Player two = new Player();
        Player three = new Player();
        Scanner scan = new Scanner(System.in);
        String playagain = "y";
        Umpire umpire = new Umpire();
        umpire.chooseName(one);
        umpire.chooseName(two);
        umpire.chooseName(three);
        while (playagain.equals("y") || playagain.equals("Y")) {
            umpire.chooseLevel();
            umpire.input();
            umpire.setGuesses(one);
            umpire.setGuesses(two);
            umpire.setGuesses(three);
            umpire.compare(one, two, three);
            System.out.println();
            System.out.println("Do you want to play again?");
            playagain = scan.nextLine();
        }
        scan.close();
    }
}