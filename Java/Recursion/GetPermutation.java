import java.util.*;
public class GetPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.next();

        ArrayList<String> result = getP(s);
        Collections.sort(result);
        System.out.println("All Permutations are: ");
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
        sc.close();
    }
    public static ArrayList<String> getP(String str){
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getP(ros);
        ArrayList<String> mr = new ArrayList<>();

        for(String s: rr){
            for(int i = 0; i<=s.length(); i++){
                String val = s.substring(0, i) + cc + s.substring(i);
                mr.add(val);
            }
        }
        return mr;
    }
}
