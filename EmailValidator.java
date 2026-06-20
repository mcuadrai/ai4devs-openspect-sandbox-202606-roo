import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese email: ");
        String email = sc.nextLine();

        String[] parts = email.split("@");
        if (parts.length == 2) {
            String cuenta = parts[0];
            String dominio = parts[1];
            System.out.println("\u001B[32m" + cuenta + "\u001B[0m@" +
                               "\u001B[34m" + dominio + "\u001B[0m");
        }

        boolean valido = Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
        System.out.println(valido ? "✔️ Email válido" : "❌ Email inválido");
    }
}
