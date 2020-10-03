import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;

        while(row<=n){
            if(row == 1 || row == n){
                for(int cst = 1; cst<=n; cst++){
                    System.out.print("*");
                }
            }
            
            if(row>1 && row<n){
                System.out.print("*");
                for(int csp = 1; csp<=n-2; csp++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
