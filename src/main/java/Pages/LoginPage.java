package Pages;

public class LoginPage extends Page {

    private String userName;
    private String password;
    public void populateCredentials (String userName, String password){
        System.out.println(String.format("Credentials are populated: %s, %s", userName,password));
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
