package aggregation;

public class Employee {
	
	int empID;
	String empName;
	Address address;
	
	public Employee(int empID, String empName, Address address) {
		this.empID = empID;
		this.empName = empName;
		this.address = address;
	}
	
	public void display() {
		System.out.println(empID + " " + empName + " " + address.cityName + " " + address.state );
	}
	
	
	public static void main(String[] args) {
		Address address1 = new Address("Kurnool", "AndhraPradesh");
		Address address2 = new Address("Banglore", "Karnataka");
		
		Employee e1 = new Employee(101, "Lalitha", address1);
		Employee e2 = new Employee(102, "Praveen", address2);
		
		e1.display();
		e2.display();


	}

}
