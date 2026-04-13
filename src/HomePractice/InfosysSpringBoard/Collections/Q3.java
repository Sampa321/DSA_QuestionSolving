package HomePractice.InfosysSpringBoard.Collections;

import java.util.TreeMap;

public class Q3 {
    public static void main(String[] args) {
        TreeMap<Integer, String> TM = new TreeMap<Integer, String>();
        TM.put(1, "JAVA");
        TM.put(2, "Python");
        TM.put(4, "Ruby on Rails");
        TM.put(3, "C#");
        System.out.println(TM.lastEntry());
    }
}
