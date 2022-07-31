import java.util.Scanner;
import java.lang.Math;

public class Umpire {
    private static int upper;
    private static int level;
    private Guesser guesser = new Guesser();

    Umpire() {}

    Scanner scan = new Scanner(System.in);

    public void chooseLevel() {
        System.out.print("Please choose a level from 1 to 10 : ");
        level = scan.nextInt();
        while (level < 0 || level > 10) {
            System.out.print("Please enter a valid level to play : ");
            level = scan.nextInt();
        }
    }

    public void input() {
        Double db = Math.random() * level * 10 + 1;
        upper = db.intValue();
        guesser.setGuess(upper);
        System.out.println("The guessers guess will be displayed after the players' bets.");
    }
    public void chooseName(Player player) {
        System.out.print("Choose a name for first player : ");
        String name = scan.nextLine();
        player.setName(name);
    }
    public void setGuesses(Player player) {
        System.out.println(player.getName() + "'s move");
        System.out.print("Enter your guess : ");
        int guess = scan.nextInt();
        while (guess < 0 || guess > level * 10) {
            System.out.println("Please enter a valid guess in the range (1 to " + level * 10 + ") : ");
            guess = scan.nextInt();
        }
        player.setGuess(guess);
    }
    
    public void compare(Player one, Player two, Player three) {
        int wins = 0;
        if (one.getGuess() == guesser.getGuess()) wins++;

        if (two.getGuess() == guesser.getGuess()) wins+= 2;

        if (three.getGuess() == guesser.getGuess()) wins+= 4;
        
        System.out.println("The guesser's guess was : " + guesser.getGuess());
        if (wins == 1) System.out.println("Player one guessed it right!!");
        if (wins == 2) System.out.println("Player two guessed it right!!");
        if (wins == 4) System.out.println("Player three guessed it right!!");
        if (wins == 3) System.out.println("Player one and two guessed the right answer!!\nIts a tie!!");
        if (wins == 6) System.out.println("Player two and three guessed it right!!\nIts a tie!!");
        if (wins == 5) System.out.println("PLayer one and three guessed it right!!\nIts a tie!!");
        if (wins == 7) System.out.println("All players guessed it right!!\nIts a rematch!!");
        if (wins == 0) System.out.println("Players lose!!\nNone guessed it correctly.");
    }
}
