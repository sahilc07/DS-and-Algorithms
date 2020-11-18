//finding possible no. of unique ways to place given no. of queens in given no. of boxes

import java.util.*;

public class QueenCombination1D {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of boxes: ");
        int n = sc.nextInt();
        System.out.println("Enter total no. of queens: ");
        int tq = sc.nextInt();
        
        System.out.println("Total possible ways: ");
        qCombination(new boolean[n], 0, tq, "",-1);
        sc.close();
    }

    static void qCombination(boolean boxes[], int qsf, int tq, String ans, int last){
        if(qsf==tq){
            count++;
            System.out.println(count+". "+ans);
            return;
        }
        for(int i=last+1; i<boxes.length; i++){
            boxes[i] = true;
            qCombination(boxes, qsf+1, tq, ans+"q"+qsf+"b"+i+" ", i);
            boxes[i] = false;
        }
    }
}
