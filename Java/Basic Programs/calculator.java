import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter second no.: ");
        int n2 = sc.nextInt();

        System.out.println("Enter Operation: ");
        sc.nextLine();
        char operation = sc.nextLine().charAt(0);

        int result = 0;

        switch(operation){
            case '+': result = n1+n2;
            break;
            case '-': result = n1-n2;
            break;
            case '*': result = n1*n2;
            break;
            case '/': result = n1>n2 ? n1/n2 : n2/n1;
            break;
            default: System.out.println("Invalid Input");
        }
        System.out.println("The result is: "+result);
        sc.close();
    }
    
}