import java.util.Scanner;

abstract class Emp{
    int id, age;
    String name, desig;
    double salary;

    Emp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter age: ");
        age = sc.nextInt();
    }

    void display(){
        System.out.println("Your ID: " + id);
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Designation: " + desig);
        System.out.println("Your salary: " + salary);
    }

    abstract double raiseSalary();
    
}

class Dev extends Emp{
    
    Dev(){
        salary = 60000;
        desig = "Developer";
    }

    double raiseSalary(){
        return salary = salary + 0.1 * salary;
    }

    
}

class Clerk extends Emp{
    

    Clerk(){
        salary = 20000;
        desig = "Clerk";
    }

    double raiseSalary(){
        return salary = salary + 0.1 * salary;
    }
      

    // void display(){
    //     System.out.println("Your ID" + id);
    //     System.out.println("Your name: " + name);
    //     System.out.println("Your age: " + age);
    //     System.out.println("Designation: " + desig);
    //     System.out.println("Your salary: " + salary);
    // }
}

class Tester extends Emp{
    

    Tester(){
        salary = 60000;
        desig = "Tester";
    }
    
    double raiseSalary(){
        return salary = salary + 0.1 * salary;
    }
    // void display(){
    //     System.out.println("Your ID" + id);
    //     System.out.println("Your name: " + name);
    //     System.out.println("Your age: " + age);
    //     System.out.println("Designation: " + desig);
    //     System.out.println("Your salary: " + salary);
    // }
}

class Manager extends Emp{
    

    Manager(){
        salary = 60000;
        desig = "Manager";
    }

    double raiseSalary(){
        return salary = salary + 0.1 * salary;
    }

    // void display(){
    //     System.out.println("Your ID" + id);
    //     System.out.println("Your name: " + name);
    //     System.out.println("Your age: " + age);
    //     System.out.println("Designation: " + desig);
    //     System.out.println("Your salary: " + salary);
    // }
}




public class Demo31 {
    public static void main(String[] args) {
        int ch1=0, ch2=0;
		Tester t=null;
        Dev d = null;

        do{
            System.out.println("1) Create");
			System.out.println("2) Display");
			System.out.println("3) Raise Salary");
			System.out.println("4) Exit");

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the choice :");
			ch1= sc.nextInt();
		
			if(ch1==1){
                do{
                    System.out.println("1. Developer \n2. Clerk \n3. Tester \n4. Manager \n5. Exit");
                    System.out.println("Enter your choice: ");
                    ch2 = sc.nextInt();
        
                    if(ch2 == 1){
                        d = new Dev();
                    }
        
                    if (ch2 == 2) {
                        Clerk c = new Clerk();
                    }
        
                    if (ch2 == 3) {
                        t = new Tester();
                    }
        
                    if (ch2 == 4) {
                        Manager m = new Manager();
                    }
        
                    if(ch2 == 5){
                        System.out.println("Thank you");
                    }
                }while (ch1==5);
            }

            if(ch1==2)
			{
                if(t!= null){
                    t.display();
                }
                if(d != null){
                    d.display();
                }
							
			}
			if(ch1==3)
			{
                if(t!=null){
                    System.out.println("Raise in Salary: " + t.raiseSalary());
                }

                if(d!=null){
                    System.out.println("Raise in Salary: " + d.raiseSalary());

                }
					
			}
			if(ch1==4)
			{
				System.out.println("Thank You");
				System.exit(0);
			}
        }while(ch1 != 4);
        
        
    }
    
}
