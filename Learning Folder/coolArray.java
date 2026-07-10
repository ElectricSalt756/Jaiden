import java.util.Scanner;

public class coolArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[][] board = new String[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = "_";

            }
        }
        boolean isGameRunning = true;
        boolean isPlayer1Turn = true;
        int row=0;
        int column=0;
        boolean isPlaceTaken = true;
        int turn=0;
        while (isGameRunning) {
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            isPlaceTaken = true;
            while (isPlaceTaken){
            System.out.println("Which row do you want to play in?");
            row = scan.nextInt();
            System.out.println("Which column do you want to play in?");
            column = scan.nextInt();
            if (board[row][column].equals("_")){
                isPlaceTaken = false;
            }
            else{
                System.out.println("You can't go there. Try again.");
            }
            }
            turn++;
            if(isPlayer1Turn){
                board[row][column] = "X";
                isPlayer1Turn = false;
            }
            else{
                board[row][column] = "O";
                isPlayer1Turn = true;
            }
            for(int i=0;i<3;i++){
                if(board[i][0].equals("X") && board[i][1].equals("X") && board[i][2].equals("X")){
                    System.out.println("Player 1 has won!");
                    isGameRunning = false;
                }
            }
            for(int i=0;i<3;i++){
                if(board[0][i].equals("X") && board[1][i].equals("X") && board[2][i].equals("X")){
                    System.out.println("Player 1 has won!");
                    isGameRunning = false;
                }
            }
            if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")){
                System.out.println("Player 1 has won!");
                isGameRunning = false;
            }
            if(board[2][0].equals("X") && board[1][1].equals("X") && board[0][2].equals("X")){
                System.out.println("Player 1 has won!");
                isGameRunning = false;
            }
            for(int i=0;i<3;i++){
                if(board[i][0].equals("O") && board[i][1].equals("O") && board[i][2].equals("O")){
                    System.out.println("Player 2 has won!");
                    isGameRunning = false;
                }
            }
            for(int i=0;i<3;i++){
                if(board[0][i].equals("O") && board[1][i].equals("O") && board[2][i].equals("O")){
                    System.out.println("Player 2 has won!");
                    isGameRunning = false;
                }
            }
            if(board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")){
                System.out.println("Player 2 has won!");
                isGameRunning = false;
            }
            if(board[2][0].equals("O") && board[1][1].equals("O") && board[0][2].equals("O")){
                System.out.println("Player 2 has won!");
                isGameRunning = false;
            }
            if(turn==9){
                System.out.println("It is a draw!");
                isGameRunning = false;
            }
        }
    }
}
