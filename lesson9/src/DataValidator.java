public class DataValidator {
    public static void dataValidator(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
        if (password.length() > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
