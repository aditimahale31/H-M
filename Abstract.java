abstract class Bank{
    abstract void ATM();
    abstract void KYC();
}

class SBI extends Bank{
    void ATM(){
        System.out.println("50000");
    }

    void KYC(){
        System.out.println("KYC");
    }
}

class Axis extends Bank{
    void ATM(){
        System.out.println("35000");
    }

    void KYC(){
        System.out.println("KYC");
    }
}


public class Abstract {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.ATM();
        s.KYC();

        Axis a = new Axis();
        a.ATM();
        a.KYC();
    }
}
