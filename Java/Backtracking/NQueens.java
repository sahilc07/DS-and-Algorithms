import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean board[][] = new boolean[4][4];
        printNQueens(board, 0, "");
        System.out.println("Total Possible ways: "+printNQueens(board, 0));
        sc.close();
    }

    //to print the possible locations
    static void printNQueens(boolean [][] board, int row, String result){
        if(row == board.length){
            System.out.println(result);
            return;
        }
        for(int col=0; col<board[row].length; col++){
            if(isItSafe(board,row,col)){
                board[row][col] = true;
                printNQueens(board, row+1, result+"("+(row)+","+(col)+")");
                board[row][col] = false;
            }
        }
    }

    //to count the total no. of possible ways
    static int printNQueens(boolean [][] board, int row){
        if(row == board.length){
            return 1;
        }
        int count = 0; 
        for(int col=0; col<board[row].length; col++){
            if(isItSafe(board,row,col)){
                board[row][col] = true;
                count+=printNQueens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    //to check for safe locations of queens
    static boolean isItSafe(boolean board[][], int row, int col){
         for(int i=row; i>=0; i--){
             if(board[i][col]){
                 return false;
             }
         }
         for(int i=row,j=col; i>=0 && j>=0; i--,j--){
             if(board[i][j]){
                 return false;
             }
         }
         for(int i=row,j=col; i>=0 && j<board.length; i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
}
