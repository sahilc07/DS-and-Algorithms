public class ClientLL {
    public static void main(String[] args) throws Exception {
        
        LinkedList LL = new LinkedList();
        LL.addFirst(10);
        LL.addLast(20);
        LL.addLast(30);
        LL.addFirst(40);
        LL.addFirst(50);
        LL.display();
        // System.out.println();
        // System.out.println(LL.getData(3));
        LL.addAt(60, 3);
        LL.display();
        System.out.println(LL.removeFirst()); 
        LL.display();
        System.out.println(LL.removeLast());
        LL.display();
        LL.reverseData();
        LL.display();
        LL.reversePointers();
        LL.display();
        System.out.println(LL.getMid());
    }
}
