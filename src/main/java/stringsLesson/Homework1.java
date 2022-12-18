package stringsLesson;

public class Homework1 {
    public static void main(String[] args) {
        Homework1 homework1 = new Homework1();
        homework1.compareStrings("Category", "Cat");
        System.out.println(homework1.isPalindrome("racecar"));
    }

    public void compareStrings(String txt1, String txt2) {
        if (txt1 == null || txt2 == null) {
            System.out.println("Cannot compare Strings");
        } else if (txt1.equals(txt2)) {
            System.out.println("The Strings are the same");
        } else if (txt1.contains(txt2)) {
            System.out.println(String.format("%s is a part of %s", txt2, txt1));
        }
    }

    public boolean isPalindrome(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        if (result.equals(text)) {
            return true;
        } else {
            return false;
        }
    }
}









