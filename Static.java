class A{
    static int x = 1000;
    static void display(){
        System.out.println("Hello world!");
    }
}

public class Static {
    public static void main(String[] args) {
        System.out.println(A.x);
        A.display(); //if you use static keyword you dont need to create an object to call the methods or variables so no memory is wasted
    }
}
