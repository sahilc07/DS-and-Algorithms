public class Stack_As_LL {
    private LinkedList stack;
     public Stack_As_LL(){
         this.stack = new LinkedList();
     }

     public void push(int item){
         this.stack.addFirst(item);
     }

     public int pop() throws Exception {
         return this.stack.removeFirst();
     }

     public int size(){
         return this.stack.size();
     }

     public boolean isEmpty(){
         return this.stack.isEmpty();
     }

     public int peek() throws Exception {
         return this.stack.getFirst();
     }

     public void display() throws Exception {
        this.stack.display();
    }

    public static void main(String[] args) throws Exception {
        Stack_As_LL stack = new Stack_As_LL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
