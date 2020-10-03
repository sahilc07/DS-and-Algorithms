import java.util.*;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 1;
        int nst = n/2;
        int row = 1;
        while(row<=n){
            //stars
            for(int cst = 1; cst<=nst; cst++){
                System.out.print("*");
            }
            //spaces
            for(int csp=1; csp<=nsp; csp++){
                System.out.print(" ");
            }
            //stars
            for(int cst = 1; cst<=nst; cst++){
                System.out.print("*");
            }
            System.out.println();
            if(row<=n/2){
                nsp+=2;
                nst--;
            } else{
                nsp-=2;
                nst++;
            }
            row++;
        }
        sc.close();
    }
}
