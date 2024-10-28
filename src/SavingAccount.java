public class SavingAccount extends BankAccount{
    private final double interestRate;

    public SavingAccount(int _accountId, String _accountName, int _accountNumber, double _balance){
        super(_accountId, _accountName, _accountNumber, _balance);

        this.interestRate = 0.69; // given interest rate
    }

    public void interstCalculation(){
        double monthyInterest = 0;
        double balance = getBalance();

        monthyInterest = ((balance * interestRate) / 12);
        System.out.println("Your monthly interest is: " + monthyInterest + " VND");
    }


}
