public class BankAccount {
    //attributes
    private final int accountId;
    private final String accountName;
    private final int accountNumber;
    private double balance;

    //constructor
    public BankAccount(int accountId, String accountName, int accountNumber, double balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = Math.max(balance, 50); //The balance is at least 50.000 VND at init
    }

    //getters
    public int getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //setters
    public void setBalance(double amount){
        this.balance = amount;
    }

    /**
     * deposit some positive amount into the account
     * @param amount - an amount to be deposited
     */
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Successfully deposit " + amount +" VND to your account");
        }else{
            System.out.println("Deposit amount must be positive");
        }
    }


    public void helloWorld(){
        System.out.println("Hello world from bankAccount");
    }
}
