package bruch;

public class Bruch {
    private int nenner;
    private int zaehler;

    public Bruch(int zaehler, int nenner) {
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    public void print() {
        System.out.println(zaehler + " / " + nenner);
    }

    public double toDecimal() {
        return zaehler / (nenner * 1.0);
    }

    public Bruch multiplicate(Bruch b2) {

        int neuNenner = nenner * b2.nenner;
        int neuZaehler = zaehler * b2.zaehler;

       return new Bruch(neuZaehler, neuNenner);
    }

    public Bruch multiplicate(Bruch b2, Bruch b3) {
        //bruch.Bruch b = multiplicate(b2);
        //return b.multiplicate(b3);

        return multiplicate(b2).multiplicate(b3);
    }

    public int getNenner() {
        return nenner;
    }

    public int getZaehler() {
        return zaehler;
    }
}
