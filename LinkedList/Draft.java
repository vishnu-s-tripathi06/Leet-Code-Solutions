public class Draft{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(45);
        list.insertFirst(46);
        list.insertFirst(50);
        list.insertLast(99);
        list.insert(100, 3);
        
        list.display();
        System.out.print("End");
        System.out.println();
    }
}