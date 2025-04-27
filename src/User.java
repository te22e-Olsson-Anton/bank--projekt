import java.util.Scanner;

public class User extends Account
{
    private double balance;

    public User(String username, String password)
    {
        super(username, password);
        this.balance = 0;
    }
    void login()
    {
        System.out.println("inloggade som användare");
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = true;

        while (loggedIn)
        {
            System.out.println("\nInloggad som användare: " + getUsername());
            System.out.println("1. Sätt in pengar");
            System.out.println("2. Ta ut pengar");
            System.out.println("3. Visa saldo");
            System.out.println("4. Logga ut");
            System.out.print("Välj ett alternativ: ");

            int val = scanner.nextInt();
            switch (val)
            {
                case 1:
                    System.out.print("Ange belopp att sätta in: ");
                    double deposit = scanner.nextDouble();
                    depositMoney(deposit);
                    break;
                case 2:
                    System.out.print("Ange belopp att ta ut: ");
                    double withdraw = scanner.nextDouble();
                    withdrawMoney(withdraw);
                    break;
                case 3:
                    System.out.println("Ditt saldo är: " + balance + " kr");
                    break;
                case 4:
                    loggedIn = false;
                    System.out.println("Loggar ut...");
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

    public void depositMoney(double amount)
    {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " kr har satts in.");
        } else {
            System.out.println("Beloppet måste vara positivt.");
        }
    }

    public void withdrawMoney(double amount)
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " kr har tagits ut.");
        } else {
            System.out.println("Otillräckligt saldo eller ogiltigt belopp.");
        }
    }
    public double getBalance()
    {
        return balance;
    }



}