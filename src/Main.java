import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Account> Accounts = new ArrayList<>();

        Accounts.add(new Admin("Anton", "anton123"));
        Accounts.add(new User("kund", "lösenord123"));

        boolean running = true;

        int choice;
        while (running)
        {
            System.out.println("\nVälkommen till (namnet på banken)\n");
            System.out.println("Vad vill du göra?");
            System.out.println("1. Skapa ett nytt konto");
            System.out.println("2. Logga in på ditt konto");
            choice = input.nextInt();
            if (choice == 1) {
                input.nextLine();
                System.out.print("Användarnamn: ");
                String username = input.nextLine();
                System.out.print("Lösenord: ");
                String password = input.nextLine();
                Accounts.add(new User(username, password));
                System.out.println("Kontot skapat!");
            }
            else if (choice == 2)
            {
                input.nextLine();
                System.out.print("Användarnamn: ");
                String username = input.nextLine();
                System.out.print("Lösenord: ");
                String password = input.nextLine();
                for(Account i: Accounts){
                    if(i.getPassword().equals(password) && i.getUsername().equals(username)){
                        i.login();
                        running = false;

                    }
                }
            }



        }
    }

}
