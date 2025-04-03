public class Admin extends Account
{



    public Admin(String username, String password)
    {
        super(username, password);
    }

    void login()
    {
        System.out.println("inloggade som admin");
    }
}
