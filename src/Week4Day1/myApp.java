package Week4Day1;

public class myApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee e1 = new Employee("Tommy", "Thurman", "Java Developer");

		Manager m1 = new Manager("Tommy", "Thurman", "Java Developer", 10);

		e1.printName();
		m1.printName();
		// the printName didn't have the Title in there

		Person p1 = new Person("Anna", "Farr");
		p1.printName();
		
	}

}
