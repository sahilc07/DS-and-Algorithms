import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of disks: ");
        int n = sc.nextInt();

        toh(n, "source", "destination", "helper");
        sc.close();
    }
    static void toh(int n, String src, String dest, String helper){

        if(n==0) return;
        toh(n-1, src, helper, dest);

        System.out.println("Move "+n+"th disk from "+src+" to "+dest);

        toh(n-1, helper, dest, src);
    }
}
