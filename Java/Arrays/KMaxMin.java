//Find the "Kth" max and min element of an array 

import java.util.*;

public class KMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter level: ");
        int k = sc.nextInt();

        Pair p = kMaxMin(arr, n, k);
        System.out.println(k+"th Max Element: "+p.max);
        System.out.println(k+"th Min Element: "+p.min);
        sc.close();
    }
    
    static class Pair{
        int max;
        int min;
    }
    static Pair kMaxMin(int arr[], int n, int k){
        Pair p = new Pair();
        Arrays.sort(arr);
        p.max = arr[n-k];
        p.min = arr[k-1];
        return p;
    }
}
