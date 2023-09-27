package java_package;

public class ThisKeyword3 {

	int rollno;
	String name, course;
	float fees;

	ThisKeyword3(int rollno, String name, String course) {

		rollno = rollno;
		name = name;
		course = course;

	}

	ThisKeyword3(int rollno, String name, String course, float fees) {
		this(rollno, name, course);
		fees = fees;
	}

	void display() {
		System.out.println(rollno + name + course + fees);

	}

	public static void main(String[] args) {

		ThisKeyword3 ts3 = new ThisKeyword3(21, "Pramod", "Java", 25000);
		ThisKeyword3 ts4 = new ThisKeyword3(22, "Pram", "python", 26000);

		ts3.display();
		ts4.display();
	}

}
