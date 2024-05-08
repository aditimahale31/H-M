
class P{
    int money = 200000;
    String car = "BMW";
    String newCar = "Benz";
    int site = 5;

    void use(){
        System.out.println("Money: " + money);
        System.out.println("Car: " + car);
        System.out.println("New car: " + newCar);
        System.out.println("Site: " + site);
    }
}

class C extends P{
    int money = 10000;
    void use(){
        System.out.println("Child Money: " + money);
        System.out.println("Parent money: " + super.money);
        System.out.println("Inherited car: " + car);
        System.out.println("Inherited site: " + site);
        System.out.println("Parent new car: " + newCar);
    }
}


public class Demo4 {
    public static void main(String[] args) {
        C c = new C();
        c.use();

        System.out.println("------------------------");

        P p = new P();
        p.use();
    }
}