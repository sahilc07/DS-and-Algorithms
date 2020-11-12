import java.util.*;

public class getMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getMaze(0, 0, 2, 2));
        sc.close();
    }
    static ArrayList<String> getMaze(int cr, int cc, int er, int ec){
        if(cr==er && cc==ec){
            ArrayList <String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if(cr>er || cc>ec){
            ArrayList <String> br = new ArrayList<>();
            return br;
        }
        ArrayList <String> mr = new ArrayList<>();

        //horizontal
        ArrayList <String> rrh = getMaze(cr, cc+1, er, ec);
        for(String rrs: rrh){
            mr.add("H"+rrs);
        }

        //vertical
        ArrayList <String> rrv = getMaze(cr+1, cc, er, ec);
        for(String rrs: rrv){
            mr.add("V"+rrs);
        }

        //diagnol
        ArrayList <String> rrd = getMaze(cr+1, cc+1, er, ec);
        for(String rrs: rrd){
            mr.add("D"+rrs);
        }
        return mr;
    }
}
