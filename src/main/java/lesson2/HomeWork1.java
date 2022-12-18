package lesson2;

public class HomeWork1 {
    public static void main(String[] args) {
        HomeWork1 homeWork1 = new HomeWork1();
        homeWork1.countNumbers(0);
    }
    public void countNumbers(int i) {
        while (i < 100) {
            i++;
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("The number ‘" + i + "’ is divisible by two and three.");
            } else if (i % 3 == 0) {
                System.out.println("The number ‘" + i + "’ is divisible by three.");
            } else if (i % 2 == 0) {
                System.out.println("The number ‘" + i + "’ is even.");
            } else {
                System.out.println("The number ‘" + i + "’ is odd.");
            }
        }
    }
}