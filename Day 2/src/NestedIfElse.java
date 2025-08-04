
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		// FIND GREATEST NUMBER
		
		int a=10, b=12,c=4;
		System.out.println("Greatest number is: ");
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(c>b) {
				System.out.println(c);
			}
			else {
				System.out.println(b);
			}
		}
		
		
		//CHECK USERNAME AND PASSWORD ARE CORRECT FOR LOGIN
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Username for Login: ");
		String username=sc.nextLine();
		System.out.println("Enter your Password for Login: ");
		int password =sc.nextInt();
		
		if(username=="Vaishnavi") {
			if(password==100) {
				System.out.println("Login");
			}
			else {
				System.out.println("Wrong Password");
			}
		}
		else {
			if(password==100) {
				System.out.println("Wrong Username");
			}
			else {
				System.out.println("Wrong Username and Password");
			}
		}

	}

}
