package accessspecifiers;

public class animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Animal{
			String type;
			public Animal() {
				System.out.println("Parent Default constructor");
			}
			public Animal(String type) {
				this.type=type;
				System.out.println(this.type);
			}
		}
		class Tiger extends Animal{
			String color;
			public Tiger() {
				super();//super call parent class default constructor
				System.out.println("Child Default constructor");
			}
			public Tiger(String type,String color) {
				super(type);
				this.color=color;
				System.out.println(this.color);
				
			}
		}
		public class animal {
			public static void main(String[] args) {
				//Tiger t=new Tiger();
				Tiger t1=new Tiger("Wild","ORange");
			}

		}
	}

}
