import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login: ");
        String login = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Confirm password: ");
        String confirmPassword = scanner.nextLine();
        try {
            DataValidator.dataValidator(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Wrong login");
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password");
        }
    }
}