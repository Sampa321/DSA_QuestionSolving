package HomePractice.Leetcode.Array.Easy;
// 18
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> newList1 = new ArrayList<>();
        newList1.add(1);
        list1.add(newList1);
        if (numRows == 1) return list1;
        for (int i = 1; i < numRows; i++) {
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for (int j = 0; j < (list1.get(i - 1).size()) - 1; j++) {
                int sum = list1.get(i - 1).get(j) + list1.get(i - 1).get(j + 1);
                newList.add(sum);
            }
            newList.add(1);
            list1.add(newList);
        }
        return list1;
    }
    public static void main(String []args) {
       System.out.println(generate(5));
    }
}
