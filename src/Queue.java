import static java.lang.System.exit;

class Queue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    void enqueue(int key) {

        // Create a new LL node
        Node temp = new Node(key);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null)
        {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }
    public void display()
    {
        if (front == null)
        {
            System.out.println("Stack Underflow");
            exit(1);
        }
        else
        {
            Queue obj = new Queue();
            Node temp = front;
            while (temp != null)
            {
                System.out.print(temp.key+"  ");
                temp = temp.next;
            }
        }
    }
}
