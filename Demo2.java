import java.util.Scanner;

class A{

	int id;
	String name;
	A(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID: ");
		id = sc.nextInt();

		System.out.println("Enter your name: ");
		name = sc.next();
	}

	void display(){
		System.out.println("Your ID: " + id);
                System.out.println("Your name: " + name);
	}
}

public class Demo2{
	public static void main(String args[]){
		A a = new A();
		a.display();
	}
}
                
