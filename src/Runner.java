public class Runner {
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(45);
        list.insert(10);
        list.insertAtStart(16);
        list.insertAt(0,55);
        list.deleteAt(2);
        list.show();
    }
}
