import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Account> Accounts = new ArrayList<>();

        Accounts.add(new Admin("Anton", "anton123")); //skapar admin
        ((Admin) Accounts.get(0)).setAccounts(Accounts); //ger admin tillgång till kontolistan

        Accounts.add(new User("kund", "lösenord123")); //skapar user


        boolean running = true;

        int choice;
        while (running) {
            //meny för huvudmeny
            System.out.println("\nVälkommen till (namnet på banken)\n");
            System.out.println("Vad vill du göra?");
            System.out.println("1. Skapa ett nytt konto");
            System.out.println("2. Logga in på ditt konto");

            try {
                choice = input.nextInt();
                input.nextLine(); // Rensa bufferten

                if (choice == 1) {
                    //skapar nytt konto
                    System.out.print("Användarnamn: ");
                    String username = input.nextLine();
                    System.out.print("Lösenord: ");
                    String password = input.nextLine();
                    Accounts.add(new User(username, password));
                    System.out.println("Kontot skapat!");
                } else if (choice == 2) {
                    //loggar in
                    System.out.print("Användarnamn: ");
                    String username = input.nextLine();
                    System.out.print("Lösenord: ");
                    String password = input.nextLine();
                    boolean found = false;

                    for (Account i : Accounts) //loopar igenom konto
                    {
                        if (i.getPassword().equals(password) && i.getUsername().equals(username)) {
                            i.login(); //loggar in
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Fel användarnamn eller lösenord. Försök igen.");
                    }
                } else {
                    System.out.println("Ogiltigt val. Vänligen välj 1 eller 2.");
                }
            } catch (Exception e) {
                System.out.println("Du måste skriva ett nummer. Försök igen.");
                input.nextLine(); // Rensa felaktig inmatning
            }
        }

    }
}