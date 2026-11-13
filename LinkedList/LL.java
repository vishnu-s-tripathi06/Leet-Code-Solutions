
public class LL {
    private Node head;
    private Node tail;

    private int size;
    public LL(){
        this.size=0;
    }
    private class Node{
        private int value;
        private Node next;
        //################################

        public Node(int value){
            this.value=value;

        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
        public void insertLast(int val){
            Node node = new Node(val);
            
            if(head==null){
                head=node;
                tail=node;

            }
            tail.next=node;
            tail=node;
            size++;
                
            
        }
            
               
    public void insertFirst(int val){
            Node node = new Node(val);
            node.next=head;
            head = node;
            if(tail==null){
                tail=head;
            }
            size++;
        }

    public void insert(int val, int index){
        int i =0;
        Node temp=head;
        if (index < 0 || index > size) {
        // Handle invalid index
            System.out.println("Ghop Ghop");
            return;
        }
        if(index==0){
            insertFirst(val);   
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        while (i<index-1) {
            temp=temp.next; i++;
        }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;
    }


    public int deleteFirst(){
        int val=head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size<=1) return deleteFirst();
        Node secondLast = get(size-2);
        int val = tail.value;
        tail=secondLast;
        return val;
    }
    //to delete perticular index
    public int delete(int index){
        if(index==0) deleteFirst();
        if(index==size-1) deleteLast();
        Node previous = get(index-1);
        int val = previous.next.value;
        previous.next=previous.next.next;
        return val;
    }
    //find perticular value
    public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.value==val) return node;
            node = node.next;
              }
        return null;    
    }
            

//we never move the actual head because it will change the structure of LL
       
        public void display(){
            Node temp=head;
            while (temp!=null) {
            
                System.out.print(temp.value+" -> ");
               
                temp=temp.next;
            }
             System.out.println("End");
        }
    }
    



                    

        
                





   
    



    

    



    

