public class Stack {
    public static void main(String[] args)
    {
        // create Object of Implementing class
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        // insert Stack value
        obj.push(70);
        obj.push(30);
        obj.push(56);

        // print Stack elements
        obj.display();
    }
}