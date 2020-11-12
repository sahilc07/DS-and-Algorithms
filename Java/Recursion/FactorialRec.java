import java.util.*;
public class FactorialRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println("Factorial is: "+res);
        sc.close();
    }
    static int fact(int n){
        if(n==0 || n==1) return 1;
        return (n*fact(n-1));
    }
}
