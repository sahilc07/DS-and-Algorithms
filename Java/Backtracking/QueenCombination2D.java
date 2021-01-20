import java.util.*;

public class QueenCombination2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row = sc.nextInt();
        System.out.println("Enter Column: ");
        int col = sc.nextInt();
        System.out.println("Enter total no. of queens: ");
        int tq = sc.nextInt();
        
        System.out.println("Total possible ways: ");
        qcomb2D(new boolean[row][col], 0, 0, 0, tq, "");
    }
    static void qcomb2D(boolean box[][], int row, int col, int qsf, int tq, String ans){
        if(qsf == tq){
            System.out.println(ans);
            return;
        }

        if(col == box[0].length){
            row++;
            col = 0;
        }

        if(row == box.length){
            return;
        }

        box[row][col] = true;
        qcomb2D(box, row, col+1, qsf+1, tq, ans+"("+row+" , "+col+")");
        box[row][col] = false;
        qcomb2D(box, row, col+1, qsf, tq, ans);
    }
}
