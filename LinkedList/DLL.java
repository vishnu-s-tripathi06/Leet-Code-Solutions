public class DLL {
    private Node head;
    private Node tail;
    private int size;
  
    private class Node{
        private int value;
        private Node next;
        private Node prevNode;

        public Node(int value){
        this.value=value;
        
        }
        public Node(int value, Node next, Node prevNode){
            this.value=value;
            this.next=next;
            this.prevNode=prevNode;
        }
    }
        public void insertFirst(int val){
            Node node = new Node(val);
            node.next=head;
            node.prevNode=null;
            if(head!=null) head.prevNode=node;  
            else tail=node;

            head=node;
            size++;
        }

        public void insertLast(int val){
            Node node= new Node(val);
            if(head==null) head= node;
            Node temp=head;
            while(temp.next!=null){
                temp = temp.next;
            }
            node.prevNode=temp;
            temp.next=node;

            temp=node;
            tail = temp;

            size++;
        }

        public Node find(int value){
            Node p=head;
            while(p!=null){
                if(p.value!=value){
                    return p;
                }
                p=p.next;
            }

            return null;

        }
        public void displayRev(){
            Node node = tail;
            while(node!=null){
                System.out.print(node.value+" -> ");
                node=node.prevNode;
            }
            System.out.println("Start");
                
        }
        public void display(){
            Node node=head;
            while(node!=null){
                System.out.print(node.value+" -> ");
                node=node.next;
            }
            System.out.println("End");
        }

       

    }

       

    
    

        

            



       
            



