public class Card{
	long id;
	double balance;
	int password;
	public void takeMoney(int money){
		if(this.balance>=money){
			balance -= money;
		}
	}

	public void saveMoney(int money){
		balance += money;
	}

	public void modifyPassword(int newpassword){
		password = newpassword;
	}

	public double getBalance(){
		return balance;
	}

	public Card(){}
	public Card(long id,double balance,int password){
		this.id = id;
		this.balance = balance;
		this.password = password;
	}
}