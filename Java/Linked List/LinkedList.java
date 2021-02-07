public class LinkedList {

    //Node class
    private class Node{
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    //to find size
    public int size(){
        return this.size;
    }

    //to find if Linked List is empty or not
    public boolean isEmpty(){
        return this.size()==0;
    }

    //to display the linked list
    public void display() throws Exception {
        if(size == 0){
            throw new Exception("Linked List is empty");
        }
        Node temp = this.head;
        System.out.println("-------------------");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("-------------------");
    }

    //to add element at the beginning of Linked list
    public void addFirst(int item){

        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if(size >= 1){
            nn.next = this.head;
        }

        if(size == 0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else{
            this.head = nn;
            this.size++;
        }
    }

    //to add elements at the end of linked list
    public void addLast(int item){

        //Create new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        //attach
        if(this.size >= 1){
            this.tail.next = nn;
        }

        //Updation
        if(this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }else{
            this.tail = nn;
            this.size++;
        }
    }

    //to add elemnet at a given index
    public void addAt(int item, int index) throws Exception {
        if(index<0 || index>size){
            throw new Exception("Invalid Index");
        }

        if(index == 0){
            addFirst(item);
        } else if(index == size){
            addLast(item);
        }else{
            Node nn = new Node();
            nn.data = item;
            nn.next = null;

            Node nm1 = getNode(index-1);
            Node np1 = nm1.next;
            nm1.next = nn;
            nn.next = np1;
            this.size++;
        }
    }

    //get first element of Linked List
    public int getFirst() throws Exception{
        if(size == 0){
            throw new Exception("Linked List is empty");
        }
        return this.head.data;
    }

    //to get data of given index
    public int getData(int index) throws Exception {
        if(size == 0){
            throw new Exception("Linked List is Empty");
        }
        if(index<0 || index==size){
            throw new Exception("Invalid size");
        }
        Node temp = this.head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    //to get node of a given index
    private Node getNode(int index) throws Exception {
        if(size == 0){
            throw new Exception("Linked List is Empty");
        }
        if(index<0 || index==size){
            throw new Exception("Invalid size");
        }
        Node temp = this.head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    //to remove first node of linked list
    public int removeFirst() throws Exception {
        if(this.size == 0){
            throw new Exception("LL is empty");
        }
        int rv = this.head.data;

        if(size == 1){
            this.head = null;
            this.tail = null;
            this.size--;
        }else{
            this.head = this.head.next;
            this.size--;
        }
        return rv;
    }

    //to remove last node of linked list
    public int removeLast() throws Exception {
        if(size == 0){
            throw new Exception("Linked List is empty");
        }
        int rv = this.tail.data;

        if(size == 1){
            this.head = null;
            this.tail = null;
            this.size--;
        }else{
            Node nm1 = getNode(size-2);
            this.tail = nm1;
            this.tail.next = null;
            this.size--;
        }
        return rv;
    }

    //to remove node at a given index
    // public int removeAt(int index) throws Exception {
    //     if(this.size == 0){
    //         throw new Exception("Linked List is Empty");
    //     }
    //     if(index<0 || index>=size){
    //         throw new Exception("Invalid Index");
    //     }

    //     if(index == 0){
    //         this.removeFirst();
    //     }else if(index == this.size-1){
    //         this.removeLast();
    //     }else{
    //         Node nm1 = getNode(index-1);
    //         Node n = nm1.next;
    //         Node np1 = n.next;
    //         nm1.next = np1;
    //         this.size--;

    //         return n.data;
    //     }
    // }

    //to reverse data of linked list
    public void reverseData() throws Exception {
        int left = 0;
        int right = this.size-1;
         while(left<right){
            Node ln = getNode(left);
            Node rn = getNode(right);
            int temp = ln.data;
            ln.data = rn.data;
            rn.data = temp;
            left++;
            right--;
        }
    }

    //to reverse pointers of linked list
    public void reversePointers() throws Exception{

        Node prev = this.head;
        Node curr = prev.next;

        while(curr!=null){
            Node ahead = curr.next;
            curr.next = prev;

            prev = curr;
            curr = ahead;
        }

        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;

        this.tail.next = null;

    }

    //to find middle node of linked list
    public int getMid(){
        Node slow = this.head;
        Node fast = this.head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    //to get kth element from the end of lnked list
    public int kElementFromEnd(int k){
        Node slow = this.head;
        Node fast = this.head;

        for(int i=0; i<k; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }
}
