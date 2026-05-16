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
