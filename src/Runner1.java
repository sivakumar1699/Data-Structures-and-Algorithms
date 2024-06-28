public class Runner1 {
    public static void main(String args[]){
        Stack nums=new Stack();
        nums.push(16);
        nums.push(10);
        System.out.println(nums.peek());
        nums.push(45);
        System.out.println(nums.pop());
        nums.show();
    }
}
