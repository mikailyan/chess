public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard("White");

        board.board[0][1] = new Horse("White");
        board.board[7][1] = new Horse("Black");
        board.printBoard();

        System.out.println("Белый конь ходит из (0,1) в (2,2)");
        if (board.moveToPosition(0, 1, 2, 2)) {
            board.printBoard();
        } else {
            System.out.println("Невозможно сделать ход.");
        }

        System.out.println("Черный конь ходит из (7,1) в (5,2)");
        if (board.moveToPosition(7, 1, 5, 2)) {
            board.printBoard();
        } else {
            System.out.println("Невозможно сделать ход.");
        }
    }
}
