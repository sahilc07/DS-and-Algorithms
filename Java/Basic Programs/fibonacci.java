import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int n = sc.nextInt();

        int n1=0, n2=1, n3;
        System.out.print(n1+" ");
        System.out.print(n2+" ");

        for(int i=0; i<n-2; i++){
            n3= n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
        sc.close();
    }
    
}