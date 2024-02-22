package statePattern;
public class SuspendedState implements AccountState{
    
        private Account account;

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
            System.out.println("Suspended Accounts Cannot Deposit");
            account.toString();
        }
    
        public void withdraw(Double withdrawAmount){
            System.out.println("Suspended Accounts Cannot Withdraw");
            account.toString();
        }
    
        public void suspend(){
            System.out.println("Account is already suspended");
        }
    
        public void activate(){
            account.setState(new ActiveState());
            System.out.println("Account is Activated!");
        }
    
        public void close(){
            account.setState(new ClosedState());
            System.out.println("Account is Closed!");
        }
 }
