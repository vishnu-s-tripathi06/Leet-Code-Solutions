public class main{
    public static void main(String[] args) {
        DLL list=new DLL();
        for(int i=6;i>0;i--){
            list.insertFirst(i);
        }

        list.insertLast(99);


        list.display();
        list.displayRev();

    }
}


