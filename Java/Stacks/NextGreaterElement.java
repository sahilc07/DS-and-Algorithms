import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Generic Stack call
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[i]>stack.peek()){
                System.out.println(stack.pop()+" -> "+arr[i]);
            }
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop()+" -> "+"-1");
        }
        sc.close();
    }
}
