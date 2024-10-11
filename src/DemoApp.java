public class DemoApp {

    public static void main(String[] args) {

        Konto k = new Konto();
        k.setInhaber("Susi Sorglos");

        k.abbuchen(1000);
        k.print();
        k.aufbuchen(1200);
        k.print();
        k.abbuchen(300);
        k.print();
        k.abbuchen(1000);
        k.print();

    }
}
