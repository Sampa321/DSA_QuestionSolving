package HomePractice.InfosysSpringBoard.Collections;

import java.util.LinkedList;
import java.util.List;

public class Q1 {
   public static void main(String[] args) {
       List<Integer> list = new LinkedList<>();
       list.add(10);
       list.add(20);
       list.add(2, 30);
       list.add(3, 40);
       System.out.println(list);

    }
}
