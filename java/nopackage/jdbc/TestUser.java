public class TestUser {
    public static void main(String[] args) {
        User user = new User();
        
        // Test case 1
        String email1 = "admin@cms.org";
        String password1 = "password";
        display(user.login(email1, password1));

        // Test case 2
        String email2 = "staff@cms.org";
        String password2 = "somepassword";
        display(user.login(email2, password2));
    }

    static void display(boolean val) {
        if(val == true)
            System.out.println("Login successful!");
        else
            System.out.println("Login failed!");;
    }
}