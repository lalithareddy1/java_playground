package assignments;

public class Student {
	
	int maths;
	int physics;
	int chemistry;
	int english = 85;
	
	public Student(int maths, int physics, int chemistry) {
		// TODO Auto-generated constructor stub
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		//this.english = english;
	}


	public int display_sum() {

		int sum = maths + physics + chemistry + english;
		return sum;
	}

	public void display_average() {
		int sum = display_sum();
		int average = sum / 3;
		System.out.println("Sum of all Subjects are :" + sum);
		System.out.println("Average of all subjects are :" + average);
	}

	public static void main(String[] args) {

		Student s = new Student(90, 75, 80);
		
		s.display_sum();
		s.display_average();

	}

}
