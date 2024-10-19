package bruch;

public class BruchDemoApp {

    public static void main(String[] args) {


        Bruch b1 = new Bruch(1, 2);
        Bruch b2 = new Bruch(3, 4);

        System.out.println("b1.toDecimal() = " + b1.toDecimal());
        b2.print();

        Bruch b3 = b1.multiplicate(b2);
        b3.print();

        Bruch b4 = b1.multiplicate(b2, b3);
        b4.print();

    }
}
