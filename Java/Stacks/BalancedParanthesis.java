import java.util.*;

public class BalancedParanthesis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        System.out.println(isReversedParanthesis(str));
        sc.close();
    }
    public static boolean isReversedParanthesis(String str) {

        Stack <Character> stack = new Stack<>();

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }else if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')'){

                if(stack.isEmpty()){
                    return false;
                }
                if(str.charAt(i) == '}'){
                    if(stack.peek() == '{'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                if(str.charAt(i) == ']'){
                    if(stack.peek() == '['){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                if(str.charAt(i) == ')'){
                    if(stack.peek() == '('){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                
            }else{
                continue;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}