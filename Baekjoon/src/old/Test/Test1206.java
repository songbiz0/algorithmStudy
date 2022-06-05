package old.Test;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test1206 {
    public static void main(String[] args) {
        SortedMap<Integer, Integer> map = new TreeMap<>();
        map.put(4, 2);
        map.put(7, 1);
        map.put(11, 3);
        map.put(1, 11);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}
