public class User extends Account
{


    public User(String username, String password)
    {
        super(username, password);
    }
    void login()
    {
        System.out.println("inloggade som användare");
    }
}