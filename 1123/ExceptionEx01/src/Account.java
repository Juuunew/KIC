
public class Account {
	private long balance;
	
	public Account() {
		
	}

	public long getBalance() {
		return balance;
	}

	public void deposit( int money ) {
		balance += money;
	}
	
	public void withdraw( int money ) throws BalancesufficientException {
		if( balance < money ) {
			throw new BalancesufficientException( "잔고부족" );
		}
		balance -= money;
	}
	
}
