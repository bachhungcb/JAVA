
public class Main {
    public static void main (String[] args){
        //open normal account
        NormalAccount acc1 = new NormalAccount( 1,
                                                "bach",
                                                123,
                                                1000000);

        System.out.println("Current Balance: "+ acc1.getBalance() +" VND");//get balance

        acc1.deposit(2000000);
        System.out.println("Current Balance: "+acc1.getBalance() +" VND");//get balance

        acc1.withDraw(5000000);
        System.out.println("Current Balance: "+acc1.getBalance() +" VND");//get balance

        SavingAccount acc2 = new SavingAccount( 1,
                                                "bach",
                                                123,
                                                500000);

        acc2.interstCalculation();
    }
}