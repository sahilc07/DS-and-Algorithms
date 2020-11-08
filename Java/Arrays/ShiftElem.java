import java.util.*;

public class ShiftElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();    
        }
        rearrange(a, n);
        sc.close();
    }
    static void rearrange(int arr[], int n){
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        System.out.println("Shifted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
