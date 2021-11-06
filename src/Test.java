public class Test {
    public static void main(String[] args)
    {
        Queue q = new Queue();  //Making objects of Queue
        q.enqueue(56);          //Giving parameters to methods
        q.enqueue(30);
        q.enqueue(70);
        q.display();
        q.dequeue();

        System.out.println();
        System.out.println("Data after Dequeue");
        q.display();
        
    }
}
