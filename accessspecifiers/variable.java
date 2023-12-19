package accessspecifiers;

public class variable {
	public String registerStudent(Student student)
	{
		if(!student.name.matches(".*[A-Z].*"))
		{
			return "Block letter needed";
		}
		if(student.score<0 || student.score>=100)
		{
			return "invalid Score";
		}
		return "Registered";
	}
	public String studentCard(String card)
	{
		if(card.matches("\\d+")){
			return "valid card";
		}
		else
		{
			return "invalid card";
		}
	}

}
public class StudentReport {
public static void main(String[] args) {
Student s=new Student("S", 60);
Classroom c=new Classroom();
System.out.println(c.registerStudent(s));
System.out.println(c.studentCard("abc"));
}
