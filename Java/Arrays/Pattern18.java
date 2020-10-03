import java.util.*;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n/2;
        int nst = 1;
        int row = 1;
        int nr;
        if(n%2!=0){
            nr = n;
        } else{
            nr = n+1;
        }
        while(row<=nr){
            //spaces
            for(int csp=1; csp<=nsp; csp++){
                System.out.print(" ");
            }
            //stars
            for(int cst = 1; cst<=nst; cst++){
                System.out.print("*");
            }
            
            System.out.println();
            if(row<=nr/2){
                nsp--;
                nst+=2;
            } else{
                nsp++;
                nst-=2;
            }
            row++;
        }
        sc.close();
    }
}
