import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctLogin = "ayana";
        String correctPassword = "2007";

        boolean authorized = false;

        while (!authorized) {
            System.out.print("Введите логин: ");
            String login = scanner.nextLine();

            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();

            if (login.equals(correctLogin) && password.equals(correctPassword)) {
                System.out.println("Авторизация успешна!");
                authorized = true;
            } else {
                System.out.println("Неверный логин или пароль. Попробуйте снова.");
            }
        }

        scanner.close();
    }
}
