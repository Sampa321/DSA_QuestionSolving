package ClassPractice.MainTopic.Dequeue;


import ClassPractice.MainTopic.DoublyLinkedList.Node;

public class Operations {
    Node front;
    Node rear;
    int size = 0;
    public Node insertFront(Node head, int data){
        Node temp = new Node(data);
        if (head == null)
        {
            temp.next = null;
            temp.prev = null;
            this.front = temp;
            this.size++;
            this.rear = temp;
            return temp;
        }
        temp.next = head;
        head.prev = temp;
        temp.prev = null;
        this.front = temp;
        this.size++;
        return temp;
    }
    public Node insertRear(Node head, int data){
        Node temp = new Node(data);
        if (head == null)
        {
            temp.prev = null;
            temp.next = null;
            return temp;
        }
        rear.next = temp;
        temp.prev = this.rear;
        this.rear = this.rear.next;
        this.size++;
        return head;
    }
    public Node removeFront(Node head){
        if(head == null)
        {
            System.out.println("Head is null!!");
            return null;
        }
        head.next.prev = null;
        this.front = this.front.next;
        this.size--;
        return head.next;
    }
    public void removeRear(Node head){
        if(head == null)
        {
            System.out.println("Head is null!!");
            return;
        }
        this.rear = this.rear.prev;
        this.rear.next = null;
        this.size--;
    }
    public int getSize(){
        return this.size;
    }
    public int getFront(Node head){
        if(head == null)
        {
            System.out.println("Head is null!!");
            return -1;
        }
        return this.front.data;
    }
    public int getRear(Node head){
        if(head == null)
        {
            System.out.println("Head is null!!");
            return -1;
        }
       return this.rear.data;
    }
   public static void main(String []args) {
        Operations sc = new Operations();
        Node head = null;
        sc.removeFront(head);
        head = sc.insertFront(head,10);
        head = sc.insertFront(head,20);
        head = sc.insertRear(head,30);
       head = sc.removeFront(head);
       head = sc.insertRear(head,40);
        head = sc.removeFront(head);
        sc.removeRear(head);
       System.out.println(sc.getSize());
       System.out.println(sc.getFront(head));
       System.out.println(sc.getRear(head));
        Node.traverse(head);
    }
}
