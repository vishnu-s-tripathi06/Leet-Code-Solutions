
public class LL {
    private Node head;
    private Node tail;
    private int size;


    public LL(){
        this.size=0;
    }
    public void putAtLast(int value){
        Node node = new Node(value);
        node.next = tail;
        tail=node;
    }



    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next= head ;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
}

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }

    }
    



    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
            }
        public Node(int value, Node next){
            this.next=next;
            this.value=value;
            }

    }
   
}
