import java.util.*;
public class Pattern16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int nsp = n-1;
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
                nsp--;
                nst--;
            } else{
                nsp++;
                nst++;
            }
            row++;
        }
        sc.close();
    }
}
