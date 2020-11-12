import java.util.*;

public class LargestSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Maximum sum of subarray: "+maxSumSubarray(a, n));
        sc.close();
    }
    static int maxSumSubarray(int a[], int n){
        int max_so_far = Integer.MIN_VALUE, max_ending = 0;
        for(int i=0; i<n; i++){
            max_ending+=a[i];
            if(max_so_far<max_ending){
                max_so_far = max_ending;
            }
            if(max_ending<0){
                max_ending = 0;
            }
        }
        return max_so_far;
    }
}
