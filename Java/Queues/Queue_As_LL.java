public class Queue_As_LL {
    private LinkedList queue;

    public Queue_As_LL(){
        this.queue = new LinkedList();
    }
    
    public boolean isEmpty(){
        return this.queue.isEmpty();
    }

    public void enque(int item){
        this.queue.addLast(item);
    }

    public int deque() throws Exception {
        return this.queue.removeFirst();
    }

    public int getFront() throws Exception {
        return this.queue.getFirst();
    }

    public void display() throws Exception {
        this.queue.display();
    }

    public static void main(String[] args) throws Exception {
        Queue_As_LL q = new Queue_As_LL();
        for(int i=1; i<=5; i++){
            q.enque(i*10);
        }
        q.display();
        System.out.println(q.deque());
        q.display();
        System.out.println(q.getFront());
        System.out.println(q.isEmpty());
    }
}
