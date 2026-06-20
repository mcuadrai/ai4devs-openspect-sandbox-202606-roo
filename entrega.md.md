Adjunto archivo Captura.png




*Micro-tarea:* Quiero un validador de email
*Pilar 1 — Herramienta: Voy a a usar Cursor
*Pilar 2 — Contexto:* lenguaje java
 Pilar 3 — Prompt:* que la entrada sean desde el terminal, ycuadno el usuario escriba el dominio del correo, este debe ser de un color diferente de la identificacion de la cuenta y en el terminal se debe mostrar si el validador acepta  debe haber un ticket al lado y una X si no funciona


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

# Aprendizaje
  Interesante en amazonq, el archivo de SKILL,md por el openspec-propose, openspec-explore, openspec-apply y openspec-archive  



