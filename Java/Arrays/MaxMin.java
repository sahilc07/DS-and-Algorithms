//Find the maximum and minimum element in an array

import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Pair p = getMinMax(arr, n);
        System.out.println("Maximum element: "+p.max);
        System.out.println("Minimum element: "+p.min);
        sc.close();
    }

    static class Pair{
        int max;
        int min;
    }

    static Pair getMinMax(int arr[], int n){
        Pair p = new Pair();
        
        p.max = arr[0];
        p.min = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i]>p.max){
                p.max = arr[i];
            }
            if(arr[i]<p.min){
                p.min = arr[i];
            }
        }
        return p;
    }
}
