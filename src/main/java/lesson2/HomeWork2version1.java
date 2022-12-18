package lesson2;

public class HomeWork2version1 {
    public static void main(String[] args) {
        HomeWork2version1 homeWork2 = new HomeWork2version1();
        homeWork2.sum(3, 8, 0);
    }
    public void sum(int a, int b, int result) {
        while (a <= b) {
            result = result + a;
            a++;
        }
        System.out.println(result);
    }
}

