public class Draft{
    private Node head;
    private Node tail;
    private int size;


    public Draft(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value + "->");
            temp=temp.next;
        }
        IO.print("End");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;

        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}