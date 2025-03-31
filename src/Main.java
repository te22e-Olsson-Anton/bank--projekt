import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nVälkommen till (namnet på banken)\n");

        System.out.println("Ange användarnamn och lösenord för att logga in");

        System.out.print("Användarnamn: ");
        String username = input.nextLine();

        System.out.print("Lösenord: ");
        String password = input.nextLine();


        User login = new User(username, password);


        if (login.checkPassword()) {
            System.out.println("Du är inloggad som användare");
        } else {
            System.out.println("Användarnamnet eller lösenordet är felaktigt");
        }

        input.close();
    }
}
