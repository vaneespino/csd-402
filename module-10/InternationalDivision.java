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