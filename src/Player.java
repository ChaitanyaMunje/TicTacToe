public class Player {
    private String name;
    private int score;
    private char sign;

    public Player(String name, char sign) {
        this.name = name;
        this.sign = sign;
    }

    public String getName() {

        return name;
    }

    public int getScore() {

        return score;
    }

    public char getSign() {

        return sign;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setScore(int score) {

        this.score = score;
    }

    public void setSign(char sign) {

        this.sign = sign;
    }
}
