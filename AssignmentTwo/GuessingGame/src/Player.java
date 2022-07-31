public class Player {
    private int guess;
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setGuess(int x) {
        this.guess = x;
    }
    public int getGuess() {
        return this.guess;
    }
    public Player() {
        this.guess = 0;
    }
}
