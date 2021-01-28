public class ReverseStack {
    public static void main(String[] args) throws Exception{
        DynamicStack stack = new DynamicStack(5);
        for(int i=1; i<=5; i++){
            stack.push(i*10);
        }
        System.out.println("Stack values: ");
        stack.display();
        DynamicStack helper = new DynamicStack();
        System.out.println("Reversed Stack values: ");
        reverseStack(stack,helper,0);
    }
    public static void reverseStack(DynamicStack stack, DynamicStack helper, int index) throws Exception{
        if(stack.isEmpty()){
            return;
        }
        int value = stack.pop();
        reverseStack(stack, helper, index+1);
        helper.push(value);
        if(index==0){
            while(!helper.isEmpty()){
                stack.push(helper.pop());
            }
            stack.display();
        }
    }
}
