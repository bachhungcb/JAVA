public class NormalAccount extends BankAccount {
    //attributes
    private final double withDrawFee;

    //constructor
    public NormalAccount (int _accountId, String _accountName, int _accountNumber, double _balance){
        super(_accountId, _accountName, _accountNumber, _balance);

        //attributes
       this.withDrawFee = 5000;
    }

    /**
     * withdraw a positive amount from the account
     * @param amount - the amount to be withdrawn
     */
    public void withDraw(double amount){
        double balance = getBalance();
        if (amount > balance){ //because balance is private so we need to use getBalance() here
            //if the amount the user wants to withDraw is bigger than their balance, abort the
            // action and notifies them
            System.out.println("Withdraw amount must be less than account's balance");
        }else{
            double withDrawAmount = amount + withDrawFee; // since every withdraw has a fee of 5000 VND

            setBalance(getBalance() - withDrawAmount); //doing the withdrawal transaction

            System.out.println("Withdraw " + amount +" VND successfully with a fee of 5.000 VND");
        }
    }

    public void HelloWorldFromNormalAccount(){
        System.out.println("HelloWorldFromNormalAccount");
    }
}
