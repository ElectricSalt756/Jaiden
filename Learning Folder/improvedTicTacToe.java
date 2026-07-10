import java.util.Scanner;

public class improvedTicTacToe {
    public static void main(String[] args) {
        game();
    }

    public static void game(){
        int turn = 0;
        boolean isGameRunning = true;
        boolean isPlayer1Turn = true;
        String[][] board = boardCreate();
        while (isGameRunning){
            printBoard(board);
            board = playerTurn(board, isPlayer1Turn);
            isPlayer1Turn = !isPlayer1Turn;
            turn++;
            isGameRunning = winCondtion(turn, board);
        }

    }

    public static String[][] boardCreate() {
        String[][] board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "_";
            }
        }
        return board;
    }

    public static String[][] playerTurn(String[][] board, boolean isPlayer1Turn) {
        Scanner scan = new Scanner(System.in);
        boolean isPlaceTaken = true;
        int row = 0;
        int column = 0;
        while (isPlaceTaken) {
            System.out.println("Which row do you want to play in?");
            row = scan.nextInt();
            System.out.println("Which column do you want to play in?");
            column = scan.nextInt();
            if (board[row][column].equals("_")) {
                isPlaceTaken = false;
            } else {
                System.out.println("You can't go there. Try again.");
            }
        }
        if (isPlayer1Turn) {
            board[row][column] = "X";
            isPlayer1Turn = false;
        } else {
            board[row][column] = "O";
            isPlayer1Turn = true;
        }
        return board;
    }

    public static boolean winCondtion(int turn, String[][] board){
        for(int i=0;i<3;i++){
                if(board[i][0].equals("X") && board[i][1].equals("X") && board[i][2].equals("X")){
                    System.out.println("Player 1 has won!");
                    return false;
                }
            }
            for(int i=0;i<3;i++){
                if(board[0][i].equals("X") && board[1][i].equals("X") && board[2][i].equals("X")){
                    System.out.println("Player 1 has won!");
                    return false;
                }
            }
            if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")){
                System.out.println("Player 1 has won!");
                return false;
            }
            if(board[2][0].equals("X") && board[1][1].equals("X") && board[0][2].equals("X")){
                System.out.println("Player 1 has won!");
                return false;
            }
            for(int i=0;i<3;i++){
                if(board[i][0].equals("O") && board[i][1].equals("O") && board[i][2].equals("O")){
                    System.out.println("Player 2 has won!");
                    return false;
                }
            }
            for(int i=0;i<3;i++){
                if(board[0][i].equals("O") && board[1][i].equals("O") && board[2][i].equals("O")){
                    System.out.println("Player 2 has won!");
                    return false;
                }
            }
            if(board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")){
                System.out.println("Player 2 has won!");
                return false;
            }
            if(board[2][0].equals("O") && board[1][1].equals("O") && board[0][2].equals("O")){
                System.out.println("Player 2 has won!");
                return false;
            }
            if(turn==9){
                System.out.println("It is a draw!");
                return false;
            }
        return true;
    }

    public static void printBoard(String[][] board){
        for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
    }
}
