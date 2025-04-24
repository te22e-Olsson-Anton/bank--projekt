public class Account
{
    String username;
    String password;
    Account(String username, String password)
    {
        this.password = password;
        this.username = username;
    }
    public String getPassword()
    {
        return password;
    }
    public String getUsername()
    {
        return username;
    }
    void login()
    {

    }
}
