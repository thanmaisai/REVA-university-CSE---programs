package bank;

public class Account {
    public String name;
    protected String email;
    private String password;

    // Getters & setters - used for accessing private data

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
