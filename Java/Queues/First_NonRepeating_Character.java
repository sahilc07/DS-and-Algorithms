import java.util.*;
import java.util.LinkedList;
public class First_NonRepeating_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        Queue <Character> queue = new LinkedList<>();
        HashMap <Character,Integer> map = new HashMap<>();

        while(ch!='.'){
            queue.add(ch);
            if(map.containsKey(ch)){
                int value = map.get(ch);
                value++;
                map.put(ch, value);
            }else{
                map.put(ch, 1);
            }

            while(!queue.isEmpty()){
                char fc = queue.peek();
                if(map.get(fc)==1){
                    System.out.println(fc);
                    break;
                }else{
                    queue.poll();
                }
            }

            if(queue.isEmpty()){
                System.out.println("-1");
            }

            ch = sc.next().charAt(0);
        }

        sc.close();
    }
}
