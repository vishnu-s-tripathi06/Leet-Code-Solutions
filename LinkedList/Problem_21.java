import org.w3c.dom.Node;

public class Problem_21 {
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
