import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Account
{

    private ArrayList<Account> accounts;

    public Admin(String username, String password)
    {
        super(username, password);
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    void login()
    {
        System.out.println("Inloggad som admin");
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = true;

        while (loggedIn)
        {
            System.out.println("\nAdmin-meny:");
            System.out.println("1. Visa alla konton och saldo");
            System.out.println("2. Logga ut");
            System.out.print("Välj ett alternativ: ");

            int val = scanner.nextInt();
            switch (val)
            {
                case 1:
                    showAccounts();
                    break;
                case 2:
                    loggedIn = false;
                    System.out.println("Loggar ut...");
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

    private void showAccounts() {
        System.out.println("\nLista över alla konton:");

        for (Account acc : accounts) //loopar igenom alla konton
        {
            if (acc instanceof User) //om kontot är en användare
            {
                User user = (User) acc; //omvandlar Account till user
                System.out.println("Användare: " + user.getUsername() + " | Saldo: " + user.getBalance() + " kr");
            }
            else if (acc instanceof Admin) //om kontot är en admin
            {
                System.out.println("Admin: " + acc.getUsername());
            }
        }
    }
}
