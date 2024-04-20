public class CreditCard {
    private final String accountNumber;
    private int amount;

    public CreditCard(String accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String toString() {
        return "Account: " + accountNumber + ", amount: " + amount;
    }

    public void withdrawMoney(int sum) {
        this.amount -= sum;
    }

    public void putMoney(int sum) {
        this.amount += sum;
    }
}
