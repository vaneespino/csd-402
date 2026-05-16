

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


//InternationalDivision.java *

public class InternationalDivision extends Division {
	private String country;
	private String language;

	
	public InternationalDivision(String name, int account, String country, String language) {
		super(name, account);
		this.country = country;
		this.language = language;
}

	@Override
	public void display() {
		System.out.println("International Division: " + divisionName + "Account #" + accountNumber);
		System.out.println("Location: " + country + ", Language: " + language + "\n");
	}
}


//DomesticDivision class

public class DomesticDivision extends Division {
	private String state;

	public DomesticDivision(String name, int account, String state) {
		super(name, account);
		this.state = state;
}

@Override
public void display() {
	System.out.println("Domestic Division: " + divisionName + " Account #" + accountNumber);
	System.out.println("State: " + state + "\n");

	}
}


//UseDivision.java

public class UseDivision {
	public static void main(String [] args) {
		InternationalDivision intDiv1 = new InternationalDivision("Samsung", 2001, "South Korea", "Korean");
		InternationalDivision intDiv2 = new InternationalDivision("Toyota", 2002, "Japan", "Japanese");


		DomesticDivision domDiv1 = new DomesticDivision("Target", 55403, "Minnesota");
		DomesticDivision domDiv2 = new DomesticDivision("Walmart", 72712, "Arkansas");


		intDiv1.display();
		intDiv2.display();
		domDiv1.display();
		domDiv2.display();
	}
}