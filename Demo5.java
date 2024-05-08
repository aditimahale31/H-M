class P{
    int a = 1000;
}

class C extends P{
    int a = 10;
    void display(int a){
        System.out.println("Parametric a: " + a);
        System.out.println("This a: " + this.a);
        System.out.println("Super a: " + super.a);
    }
}


public class Demo5 {
   public static void main(String[] args) {
    C c = new C();
    c.display(20);
   }
}
