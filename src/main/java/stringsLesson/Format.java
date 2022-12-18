package stringsLesson;

public class Format {
    public static void main(String[] args) {
        String name = "Vasiliy";
        String gender = "mail";
        int age = 20;
        double salary = 5000.50d;
        System.out.println(String.format("The name is %s, the gender is %s, the age is %d, the salary is %f", name, gender, age, salary));


    }
}
