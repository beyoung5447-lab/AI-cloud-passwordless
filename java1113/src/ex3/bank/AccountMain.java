package ex3.bank;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		long mybalance = account.getBalance();
		System.out.println("예금액 확인:" + mybalance);
		try {
			account.withdraw(300000000);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
		account.withdraw(300000);
		mybalance = account.getBalance();
		System.out.println("예금액 확인:" + mybalance);
	}
}
