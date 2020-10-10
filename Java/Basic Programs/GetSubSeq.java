import java.util.*;
public class GetSubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.next();

        ArrayList<String> result = getSS(s);
        Collections.sort(result);
        System.out.println("All Sub-Sequences: ");
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
        sc.close();
    }

    static ArrayList<String> getSS(String str){
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> myString = new ArrayList<>();
        ArrayList<String> recString = getSS(ros);

        for(int i=0; i<recString.size(); i++){
            myString.add(recString.get(i));
            myString.add(cc+recString.get(i));
        }
        return myString;
    }
}
