package stringsLesson;

public class LoginApp {
    public String expectedUserName = "admin";
    public String expectedPassword = "12345";
    public static void main(String[] args) {
        LoginApp loginApp = new LoginApp();
        loginApp.stringExamples();
      //  boolean success = loginApp.verifyUser("ADMIN", "12345");
      //  System.out.println("Login success " + success);
    }

    public boolean verifyUser(String userName, String password) {
        boolean success = false;
        if (userName==null || password==null){
            System.out.println("The userName or password is null");
        }
        // if (userName.isEmpty() || password.isEmpty()) {
        else if (userName.length() == 0 || password.length() == 0) {
            System.out.println("The userName or password is empty");
        }

        else if (userName.isBlank() || password.isBlank()) {
            System.out.println("The userName or password is blank");
        }
        else if (!userName.equalsIgnoreCase(expectedUserName) || !password.equalsIgnoreCase(expectedPassword)){
            System.out.println("The userName or password does not match the expected values.");

        }


        else {
            success = true;
        }
        return success;
    }
    public void stringExamples (){
        String txt1 = "dog";
        String txt2 = "catalog";
       // System.out.println(txt2.contains(txt1));

        //System.out.println(txt2.replace("cat",txt1));
        System.out.println(txt1.charAt(0));
        System.out.println(txt1.charAt(1));
        System.out.println(txt1.charAt(txt1.length()-1));
    }
}



