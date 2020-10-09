import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one side: ");
        long n = sc.nextLong();
        evaluate(n);
        sc.close();
    }

static void evaluate(long n) {
    System.out.println("Other two sides are: ");
        if (n == 1 || n == 2)
            System.out.println(-1);

        else if (n % 2 == 0) {
            System.out.println(((n * n) / 4) - 1 + " " + (((n * n) / 4) + 1));
        }

        else if (n % 2 != 0) {

            System.out.println((n * n - 1) / 2 + " " + (n * n + 1) / 2);
        }
    }

}
