package lesson4;

import java.util.HashMap;
import java.util.Scanner;

public class Toys2 {

    public String getToyByld2() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(12, "Batmobile");
        hashMap.put(45, "Light Saber");
        hashMap.put(6, "Wonder Woman");
        hashMap.put(201, "Hello Kitty Bag");
        hashMap.put(56, "Junior QA Analyst Doll");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Toy ID: ");
        int id = Integer.parseInt(scanner.next());
        String c = "No such toy";
        String b = hashMap.get(id);
        if (b == null) {
            return c;
        } else {
            return b;
        }
    }
}
