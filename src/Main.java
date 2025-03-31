import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tangentbord = new Scanner(System.in);

        System.out.println("1. För att logga in som ANVÄNDARE");
        System.out.println("2. För att logga in som ADMIN");

        int val = tangentbord.nextInt();
        tangentbord.nextLine(); // Rensar bufferten efter `nextInt()`

        if (val == 1) {
            loginUser(tangentbord); // Skicka scanner-objektet
        } else if (val == 2) {
            loginAdmin(tangentbord); // Skicka scanner-objektet
        } else {
            System.out.println("Felaktigt val. Vänligen ange 1 eller 2.");
        }

        tangentbord.close(); // Stänger Scanner när vi är klara
    }

    public static void loginUser(Scanner input) {
        System.out.println("\nVälkommen till (namnet på banken)\n");
        System.out.println("Ange användarnamn och lösenord för att logga in som ANVÄNDARE");

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
    }

    public static void loginAdmin(Scanner input) {
        System.out.println("\nVälkommen till (namnet på banken)\n");
        System.out.println("Ange admin-användarnamn och lösenord för att logga in som ADMIN");

        System.out.print("Användarnamn: ");
        String adminUsername = input.nextLine();

        System.out.print("Lösenord: ");
        String adminPassword = input.nextLine();

        Admin adminLogin = new Admin(adminUsername, adminPassword);

        if (adminLogin.adminCheckPassword()) {
            System.out.println("Du är inloggad som ADMIN");
        } else {
            System.out.println("Användarnamnet eller lösenordet är felaktigt");
        }
    }
}
