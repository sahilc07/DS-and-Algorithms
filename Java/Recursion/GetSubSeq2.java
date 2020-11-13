import java.util.*;

public class GetSubSeq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.next();
        System.out.println("Sub-Sequence of "+str+" are :");
        printSubSeq(str, "");
        sc.close();
    }
    static void printSubSeq(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char c = ques.charAt(0);
        String ros = ques.substring(1);
        printSubSeq(ros, ans);
        printSubSeq(ros, ans+c);
    }
}
