import java.util.*;

public class getMazePath2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Columns: ");
        int cols = sc.nextInt();
        System.out.println("Paths are:");
        printMazePath(0, 0, rows, cols, "");     //Printing Paths
        System.out.println("Total count: "+printMazePath(0, 0, rows, cols));     //Counting Paths
        sc.close();
    }

    //printing paths
    static void printMazePath(int cr, int cc, int er, int ec, String ans){
        if(cr == er && cc == ec){
            System.out.println(ans);
            return;
        }
        if(cr>er || cc>ec){
            return;
        }
        printMazePath(cr, cc+1, er, ec, ans+"H");
        printMazePath(cr+1, cc, er, ec, ans+"V");
        printMazePath(cr+1, cc+1, er, ec, ans+"D");
    }

    //counting paths
    static int printMazePath(int cr, int cc, int er, int ec){
        if(cr == er && cc == ec){
            return 1;
        }
        if(cr>er || cc>ec){
            return 0;
        }
        int count = 0;
        count += printMazePath(cr, cc+1, er, ec);
        count += printMazePath(cr+1, cc, er, ec);
        count += printMazePath(cr+1, cc+1, er, ec);
        return count;
    }
}
