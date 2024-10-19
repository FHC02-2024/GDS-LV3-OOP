package konto;

public class DemoApp {

    public static void main(String[] args) {

        System.out.println("konto.Konto.getAnzahlKonto() = " + Konto.getAnzahlKonto());
        
        Konto k = new Konto("Susi Sorglos");
        //k.setInhaber();

        System.out.println("konto.Konto.getAnzahlKonto() = " + Konto.getAnzahlKonto());

        k.abbuchen(1000);
        k.print();
        k.aufbuchen(1200);
        k.print();
        k.abbuchen(300);
        k.print();
        k.abbuchen(1000);
        k.print();

        Konto k1 = new Konto("Max Mustermann");
        k1.aufbuchen(3000);
        k1.print();
        k1.abbuchen(200);
        k1.print();

        System.out.println("konto.Konto.getAnzahlKonto() = " + Konto.getAnzahlKonto());
        System.out.println("k.getAnzahlKonto() = " + k.getAnzahlKonto());
        System.out.println("k2.getAnzahlKonto() = " + k1.getAnzahlKonto());
    }
}
