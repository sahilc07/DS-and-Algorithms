public class StacksUsingArrays {
    protected int data[];
    protected int top;

    static final int capacity = 10;
    public StacksUsingArrays() throws Exception{
        this(capacity);
    }
    public StacksUsingArrays(int size) throws Exception{
        if(size<1){
            throw new Exception("Invalid Size");
        }
        this.data = new int[size];
        this.top = -1;
    }

    public int size(){
        return this.top+1;
    }
    
    public boolean isEmpty(){
        return this.size() == 0;
    }

    public void push(int value) throws Exception{
        if(this.size() == this.data.length){
            throw new Exception("Stack is Full!!");
        }
        this.top++;
        this.data[this.top] = value;
    }

    public int pop() throws Exception{
        if(this.size()==0){
            throw new Exception("Stack is Empty");
        }
        int rv = this.data[this.top];
        this.data[this.top] = 0;
        this.top--;
        return rv;
    }

    public int top() throws Exception{
        if(this.size()==0){
            throw new Exception("Stack is Empty");
        }
        int rv = this.data[this.top];
        return rv;
    }

    public void display(){
        for(int i=this.top; i>=0; i--){
            System.out.print(this.data[i]+", ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception{
        StacksUsingArrays stack = new StacksUsingArrays(5);
        for(int i=1; i<=5; i++){
            stack.push(i*10);
            stack.display();
        }
        System.out.println(stack.top());

        while(!stack.isEmpty()){
            stack.pop();
            stack.display();
        }
    }
}
