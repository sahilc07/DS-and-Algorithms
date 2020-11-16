//Complexity: O(log (n))
import java.util.*;

public class PowerRec2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.: ");
        int x = sc.nextInt();
        System.out.println("Enter power: ");
        int n = sc.nextInt();
        
        int res = power(x,n);
        System.out.println("Result is: "+res);
        sc.close();
    }

    static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int p = power(x, n/2);
        if(n%2==0){
            return p*p;
        } else{
            return p*p*x;
        }
    }
}
