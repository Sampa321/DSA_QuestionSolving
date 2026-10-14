package HomePractice.DailyPractice.Stack;

public class TwoStackInOneArray {
    int top1;
    int top2;
    int []arr;
    int capacity;
    TwoStackInOneArray(int size){
        top1 = -1;
        top2 = size;
        arr = new int[size];
        this.capacity = size;
    }

    void push1(int ele){
         if (top2-top1 > 1)
         {
             arr[++this.top1] = ele;
         }
         else{
             System.out.println("Stack is full");
         }
    }

    void push2(int ele)
    {
        if (top2-top1 > 1)
        {
            arr[--this.top2] = ele;
        }
        else{
            System.out.println("Stack is full");
        }

    }

    int pop1(){
         if (this.top1 == -1)
         {
             System.out.println("Stack1 is empty!!");
             return Integer.MAX_VALUE;
         }
         else {
             int re  = arr[this.top1];
             this.top1--;
             return re;
         }
    }

    int pop2(){
        if (this.top2 == this.capacity)
        {
            System.out.println("Stack2 is empty!!");
            return Integer.MAX_VALUE;
        }
        else {
            int re  = arr[this.top2];
            this.top2++;
            return re;
        }
    }

   public static void main(String[] args) {
        int size = 5;
        TwoStackInOneArray obj = new TwoStackInOneArray(size);
        obj.pop2();
        obj.push1(12);
        obj.push1(52);
       obj.push1(72);
       obj.push2(15);
       obj.push2(85);
       obj.push2(95);
       System.out.println(obj.pop2());
       System.out.println(obj.pop2());
       System.out.println(obj.pop2());
       System.out.println(obj.pop2());
    }
}
