package Class1;

public class Task2 {
    public static void main(String[] args) {
        String username = "Kawoon";
        String password = "qwe456";
        String confirmPassword = "qwe456";
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username or Password cannot be Empty");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your user name and password has been created");
        }

    }
}
