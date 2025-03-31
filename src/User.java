public class User
{

    private String username;
    private String password;
    private boolean active;

    private String[][] accounts = {{"kund1", "lösenord"}, {"kund2", "lösenord12345"}};

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.active = true;
    }

    public boolean checkPassword()
    {
        for (String[] account : accounts) {
            if (this.username.equals(account[0]) && this.password.equals(account[1])) {
                return true;
            }
        }
        return false;
    }


}