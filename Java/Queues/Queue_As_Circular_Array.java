public class Queue_As_Circular_Array {
    private int data[];
    private int front;
    private int rear;
    private int cs;
    private int ms;

    static final int capacity = 10;

    public Queue_As_Circular_Array() throws Exception{
        this(capacity);
    }

    public Queue_As_Circular_Array(int size) throws Exception {
        if(size<1){
            throw new Exception("Invalid Size");
        }
        this.data = new int[size];
        this.front = 0;
        this.rear = size-1;
        this.cs = 0;
        this.ms = size-1;
    }

    public boolean isFull(){
        return this.cs==this.ms;
    }

    public boolean isEmpty(){
        return this.cs==0;
    }

    public void enque(int item) throws Exception {
        if(this.isFull()){
            throw new Exception("Queue is full");
        }

        this.rear = (this.rear+1)%this.data.length;
        this.data[this.rear] = item;
        this.cs++;
    }

    public void deque() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Queue is empty");
        }

        this.front = (this.front+1)%this.data.length;
        this.cs--; 
    }

    public int getFront(){
        return this.data[this.front];
    }

    public void display(){
        for(int i=0; i<this.data.length; i++){
            System.out.print(this.data[i]+" ");
        }
    }
}
