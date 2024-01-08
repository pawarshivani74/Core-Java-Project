package helloworld;

public class  Hello_World  {

	public void StudentAge()
	{
	// Local variable 
	int age = 0;
	age = age + 30;
	System.out.println("Student age is : " + age);
	}
	public static void main(String[] args) {
	//Local Variable
	Hello_World temp = new Hello_World();
	temp.StudentAge();

	}

}
