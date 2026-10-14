package HomePractice.DailyPractice.Queue;

public class QueueUsingLL {
    Node front;
    Node rear;
    int size;
    QueueUsingLL(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    public void  enqueue(int val){
        Node temp = new Node(val);
        if (rear == null)
        {
            front = temp;
            rear = temp;
            return;
        }
        else {
            rear.next = temp;
            rear = rear.next;

        }
        this.size++;
    }

    public void dequeue(){
        if (front == null)
        {
            System.out.println("Queue is empty!!");
            return;
        }
       else if (size == 1)
        {
            this.front = null;
            this.rear = null;
        }
        else {
            this.front = this.front.next;
        }
        this.size--;
    }

    public int getSize(){
        return this.size;
    }

    public boolean empty(){
        return this.size == 0;
    }

    public int getFront(){
        if (this.front == null)
        {
            System.out.println("Queue is empty!!");
            return Integer.MAX_VALUE;
        }
        return this.front.val;
    }


    public int getRear(){
        if(this.rear == null)
        {
            System.out.println("Queue is empty!!");
            return Integer.MAX_VALUE;
        }
        return this.rear.val;
    }

   public static void main(String[] args) {
         QueueUsingLL obj = new QueueUsingLL();

         obj.enqueue(10);
         obj.enqueue(20);
         obj.enqueue(30);
         obj.dequeue();
       System.out.println(obj.size);
       Node.traverse(obj.front);
    }
}
