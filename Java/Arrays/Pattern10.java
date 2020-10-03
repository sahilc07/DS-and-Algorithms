import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 0;
        int nst = n*2-1;
        int row = 1;
        while(row<=n){
            //spaces
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print(" ");
            }
            //stars
            for(int cst = 1; cst<=nst; cst++){
                System.out.print("*");
            }
            System.out.println();
            nsp+=1;
            nst-=2;
            row++;
        }
        sc.close();
    }
}
