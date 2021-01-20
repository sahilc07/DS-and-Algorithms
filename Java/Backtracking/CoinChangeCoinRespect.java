import java.util.*;

public class CoinChangeCoinRespect {
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
        coinRespect(denom, amount, 0, "");
        sc.close();
    }
    static void coinRespect(int denom[], int amount, int vidx, String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        if(amount<0 || vidx == denom.length){
            return;
        }
        coinRespect(denom, amount-denom[vidx], vidx, ans+denom[vidx]);
        coinRespect(denom, amount, vidx+1, ans);
    }
}
