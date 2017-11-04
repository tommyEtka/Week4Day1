package PersonStudentStaff;

public class personStudentStaff {


	public static void main(String[] args) {
	
		
		Person p1 = new Person("Tommy Thurman", "125 Street");
		
		p1.printPerson();
		
		System.out.println();
		
		Student st = new Student("Carol Lowe","348 Drive"," Math", 20, 2016);
		
		st.printPerson();
		
		System.out.println();
		
		Staff sf = new Staff("Marie Boden", "569 Blvd","Brace", 30000);
		
		sf.printPerson();
		

	}

}
