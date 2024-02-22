package statePattern;

public class ClosedState implements AccountState{
    
    private  Account account;

    public void activeState(Account account){
        account.setState(new ActiveState());
    }

    public void suspendedState(Account account){
        account.setState(new SuspendedState());
    }

    public void closedState(Account account){
        account.setState(new ClosedState());
    }


    public void deposit(Double depositAmount){
        System.out.println("You cannot deposit on a closed account!");
        account.toString();

    }

    public void withdraw(Double withdrawAmount){
        System.out.println("You cannot withdraw on a closed account!");
        account.toString();
    }

    public void suspend(){
        System.out.println("Cannot Suspended Closed Account");
    }

    public void activate(){
        account.setState(new ActiveState());
        System.out.println("Account is Activated!");
    }

    public void close(){
        account.setState(new ClosedState());
        System.out.println("Account is already Closed!");
    }
}
