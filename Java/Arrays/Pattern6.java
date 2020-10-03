import java .util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int nsp = 0;
        int row = 1;
        //rows
        while(row<=n){
            //spaces
            for(int csp = 0; csp<=nsp; csp++){
                System.out.print(" ");
            }
            //stars
            for(int cst=1; cst<=nst; cst++){
                System.out.print("*");
            }
            System.out.println();
            nst--;
            nsp+=2;
            row++;
        }
        sc.close();
    }
}
