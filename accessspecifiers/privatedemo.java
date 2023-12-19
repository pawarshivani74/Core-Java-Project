 package accessspecifiers;
class PrivateDemo{
	private int a=11;
	String name = "Preetha Selvan";
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	void displayA() {
		System.out.println("A: "+a);
	}
}

public class privatedemo {

	public static void main(String[] args) {
		PrivateDemo demo = new PrivateDemo();
		System.out.println(demo.name);
		demo.displayA();
		demo.setNum(16);
		System.out.println("Get Number: "+demo.getNum());
	}

}