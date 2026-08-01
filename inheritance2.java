class Bank {
    String bankName;
    Bank(String name) {
        bankName = name;
    }
    void interestRate() {
        System.out.println("Interest Rate not specified");
    }
    void display() {
        System.out.println("Bank : " + bankName);
    }
}

// SBI
class SBI extends Bank {
    SBI() {
        super("SBI");
    }
    @Override
    void interestRate() {
        System.out.println("Interest Rate : 6.5%");
    }
}

// HDFC
class HDFC extends Bank {
    HDFC() {
        super("HDFC");
    }
    @Override
    void interestRate() {
        System.out.println("Interest Rate : 7%");
    }
}

// ICICI
class ICICI extends Bank {
    ICICI() {
        super("ICICI");
    }
    @Override
    void interestRate() {
        System.out.println("Interest Rate : 7.5%");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        b1.display();
        b1.interestRate();

        System.out.println();

        b2.display();
        b2.interestRate();

        System.out.println();

        b3.display();
        b3.interestRate();
    }
}
