import java.util.*;

public class AllIndicesRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter Array");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Data: ");
        int data = sc.nextInt();

        int result[] = allIndices(a, data, 0, 0);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

        sc.close();
    }

    static int[] allIndices(int a[], int data, int si, int count){
        if(si == a.length){
            int base[] = new int[count];
            return base;
        }
        int indices[] = null;
        if(a[si] == data){
            indices = allIndices(a, data, si+1, count+1);
        }else{
            indices = allIndices(a, data, si+1, count);
        }
        if(a[si] == data){
            indices[count] = si;
        }
        return indices;
    }
}
