public class SavingsAccount {
    String bankName; //coast state bank
    String accNumber; // 12 digit
    String accHolderName;
    double accBalance;
    boolean accStatus= true;

    //double getAccBalance;

    public SavingsAccount(){
        String bankName="Coast State Bank";
        String accNumber="31323435";
        String accHolderName="John doe";
        double accBalance=5000;
        boolean accStatus=true; // active
    }
    public SavingsAccount(String bankName,String accNumber,String accHolderName,double accBalance,boolean accStatus){
        this.bankName=bankName;
        this.accNumber=accNumber;
        this.accHolderName=accHolderName;
        this.accBalance=accBalance;
        this.accStatus=accStatus; // active
    }
    public void accountDetails(){
        System.out.println("Bank name :"+bankName);
        System.out.println("Account Number :"+accNumber);
        System.out.println("Account holder name :"+accHolderName);
        System.out.println("Account balance :"+accBalance);
        System.out.println("Account status :"+(accStatus?"Active":"inactive"));
    }

    public void debit(double amount){
        accBalance=5000;
        if(accBalance>amount){
            double debitAccBalance=accBalance-amount;
            System.out.println("Debited "+amount);
            System.out.println("Now your balance is "+debitAccBalance);
        }
        else{
            System.out.println("Not Enough account balance to withdraw");
        }
    }

    /*public double getAccBalance(){
        System.out.println("Account balance is :"+accBalance);
        return accBalance;
    }*/

    public void credit(double amount){
        accBalance=5000;
        if(accStatus){
            double totalBalance=accBalance+amount;
            System.out.println("credited amount "+amount);
            System.out.println("Now your balance is "+totalBalance);
        }
        else{
            System.out.println("Account inactive");

        }
    }

}
