import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
        
        int ans[] = mergeSort(a, 0, n-1);
        for(int val: ans){
            System.out.print(val+" ");
        }
        sc.close();
    }

    //to merge two sorted arrays
    static int[] mergeArrays(int a1[], int a2[]){
        int merge[] = new int[a1.length + a2.length];
        int i=0, j=0, k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<=a2[j]){
                merge[k] = a1[i];
                i++;
                k++;
            }else{
                merge[k] = a2[j];
                j++;
                k++;
            }
        }
        if(i==a1.length){
            while(j<a2.length){
                merge[k] = a2[j];
                j++;
                k++;
            }
        }
        if(j==a2.length){
            while(i<a1.length){
                merge[k] = a1[i];
                i++;
                k++;
            }
        }
        return merge;
    }

    //to implement MERGE SORT
    static int[] mergeSort(int a[], int low, int high){
        int mid = (low+high)/2;
        if(low==high){
            int br[] = new int[1];
            br[0] = a[low];
            return br;
        }

        int fh[] = mergeSort(a, low, mid);
        int sh[] = mergeSort(a, mid+1, high);
        return mergeArrays(fh, sh);
    }
}
