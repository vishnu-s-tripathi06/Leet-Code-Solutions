public class DLL {
    private Node head;
    private Node tail;
    private int size;
    public DLL() {
        this.size = 0;
    }

    

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = node; // FIX: set tail to the new node if list was empty
        }
        size++;
    }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " -> ");
             
                temp = temp.next;
            }
        }
         public void displayRev(){
            Node temp = tail;
            while(temp != null){
                System.out.print(temp.val + " -> ");
                temp = temp.prev;
            }
        }

    private class Node{
        int val;
        Node prev;
        Node next;
    
        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next , Node prev){
            this.val=val;
            this.next = next;
            this.prev = prev;
        }
    }
}

       
            



