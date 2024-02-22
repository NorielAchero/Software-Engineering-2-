package statePattern;
public class ActiveState implements AccountState{

    private Account account;

    public void deposit(Double depositAmount){
        
        account.balance = account.balance + depositAmount;
        System.out.println("Account Deposited");
        account.toString();
    }


    public void withdraw(Double withdrawAmount){
        account.balance = account.getBalance() - withdrawAmount;
        System.out.println("Account Withdraw");
        account.toString();
    }


    public void suspend(){
        System.out.println("Account is suspended!");
        account.setState(new SuspendedState());
        
    }

 
    public void activate(){
        System.out.println("Account is already Activated");
    }

   
    public void close(){
        account.setState(new ClosedState());
        System.out.println("Account is Closed!");
    }
}