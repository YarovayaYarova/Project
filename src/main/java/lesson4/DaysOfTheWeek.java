package lesson4;

import java.util.ArrayList;

public class DaysOfTheWeek {
    public String getDay(int day) {
        ArrayList<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        String a = days.get(day - 1);
        return a;


    }
}

