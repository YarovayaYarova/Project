package lesson4;

import java.util.*;

public class ArrayExamples {
    public void stringArray (){
        String [] buttons = {"Ok", "Cancel", "Login", "SignUp"};
        System.out.println(buttons[2]);
        int length = buttons.length;
        System.out.println("length: " + length);
        buttons [2]="Exit";
        for ( String button : buttons){
            System.out.println(button);
        }
    }
    public void stringArrayWithSize(){
        String [] array = new String[5];
        array[0]="Ok";
        array[1]= "Cancel";
        array [2]= "Login";
        array [3] = "SignUp";
        System.out.println("length: " + array.length);
    }

    public void arrayListExample (){
        ArrayList<String>buttons=new ArrayList<String>();
        buttons.add("Ok");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("Exit");

        System.out.println(buttons.get(0));
        System.out.println();

        System.out.println(buttons.size());
        buttons.add("SignUp");
        for (String button : buttons){
            System.out.println(button);
        }
        System.out.println();
        buttons.remove("Exit");
        for (String button: buttons){
            System.out.println(button);
        }
        System.out.println();
        buttons.clear();
        System.out.println(buttons.size());
        System.out.println();
    }
    public void arrayListSortingExamples(){
        ArrayList<Integer>arrayList=new ArrayList<Integer>();
        arrayList.add(123);
        arrayList.add(1);
        arrayList.add(65);
        Collections.sort(arrayList);
        for (Integer i : arrayList){
            System.out.println(i);

        }

    }
    public void hashMapExample(){
        HashMap<String,String>hashMap=new HashMap<String, String>();
        hashMap.put("John", "Toronto");
        hashMap.put("Kate", "Moscow");
        hashMap.put("Moshe", "Tel-Aviv");
        System.out.println(hashMap);
        System.out.println(hashMap.get("Moshe"));
        hashMap.remove("John");
        System.out.println(hashMap.size());
    }

    public void hashSet(){
        HashSet<String> hashSet =new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Kate");
        hashSet.add("Moshe");
       // System.out.println(hashSet);
        List<String> list=new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);

    }

}
