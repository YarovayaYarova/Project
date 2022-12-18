package lesson4;

import com.sun.source.tree.IfTree;

import java.util.HashMap;

public class Toys {
    public String getToyByld(int id) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(12, "Batmobile");
        hashMap.put(45, "Light Saber");
        hashMap.put(6, "Wonder Woman");
        hashMap.put(201, "Hello Kitty Bag");
        hashMap.put(56, "Junior QA Analyst Doll");
        String c = "No such toy";
        String b= hashMap.get(id);
        if (b == null) {
            return c;
        } else {
            return b;
        }
    }
}









