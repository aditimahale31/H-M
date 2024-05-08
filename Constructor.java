//Constructor overloading

class A{
    A(){
        System.out.println("Just constructor");
    }

    A(int a){
        System.out.println("Constructor with one parameter");
    }

    A(int a, int b){
        System.out.println("Constructor with multiple same parameters");
    }

    A(String a, int b){
        System.out.println("Constructor with same number of parameters, but different type of parameters");
    }
}


public class Constructor {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A(100);
        A a2 = new A(20, 30);
        A a3 = new A("abc", 1);
    }
}
