package bank;

public class Bank {
    public static void main(String[] args) { 
        Account account1 = new Account();
        account1.name = "thanmai";
        account1.email = "thanmai@gmail.com";
        account1.setPassword("XXXXXXX");
        System.out.println(account1.getPassword());
    }
}
