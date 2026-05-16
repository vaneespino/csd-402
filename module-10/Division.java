//Division class 
public abstract class Division {
	protected String divisionName;
	protected int accountNumber;


public Division(String name, int account) {
	divisionName = name;
	accountNumber = account;
}


	public abstract void display();
}