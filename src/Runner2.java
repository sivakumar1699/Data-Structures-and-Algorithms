public class Runner2 {
    public static void main(String args[]){
        Queue queue=new Queue();
        queue.enqueue(9);
        queue.enqueue(99);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(78);
        queue.show();
        System.out.println("Size "+queue.getSize());
        System.out.println(queue.isEmpty());
    }
}
