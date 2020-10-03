import java.util.*;

public class Anagram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String a = sc.nextLine();
        System.out.println("Enter second string: ");
        String b = sc.nextLine();

        boolean isAnagram = false;
        boolean isVisited[] = new boolean[b.length()];     //checks if element is visited in that particular index pf b

        if(a.length() == b.length()){
            for(int i=0; i<a.length(); i++){
                isAnagram = false;
                char ch = a.charAt(i);
                for(int j=0; j<b.length(); j++){
                    if(b.charAt(j) == ch && !isVisited[j]){     //if char at i position contains in string b and element is not visited before
                        isAnagram = true;
                        isVisited[j] = true;
                        break;
                    }
                }
                if(!isAnagram) break;
            } 
        }

        if(isAnagram) System.out.println("Anagram");
        else System.out.println("Not Anagram");
        sc.close();
    }
    
}