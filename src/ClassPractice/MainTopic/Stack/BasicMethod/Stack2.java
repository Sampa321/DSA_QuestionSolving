package ClassPractice.MainTopic.Stack.BasicMethod;
// stack for linked list
public class Stack2 {
    private Node head;
    private int size;
    Stack2(){
        this.head = null;
        this.size = 0;
    }


    public boolean isEmpty(){
       return this.head == null;
    }

    public void push(int value){
        Node temp = new Node(value);
        if (this.head == null)
        {
            this.head = temp;
        }
        else {
            temp.next = this.head;
            this.head = temp;
        }
        size++;
    }

    public int pop(){
        if(this.isEmpty())
        {
            System.out.println("Error : Stack is empty !!");
            return Integer.MAX_VALUE;
        }
        Node result = this.head;
        this.head = head.next;
        this.size--;
        return result.data;
    }

    public int peak(){
        if(this.isEmpty())
        {
            System.out.println("Error : Stack is empty !!");
            return Integer.MAX_VALUE;
        }
        return this.head.data;
    }

    public int size(){
        return this.size;
    }


    public static void main(String[] args) {
        Stack2 st = new Stack2();
        System.out.println(st.isEmpty());  //true
        st.push(34);
        st.push(24);
        st.push(89);
        st.push(1);
        System.out.println(st.pop());//1
        System.out.println(st.pop());//89
        System.out.println(st.peak());//24
        System.out.println(st.size());
    }
}
