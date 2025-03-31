public class Admin
{

    private String adminUsername;
    private String adminPassword;
    private boolean adminActive;

    private String[][] adminAccounts = {{"admin1", "lösenord"}, {"admin2", "lösenord12345"}};


    public Admin(String adminUsername, String adminPassword)
    {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.adminActive = true;
    }

    public boolean adminCheckPassword()
    {
        for (String[] account : adminAccounts) {
            if (this.adminUsername.equals(account[0]) && this.adminPassword.equals(account[1])) {
                return true;
            }
        }
        return false;
    }
}
