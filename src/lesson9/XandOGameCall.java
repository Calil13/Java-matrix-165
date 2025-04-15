package lesson9;

public class XandOGameCall {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        XandOGame game = new XandOGame();
        game.add(board);
    }
}
