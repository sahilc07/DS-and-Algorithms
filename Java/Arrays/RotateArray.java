//Write a program to cyclically rotate an array by one.

import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        rotateArray(a, n);
        System.out.println("Rotated Array: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    static void rotateArray(int a[], int n){
        int x = a[n-1];
        for(int i=n-1; i>0; i--){
            a[i] = a[i-1];
        }
        a[0] = x;
    }
}
