
public class Type_Casting {

	public static void main(String[] args) {
		// Implicit type casting  
		byte b=10;
		int l=b;
		System.out.println(l);
		
		float f=22.14f;
		double d=f;
		System.out.println("Double:"+ d);
		
		char ch='A';
		int i=ch;
		System.out.println(i);
		
		//NARROWING  //EXPLILCIT TYPE CASTING
		double f1=10.52f;
		long l1=(long) f1;
		System.out.println(l1);
		
		int i2=156;
		byte b1= (byte) i2;
		System.out.println(b1);
	}

}
