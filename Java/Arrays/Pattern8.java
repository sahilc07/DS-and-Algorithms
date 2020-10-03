import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp1=0;
        int nsp2 = (n/2)+1;
        while(row<=n){
            for(int csp=1; csp<=nsp1; csp++){
                System.out.print(" ");
            }
            System.out.print("*");
            // for(int csp=1; csp<=nsp2; csp++){
            //     System.out.print(" ");
            // }
            // if(row!=(n/2)+1){
            //     System.out.print("*");
            // }
            

            System.out.println();
            if(row<=n/2){
                nsp1++;
                // nsp2-=2;
            } 
            else{
                nsp1--;
                // nsp2+=2;
            } 
            row++;
        }
    }
}
