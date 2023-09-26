package app_ATM;

public class User {
    private String cardNumber = "1234";
    private String password = "123";
    private double balance;

    public User(String cardNumber, String password, double balance) {
        this.cardNumber = cardNumber;
        this.password = password;
        this.balance = balance;
    }

    public User() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return
                "cardNumber='" + cardNumber + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
