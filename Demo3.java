import java.util.Scanner;

class Dev{
    int id, age;
    int salary = 60000;
    String name;
    String desig = "Developer";

    Dev(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter age: ");
        age = sc.nextInt();
    }

    void display(){
        System.out.println("Your ID" + id);
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Designation: " + desig);
        System.out.println("Your salary: " + salary);
    }
}

class Clerk{
    int id, age;
    int salary = 20000;
    String name;
    String desig = "Clerk";

    Clerk(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter age: ");
        age = sc.nextInt();
    }

    void display(){
        System.out.println("Your ID" + id);
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Designation: " + desig);
        System.out.println("Your salary: " + salary);
    }
}


public class Demo3 {
    public static void main(String[] args) {
        int ch1 = 0;
        
        do{
            System.out.println("1. Developer \n2. Clerk \n3. Exit");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            ch1 = sc.nextInt();

            if(ch1 == 1){
                Dev d = new Dev();
                d.display();
            }

            if (ch1 == 2) {
                Clerk c = new Clerk();
                c.display();
            }

            if(ch1==3){
                System.out.println("Thank you");
                System.exit(0);
            }
        }while (ch1!=3);
    }
    
}
