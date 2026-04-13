package HomePractice.InfosysSpringBoard.Collections;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(("apple"));
        list.add("banana");
        list.add("orange");
        list.add("mango");
        list.add("banana");
        list.remove(1);
        list.set(2, "grape");
        list.remove("banana");
        Set<String> set = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();
        for(int index = 0; index < list.size(); index++)
        {
            map.put(index, list.get(index));
        }
        map.put(3,"pineapple");
        System.out.println(map);
    }
}
