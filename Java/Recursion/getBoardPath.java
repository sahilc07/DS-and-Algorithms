//Find all the paths from starting no. to ending no. by throwing dice(1-6) using recursion

import java.util.*;

public class getBoardPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Starting value: ");
        int start = sc.nextInt();
        System.out.println("Enter Ending value: ");
        int end = sc.nextInt();

        System.out.println(getBoard(start, end));
        sc.close();
    }
    static ArrayList<String> getBoard(int curr, int end){
        if(curr == end){
            ArrayList <String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if(curr > end){
            ArrayList <String> br = new ArrayList<>();
            return br;
        }
        ArrayList <String> mr = new ArrayList<>();
        for(int dice=1; dice<=6; dice++){
            ArrayList <String> rr = getBoard(curr+dice, end);
            for(String rrs: rr){
                mr.add(dice+rrs);
            }
        }
        return mr;
    }
}
