
public class LL {
    private Node head;
    private Node tail;
    private int size;


    public LL(){
        this.size=0;
    }

//Creating the class Node.
    private class Node{
        private int value; //stores actual value of LL. it is an example here. 
        private Node next;

        public Node(int value){
            this.value=value;
            }

        public Node(int value, Node next){
            this.next=next;
            this.value=value;
            }
        }

//inserting element at first position or starting of LL
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next= head ;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++; //node's size must increase with every addition
    }

    public Node find(int val){
        Node node= head;
        while(node != null){
            if(node.value==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public int delete(int index){
        if(index==0){
            deleteFirst();

        }
        else if(index == size-1){
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }


    public int deleteLast(){
        if(size<=1){
            return deleteFirst();

        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }


    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node=node.next;

        }
        return node;
    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail =null;
        }
        size--;
        return val;
    }
            
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);   
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail=node;
        size++;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);   
            return;
        }
        if(index==size){
            insertLast(val);    
            return;
        }
        Node temp=head;
        for(int i=0;i<index; i++){
            temp=temp.next;

        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }
//Display whole LL, by moving the temp node. 
//Do not move the head node otherwise it will change the structure of LL
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }

    }
    
 }



    

    



    

