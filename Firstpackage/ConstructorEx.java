package Firstpackage;
class Student1{
	int eno;
	String name;
	//No return even void-->not static
   Student1(){
		eno=1;
		name="Priya";
		System.out.println("Default Constructor");
		System.out.println("Eno : "+eno+ "  NAme : "+name);
	}
	Student1(int eno,String nm){
		this.eno=eno;
		name=nm;
		System.out.println("Parameterized Constructor");
		System.out.println("Eno : "+this.eno+ "  NAme : "+name);
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		System.out.println("********************");

	}

}