import java.util.*;

public class SelectionSort {
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
            int min = i;
            for(int j=i; j<n; j++){
                if(a[j] < a[min]){
                    int temp = a[j];
                    a[j] = a[min];
                    a[min] = temp;
                }
            }
        }

        System.out.println("Sorted Array is: ");
        for(int item: a){
            System.out.print(item+" ");
        }
        sc.close();
    }
}