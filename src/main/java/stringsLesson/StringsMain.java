package stringsLesson;

public class StringsMain {
    public static void main(String[] args) {
        StringsMain stringsMain = new StringsMain();
        int result = stringsMain.sumOfTwoNumbers(2,4);
        //System.out.println(result);

      //  System.out.println(stringsMain.getText());

    }
    public int sumOfTwoNumbers (int num1, int num2){
        int result = num1 +num2;
        return result;
    }
    public String getText(){
      return "blablabla";

    }

}
