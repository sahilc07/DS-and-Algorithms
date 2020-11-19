import java.util.*;

public class CoinChangeCombinationPermutation {
    static int countP = 0;
    static int countC = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of coins: ");
        int n = sc.nextInt();
        int denom[] = new int[n];
        System.out.println("Enter coins: ");
        for(int i=0; i<n; i++){
            denom[i] = sc.nextInt();
        }
        System.out.println("Enter Amount: ");
        int amount = sc.nextInt();

        System.out.println("Total Unique possible ways are:");
        coinCombination(denom, amount, "", 0);     //Combination
        System.out.println("Total Possible ways are:");
        coinPermutation(denom, amount, "");        //Permutation
        sc.close();
    }

    //Combination
    static void coinCombination(int denom[], int amount, String ans, int last){
        if(amount == 0){
            countC++;
            System.out.println(countC+". "+ans);
            return;
        }
        for(int i = last; i<denom.length; i++){
            if(amount>=denom[i]){
                coinCombination(denom, amount-denom[i], ans+denom[i], i);
            }
        }
    }

    //Permutation
    static void coinPermutation(int denom[], int amount, String ans){
        if(amount == 0){
            countP++;
            System.out.println(countP+". "+ans);
            return;
        }
        for(int i = 0; i<denom.length; i++){
            if(amount>=denom[i]){
                coinPermutation(denom, amount-denom[i], ans+denom[i]);
            }
        }
    }
}
