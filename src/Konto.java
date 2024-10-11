public class Konto {
    private String inhaber;
    private double kontostand;

    public void print() {
        System.out.println("inhaber = " + inhaber);
        System.out.println("kontostand = " + kontostand);
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public void aufbuchen(double wert) {
        kontostand += wert;
    }

    public void abbuchen(double wert) {
        if (kontostand - wert < 0) {
            System.out.println("Zu wenig Geld am Konto: " + kontostand);
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
