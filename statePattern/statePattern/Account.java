package statePattern;

public class Account{
    String accountNumber = "";
    double balance;
    private AccountState accountState;


    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();

    }

    public AccountState getState(){
        return accountState;
    }

    public void setState(AccountState accountState){
        this.accountState = accountState;
    }

    public void deposit(Double depositAmount){
        accountState.deposit(depositAmount);
    }
    public void withdraw(Double withdrawAmount){
        accountState.withdraw(withdrawAmount);
    }
    public void suspend(){
        accountState.suspend();
   
    }
    public void activate(){
        accountState.activate();

    }
    public void close(){
        accountState.close();
    }
    public String toString(){
        System.out.println("Account Number: " + accountNumber + " \nBalance: " + balance);
        return "";
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance  = balance;
    }

    public double getBalance(){
         return balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

}