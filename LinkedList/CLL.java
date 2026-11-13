
public class CLL {
    private Node head;
    private Node tail;
    int size=0;
    public CLL(){
        this.head=null;
        this.tail=null;
    }
    public void delete(int value){
        Node node = head;
        if(node==null) return;
        if(node.value==value){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.value==value){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }


    public void insert(int value){
        Node node = new Node(value);
        if(head==null) {
            head=node;
            tail=node; return;}
        tail.next=node;
        node.next=head;
        tail=node;
       



    }
        
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
   
}
