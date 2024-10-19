package konto;

public class Konto {
    private String inhaber;
    private final int nummer;
    private double kontostand;

    private static int anzahlKonto;

    public Konto (String inhaber) {
        this.inhaber = inhaber;
        anzahlKonto++;
        this.nummer = anzahlKonto;
    }

    public static int getAnzahlKonto(){
        return anzahlKonto;
    }

    public void print() {
        System.out.println("nummer = " + nummer);
        System.out.println("inhaber = " + inhaber);
        System.out.println("kontostand = " + kontostand);
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
        kontostand = 0;
    }

    public void aufbuchen(double wert) {
        kontostand += wert;
    }

    public void abbuchen(double wert) {
        if (kontostand - wert < 0) {
            System.out.println("Zu wenig Geld am konto.Konto: " + kontostand);
        }
        else {
            //kontostand = kontostand - wert;
            kontostand -= wert;
        }
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getInhaber() {
        return inhaber;
    }
}
