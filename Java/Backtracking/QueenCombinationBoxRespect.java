//Unique ways in which given no. of queens can be placed in given no. of boxes using box respect

import java.util.*;

public class QueenCombinationBoxRespect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of boxes: ");
        int n = sc.nextInt();
        System.out.println("Enter total no. of queens: ");
        int tq = sc.nextInt();
        
        System.out.println("Total possible ways: ");
        qCombBoxRespect(new boolean[n], 0, 0, tq, "");
        sc.close();
    }

    static void qCombBoxRespect(boolean box[], int col, int qsf, int tq, String ans){

        //positive base case
        if(qsf == tq){
            System.out.println(ans);
            return;
        }

        //negative base case
        if(col == box.length){
            return;
        }

        //queen placed
        box[col] = true;
        qCombBoxRespect(box, col+1, qsf+1, tq, ans+"b"+col+" ");
        box[col] =false;

        //queen not placed
        qCombBoxRespect(box, col+1, qsf, tq, ans);
    }
}
