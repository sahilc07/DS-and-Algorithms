import java.util.*;

public class Anagram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String a = sc.nextLine();
        System.out.println("Enter second string: ");
        String b = sc.nextLine();

        int aFreq[] = new int[256];

        boolean isAnagram = true;

        for(char c: a.toCharArray()){
            int index = (int) c;
            aFreq[index]++;
        }
        for(char c: b.toCharArray()){
            int index = (int) c;
            aFreq[index]--;
        }

        for(int i=0; i<256; i++){
            if(aFreq[i] != 0){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram) System.out.println("Anagram");
        else System.out.println("Not Anagram");

        sc.close();
    }
    
}