import java.util.Scanner;

public class Game {
    public void play() {
        TicTacToeBoard board = new TicTacToeBoard();
        Scanner input = new Scanner(System.in);

        boolean xTurn = true;
        while (true) {
            if (xTurn) {
                System.out.println("X turn:");
            } else {
                System.out.println("O turn:");
            }

            System.out.print("input i: ");
            int i = input.nextInt();
            System.out.print("input j: ");
            int j = input.nextInt();

            boolean nextTurn = xTurn ? board.putX(i, j) : board.putO(i, j);
            if (nextTurn) {
                System.out.println(board.toString());
                if (board.isFinished()) {
                    System.out.println("Game Over: " + (xTurn ? "X" : "O") + " wins");
                }
                xTurn = !xTurn;

                System.out.println("\n");
            }
        }
    }
}
