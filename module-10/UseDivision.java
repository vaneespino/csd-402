
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