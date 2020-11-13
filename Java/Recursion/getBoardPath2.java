import java.util.*;

public class getBoardPath2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Starting value: ");
        int start = sc.nextInt();
        System.out.println("Enter Ending value: ");
        int end = sc.nextInt();
        System.out.println("All paths are: ");
        printBoardPath(start, end, "");
        System.out.println("Total count of possible paths are: "+printBoardPath(start, end));
        sc.close();
    }

    //getting paths
    static void printBoardPath(int curr, int end, String ans){
        if(curr == end){
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }
        for(int dice=1; dice<=6; dice++){
            printBoardPath(curr+dice, end, dice+ans);
        }
    }

    //getting total count
    static int printBoardPath(int curr, int end){
        if(curr == end){
            return 1;
        }
        if(curr>end){
            return 0;
        }
        int count = 0;
        for(int dice=1; dice<=6; dice++){
            count+=printBoardPath(curr+dice, end);
        }
        return count;
    }
}
