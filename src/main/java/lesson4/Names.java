package lesson4;

import java.util.*;
public class Names {
    public void removeDuplicates() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Steve");
        list.add("Tim");
        list.add("Lucy");
        list.add("Steve");
        list.add("Pat");
        list.add("Angela");
        list.add("Tom");
        list.add("Tim");
        list.add("Anna");
        list.add("Lucy");
        Set<String> hashSetList = new HashSet<String>(list);
        System.out.println(hashSetList);
    }
}
