
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

    public void display()
    {
        if (top == null) {
            System.out.printf("Stack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null)
            {
                System.out.print(temp.data+"  ");
                temp = temp.link;
            }
        }
    }
}