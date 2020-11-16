import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
        }

        System.out.println("Sorted Array: ");
        quickSort(a, 0, n-1);
        for(int val: a){
            System.out.print(val+" ");
        }
        sc.close();
    }

    //function for Quick Sort
    static void quickSort(int a[], int low, int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        int pivot = a[mid], left = low, right = high;
        while(left<=right){
            while(a[left]<pivot){
                left++;
            }
            while(a[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        quickSort(a, low, right);
        quickSort(a, left, high);
    }
}
