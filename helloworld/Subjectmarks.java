package helloworld;

class Student {
	// static variable
	public static double fees;
	public static String name = "Aanh";
}

public class Subjectmarks {
	public static void main(String[] args) {
		Student.fees = 9999999.99;
		System.out.println(Student.name + "'s annual fees : " + Student.fees);
	}
}
