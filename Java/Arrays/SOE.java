//Sieve Of Eratosthenis
//Finding Prime no. upto a given limit in complexity: O(log(log n)) 

import java.util.*;

public class SOE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int n = sc.nextInt();
        System.out.println("All Prime Values: ");
        prime(n);
        sc.close();
    }
    static void prime(int n){
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for(int table=2; table*table <= n; table++){
            if(prime[table]==false){
                continue;
            }
            for(int mul=2; mul*table <=n; mul++){
                prime[mul*table] = false;
            }
        }

        for(int i=0; i<n; i++){
            if(prime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
