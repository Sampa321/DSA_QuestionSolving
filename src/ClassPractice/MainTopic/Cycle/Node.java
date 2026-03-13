package ClassPractice.MainTopic.Cycle;

public class Node {
   public int data;
   public Node next;
    Boolean visited;
    public Node(int value)
    {
        this.data = value;
        this.visited = false;
    }
}
