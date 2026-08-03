package HomePractice.DailyPractice.Practice;

public class Queue {
     int []arr;
     int capacity;
     int size;
     int front;
     Queue(int c){
         this.capacity = c;
         this.arr = new int[capacity];
         this.size = 0;
         this.front = -1;
     }

     public boolean isEmpty(){
         return this.size == 0;
     }

    public boolean isFull(){
        return this.size == this.capacity;
    }

    public int getFront(){
         if (this.isEmpty())
         {
             System.out.println("Queue is empty!!");
             return Integer.MAX_VALUE;
         }
         return arr[this.front];
    }

    public int getRear(){
        if (this.isEmpty())
        {
            System.out.println("Queue is empty!");
            return Integer.MAX_VALUE;
        }
        int rear = (this.front + this.size-1)%this.capacity;
        return arr[rear];
    }

    public void enqueue(int val)
    {
        if(this.isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        if (this.isEmpty())
        {
            this.front = 0;
//            this.arr[this.front] = val;
//            this.size++;
//            return;
        }
        int rear = (this.front + this.size-1)%this.capacity;
        this.arr[rear] = val;
        this.size++;
    }


    public int dequeue(){
        if(this.isEmpty())
        {
            System.out.println("Queue is Empty!!");
            return Integer.MAX_VALUE;
        }
        int re = this.arr[this.front];
        this.front = (this.front+1) % this.capacity;
        this.size--;
        if (this.size == 0)
        {
            this.front = -1;
        }
        return re;
    }

   public static void main(String[] args)
   {
        Queue qu = new Queue(3);
        qu.enqueue(10);
        System.out.println(qu.isEmpty());
        System.out.println(qu.isFull());
       System.out.println(qu.dequeue());
   }
}
