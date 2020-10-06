import java.util.*;
public class BubbleSortRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter Array");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        bubbleSort(a, 0, a.length-1);
        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    static void bubbleSort(int a[], int si, int li){
        if(li == 0) return;
        if(si == li){
            bubbleSort(a, 0, li-1);
            return;
        }
        if(a[si]>a[si+1]){
            int temp = a[si];
            a[si] = a[si+1];
            a[si+1] = temp;
        }
        bubbleSort(a, si+1, li);
    }
}
