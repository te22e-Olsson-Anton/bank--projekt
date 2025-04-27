public class Account
{
    //gemensamma attribut till alla konton
    String username;
    String password;

    //konstrukor
    Account(String username, String password)
    {
        this.password = password;
        this.username = username;
    }
    //ger lösenorden
    public String getPassword()
    {
        return password;
    }
    //ger användarnamnet
    public String getUsername()
    {
        return username;
    }
    void login()
    {

    }
}
