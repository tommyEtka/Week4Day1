package Week4Day1;

public class Manager extends Employee {

	public Manager(String firstName, String lastName, String Title,
			int directReports) {
		super(firstName, lastName, Title);
		setDirectReports(directReports);

	}

	private int directReports;

	public int getDirectReports() {
		return directReports;
	}

	public void setDirectReports(int directReports) {
		this.directReports = directReports;
	}

	@Override
	public void printName() {
		// this is OVERRIDE

		System.out.println(getLastName() + ", " + getFirstName() + " : "
				+ getTitle() + " " + directReports);
		// can't do lastName and firstName because they are private in Person
		// class

	}

}
