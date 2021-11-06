
import static java.lang.System.exit;

// Create Stack Using Linked list
class StackUsingLinkedlist {

    // A linked list node
    private class Node {

        int data;   // integer data
        Node link; // reference variable Node type
    }
    // create global top reference variable global
    Node top;
    // Constructor
    StackUsingLinkedlist()
    {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(int x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();

        if (temp == null) {
            System.out.print("Heap Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;

        top = temp;
    }
    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        return top == null;
    }

    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        top = (top).link;
    }


    public void display()
    {
        if (top == null) {
            System.out.println("Stack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null)
            {
                System.out.println(temp.data+"  ");
                temp = temp.link;
            }
        }
    }
}