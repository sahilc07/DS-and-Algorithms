//Reverse the array

import java.util.*;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        revArray(arr, 0, n-1);
        printArray(arr, n);
        sc.close();
    }

    static void revArray(int arr[], int start, int end){
        if(start>=end) return;
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         revArray(arr, start+1, end-1);
    }

    static void printArray(int arr[], int n){
        System.out.println("Reversed Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
