import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int n2 = sc.nextInt();
        while( n2%n1!=0 ){
            int rem = n2%n1;
            n2 = n1;
            n1 = rem;
        }
        System.out.println("GCD is: "+n1);
        sc.close();
    }
    
}
