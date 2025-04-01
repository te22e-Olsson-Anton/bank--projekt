import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tangentbord = new Scanner(System.in);

        while (true) {
            System.out.println("1. För att logga in som ANVÄNDARE");
            System.out.println("2. För att logga in som ADMIN");
            System.out.println("3. Avsluta programmet");

            int val = tangentbord.nextInt();
            tangentbord.nextLine();

            if (val == 1)
            {
                if (loginUser(tangentbord)) break;
            }
            else if (val == 2)
            {
                if (loginAdmin(tangentbord)) break;
            }
            else if (val == 3) {
                System.out.println("Programmet avslutas...");
                break;
            }
            else
            {
                System.out.println("Felaktigt val. Vänligen ange 1, 2 eller 3.");
            }
        }

        tangentbord.close();
    }

    public static boolean loginUser(Scanner input) {
        while (true)
        {
            System.out.println("\nVälkommen till (namnet på banken)\n");
            System.out.println("Ange användarnamn och lösenord för att logga in som ANVÄNDARE");

            System.out.print("Användarnamn: ");
            String username = input.nextLine();

            System.out.print("Lösenord: ");
            String password = input.nextLine();

            User login = new User(username, password);

            if (login.checkPassword())
            {
                System.out.println("Du är inloggad som användare");
                return true;
            }
            else
            {
                System.out.println("Användarnamnet eller lösenordet är felaktigt. Försök igen.");
            }
        }
    }

    public static boolean loginAdmin(Scanner input) {
        while (true)
        {
            System.out.println("\nVälkommen till (namnet på banken)\n");
            System.out.println("Ange admin-användarnamn och lösenord för att logga in som ADMIN");

            System.out.print("Användarnamn: ");
            String adminUsername = input.nextLine();

            System.out.print("Lösenord: ");
            String adminPassword = input.nextLine();

            Admin adminLogin = new Admin(adminUsername, adminPassword);

            if (adminLogin.adminCheckPassword())
            {
                System.out.println("Du är inloggad som ADMIN");
                return true;
            }
            else
            {
                System.out.println("Användarnamnet eller lösenordet är felaktigt. Försök igen.");
            }
        }
    }
}
