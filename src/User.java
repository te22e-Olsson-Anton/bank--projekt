import java.util.Scanner;

public class User extends Account
{
    private double balance;

    //konstruktor
    public User(String username, String password)
    {
        super(username, password);
        this.balance = 0; //nytt konto börjar med 0 kr
    }
    //överskrider login för user
    void login()
    {
        System.out.println("inloggade som användare");
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = true;

        while (loggedIn)
        {
            //användar meny
            System.out.println("\nInloggad som användare: " + getUsername());
            System.out.println("1. Sätt in pengar");
            System.out.println("2. Ta ut pengar");
            System.out.println("3. Visa saldo");
            System.out.println("4. Logga ut");
            System.out.print("Välj ett alternativ: ");

            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    //sätta in pengar
                    System.out.print("Ange belopp att sätta in: ");
                    double depositAmount = scanner.nextDouble();
                    depositMoney(depositAmount);
                    break;
                case 2:
                    //ta ut pengar
                    System.out.print("Ange belopp att ta ut: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdrawMoney(withdrawAmount);
                    break;
                case 3:
                    //kolla hur mycket pengar du har
                    System.out.println("Ditt saldo är: " + balance + " kr");
                    break;
                case 4:
                    //logar ut
                    loggedIn = false;
                    System.out.println("Loggar ut...");
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

    //sätta in pengar
    public void depositMoney(double amount)
    {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " kr har satts in.");
        } else {
            System.out.println("Beloppet måste vara positivt.");
        }
    }
    //ta ut pengar
    public void withdrawMoney(double amount)
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " kr har tagits ut.");
        } else {
            System.out.println("Otillräckligt saldo eller ogiltigt belopp.");
        }
    }
    //returnerar antalet pengar
    public double getBalance()
    {
        return balance;
    }



}