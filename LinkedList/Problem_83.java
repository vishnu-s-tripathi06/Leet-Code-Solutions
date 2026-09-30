import org.w3c.dom.Node;

public class Problem_83 {

    public static LL mergeLL(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL answer = new LL();
        while (f!=null && s!=null) {
            if(f.value < s.value){
                answer.insertLast(f.value);
                f = f.next;
            }
            else{
                answer.insertLast(s.value); 
                s = s.next;
            }
            while(f != null){
                answer.insertLast(f.value);
                f = f.next;
            }
            while(s != null){
                answer.insertLast(s.value);
                s = s.next;         

            }
            return answer;

                
            
        }

    }
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
       
        list.insertLast(4);
        list.display();
  
        list.removeDuplicates();
        list.display();

    }
    
}
