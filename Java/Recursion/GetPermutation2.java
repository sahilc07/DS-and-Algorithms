import java.util.*;

public class GetPermutation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.next();
        System.out.println("Permutation of "+str+" are :");
        printPermutation(str, "");
        sc.close();
    }
    static void printPermutation(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            String roq = ques.substring(0, i) + ques.substring(i+1);
            printPermutation(roq, ans+ch);
        }
    }
}
