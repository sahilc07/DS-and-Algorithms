//finding possible no. of ways to place given no. of queens in given no. of boxes

import java.util.*;

public class QueenPermutation1D {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of boxes: ");
        int n = sc.nextInt();
        System.out.println("Enter total no. of queens: ");
        int tq = sc.nextInt();
        
        System.out.println("Total possible ways: ");
        qPermutation(new boolean[n], 0, tq, "");
        sc.close();
    }
    static void qPermutation(boolean boxes[], int qsf, int tq, String ans){
        if(qsf == tq){
            count++;
            System.out.println(count+". "+ans);
            return;
        }

        for(int i=0; i<boxes.length; i++){
            if(boxes[i]==false){
                boxes[i] = true;
                qPermutation(boxes, qsf+1, tq, ans+"q"+qsf+"b"+i+" ");
                boxes[i] = false;
            }
        }
    }
}
