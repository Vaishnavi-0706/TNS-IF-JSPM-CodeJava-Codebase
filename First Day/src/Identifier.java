
public class Identifier {
   public static void main(String Args[]) {
	   //Variable declaration - Invalid Identifier
	   //int for=12;
	   
	   //Valid Identifier
	   int $num=12;
	   System.out.println("Value of the number variable: "+$num);
	   String StudentName="Vaishnavi";
	   System.out.println("Value of name is: "+StudentName);
	   
	   int value1=9/2;
	   System.out.println("Value1: "+value1);
	   
	   float value2=101f/3f;
	   System.out.println("Value2: "+value2);
	   
	   double value3=101d/3d;
	   System.out.println("Value3: "+value3);
	   
	   int radius=10;
	   //assigning expression to variable
	   double area=3.14*radius*radius;
	   System.out.println("Area of Circle: "+area);
	   
	   //assigning single character literal
	   char ch='a';
	   System.out.println(ch);
	   
	   //assigning num to char
	   char ch1=65;
	   System.out.println(ch1);
	   
	   int a='A';
	   System.out.println("a: "+a);
	   
	   //PRIMATIVE DATA TYPE
	   
	   //bytes takes 1 byte
	   byte byteMax=126;
	   byte byteMin=-128;
	   System.out.println("Max range of byte is: "+byteMax);
	   System.out.println("Min range of byte is: "+byteMin);
	   
	   //short 2 byte
	   short shortMax=32767;
	   short shortMin=-32768;
	   System.out.println("Max range of range is: "+shortMax);
	   System.out.println("Min range of range is: "+shortMin);
	   
	   int intMax=2147483647;
	   int intMin=-2147483648;
	   System.out.println("Max range of int is: "+intMax);
	   System.out.println("Min range of int is: "+intMin);
	   
	   long longMax=9223372036854775807L;
	   long longMin=-9223372036854775808L;
	   System.out.println("Max range of long is: "+longMax);
	   System.out.println("Min range of long is: "+longMin);
			   
   }
}
