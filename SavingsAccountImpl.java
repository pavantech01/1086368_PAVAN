public class SavingsAccountImpl {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("Coast State Bank", "3132333435", "John Doe", 5000, true);
        savingsAccount.accountDetails();
        //double accBalance=savingsAccount.getAccBalance();


        SavingsAccount savingsAccount1 = new SavingsAccount();
        savingsAccount1.debit(1000);

        SavingsAccount savingsAccount2 = new SavingsAccount();
        savingsAccount2.credit(2000);




    }
}