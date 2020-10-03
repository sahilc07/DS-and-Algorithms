/**
 * simpleInterest
 */
import java.util.*;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Principle amount: ");
        int principle = sc.nextInt();

        System.out.println("Enter rate: ");
        float rate = sc.nextFloat();

        System.out.println("Enter Time: ");
        int time = sc.nextInt();

        float simpleInterest = (principle * rate * time)/100;
        System.out.println("Simple Interest: "+ simpleInterest);
        sc.close();
    }
    
}