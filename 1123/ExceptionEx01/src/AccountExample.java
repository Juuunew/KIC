
public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		try {
			account.withdraw( 3000 );
		} catch (BalancesufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
