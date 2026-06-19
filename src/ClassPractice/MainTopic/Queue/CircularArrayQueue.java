package ClassPractice.MainTopic.Queue;

public class CircularArrayQueue {
    int []arr;
    int capacity;
    int size;
    int front;
    CircularArrayQueue(int c){
        arr = new int[c];
        this.capacity = c;
        this.size = 0;
        this.front = -1;
    }

    boolean isFull(){
        return (this.size == this.capacity);
    }

    boolean isEmpty(){
        return (this.size == 0);
    }

    int getFront(){
        if(this.isEmpty()) return -1;
        else return front;
    }

    //return rear index
    int getRear(){
        if(this.isEmpty()) return -1;
        else return (this.front + this.size + 1) % this.capacity;
    }

    void enqueue(int value){
        if(this.isFull()) {
            System.out.println("Queue is full !!");
            return;
        }
        if(this.isEmpty())
        {
            this.front++;
        }
        int rear = getRear();
        rear = (rear + 1) % this.capacity;
        this.arr[rear] = value;
        this.size++;
    }

    int dequeue(){
        if(this.isEmpty())
        {
            System.out.println("Queue is empty!!");
            return -1;
        }
        int temp = this.arr[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size--;
        return temp;
    }

    public static void main(String[] args) {
        CircularArrayQueue queue = new CircularArrayQueue(4);
        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.getFront()); //Return index;
        queue.dequeue();
        queue.dequeue();
        System.out.println("Rear : "+queue.getRear());  //return index
        System.out.println("Front : "+queue.getFront());
        System.out.println("Empty : "+queue.isEmpty());
    }
}
