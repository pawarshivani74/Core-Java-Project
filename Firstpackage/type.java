package Firstpackage;

public class type {

	private static byte b1;
	private static short ss;
	private static byte bb1;
	private static float f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=50;
		Short s=100;
		int i=b;
		int ii=s;
		int j=200;
		long l=j;
		//smaller-->bigger---->Implicit(done automatically)-->Widening
		System.out.println(i);
		//bigger-->smaller-->Explicit( U have to do--->Narrowing
		int ii1=30;
		setB1((byte) ii1);
		setSs((short) ii1);
		setBb1((byte) l);
		setF(ii);
	}

	public static float getF() {
		return f;
	}

	public static void setF(float f) {
		type.f = f;
	}

	public static byte getBb1() {
		return bb1;
	}

	public static void setBb1(byte bb1) {
		type.bb1 = bb1;
	}

	public static short getSs() {
		return ss;
	}

	public static void setSs(short ss) {
		type.ss = ss;
	}

	public static byte getB1() {
		return b1;
	}

	public static void setB1(byte b1) {
		type.b1 = b1;
	}

}
