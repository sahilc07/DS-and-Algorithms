import java.util.*;
public class Pattern15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int nsp=0;
        int row = 1;
        while(row <= (n*2-1)){
            //spaces
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print(" ");
            }
            //stars
            for(int cst=1 ; cst<=nst; cst++){
                System.out.print("*");
            }
            System.out.println();
            if(row<=n-1){
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
