import java.util.Scanner;

class User {

    protected String username;

    protected String password;

    void register(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("username: " + this.username);
        System.out.println("password: " + this.password);
    }

    void notification() {
        System.out.println("user created by User");
    }
}

class Admin extends User {

    private final String role = "admin";

    @Override
    void notification() {
        System.out.println("User Created By "+ role);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("REGISTRASI");

        System.out.println("Masukan username:");
        String username = input.nextLine();

        System.out.println("Masukan password:");
        String password = input.nextLine();

        User user = new Admin();
        user.register(username, password);
        user.notification();
    }
}