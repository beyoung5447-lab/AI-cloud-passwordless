package ex3.bank;

public class Account {
    private long balance; 

    public Account() {}

    public long getBalance() {
        return balance;
    }
    

    public void withdraw(int money) {
        if (balance < money) { 
            System.out.println("잔고 부족:" + (money - balance) + "부족함");
        
        }
        balance -=money;
    }

	public void deposit(int i) {
		// TODO Auto-generated method stub
		
	}
}