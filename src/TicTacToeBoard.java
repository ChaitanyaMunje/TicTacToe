import java.util.Arrays;

public class TicTacToeBoard {
    private char[][] state = new char[3][3];  //set board 3*3
    private boolean finished;

    public TicTacToeBoard() {

        resetState();
    }

    public boolean putX(int i, int j){

        return put('X', i, j);
    }
    public boolean putO(int i, int j){

        return put('O', i, j);
    }

    public boolean isFinished() {

        return finished;
    }


    public String toString() {
        String out = "";
        for (char[] chars : state) {
            out += Arrays.toString(chars);
            out += "\n";
        }
        return out;
    }

    private boolean put(char sign, int i, int j) {
        if (state[i][j] != ' ') {
            return false;
        }
        state[i][j] = sign;
        finished = isGameOver(sign, i, j);
        return true;
    }

    private boolean isGameOver(char sign, int i, int j) {
        int colSum = state[i][0] + state[i][1] + state[i][2];
        int rowSum = state[0][j] + state[1][j] + state[2][j];
        int diag1Sum = state[0][0] + state[1][1] + state[2][2];
        int diag2Sum = state[0][2] + state[1][1] + state[2][0];
        int target = sign * 3;
        return colSum == target ||
                rowSum == target ||
                diag1Sum == target ||
                diag2Sum == target;
    }

    private void resetState() {
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[i].length; j++) {
                state[i][j] = ' ';
            }
        }
    }


}