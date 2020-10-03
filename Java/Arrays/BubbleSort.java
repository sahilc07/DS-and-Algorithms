import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            boolean sorted = true;

            for(int j=0; j<n-1-i; j++){

                if( a[j+1] < a[j]){
                    sorted = false;
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
            if(sorted) break;
        }

        System.out.println("Sorted Array is: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}