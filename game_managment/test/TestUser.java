public class TestUser {
    public static void main(String[] args) {
        User user = new User("Cuong", "Cuong@gmail.com", "123456");

        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());


        user.setUsername("Cuonggg");
        System.out.println("Updated Username: " + user.getUsername());
    }
}
