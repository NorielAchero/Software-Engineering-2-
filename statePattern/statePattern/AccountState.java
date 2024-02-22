package statePattern;

public interface AccountState {
    public void activeState(Account account);
    public void suspendedState(Account account);
    public void closedState(Account account);
    public void deposit(Double depositAmount);
    public void withdraw(Double withdrawAmount);
    public void suspend();
    public void activate();
    public void close();
}