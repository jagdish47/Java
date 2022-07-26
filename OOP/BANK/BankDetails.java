package OOP.BANK;

public class BankDetails {
    String name;
    String nickName;
    static int numOfAccounts;
    private int accountNumber;
    String ifsc;
    static final String BANK_NAME = "SBI";
    private double balance;

    public BankDetails(String name, String ifsc) {
        this.balance = 0.0;
        this.name = name;
        this.ifsc = ifsc;

        numOfAccounts++;
        accountNumber = numOfAccounts;
    }

    // nickName is optional so we keep it in different constructor

    public BankDetails(String name, String ifsc, String nickName) {
        this.balance = 0.0;

        this.name = name;
        this.ifsc = ifsc;
        this.nickName = nickName;

        numOfAccounts++;
        accountNumber = numOfAccounts;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double totalBalance() {
        return this.balance;
    }

    public void addMoney(int submitAmount) {
        this.balance = this.balance + submitAmount;

    }

    public void withdrawMoney(int withdrawMoney){
        this.balance = this.balance - withdrawMoney;
    }
}
