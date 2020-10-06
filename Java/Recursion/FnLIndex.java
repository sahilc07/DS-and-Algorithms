import java.util.*;
public class FnLIndex {
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

        int fIndex = firstIndex(a,0,data);
        int lIndex = lastIndex(a, 0, data);

        System.out.print("First Index: "+fIndex+"\tLast Index:"+lIndex);
        sc.close();
    }
    static int firstIndex(int a[],int si, int data){
        if(si == a.length) return -1;
        if(a[si] == data) return si;
        else{
            int restAns = firstIndex(a, si+1, data);
            return restAns;
        }
    }
    static int lastIndex(int a[], int si, int data){
        if(si == a.length) return -1;
        int index = lastIndex(a, si+1, data);
        if(index == -1){
            if(a[si] == data) return si;
            else return -1;
        }else{
            return index;
        }
    }
}
