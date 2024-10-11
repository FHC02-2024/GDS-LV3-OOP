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

    public int getNenner() {
        return nenner;
    }

    public int getZaehler() {
        return zaehler;
    }
}
