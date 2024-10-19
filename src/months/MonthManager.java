package months;

public class MonthManager {
    private int month;

    public MonthManager(int month){
        setMonth(month);
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        /*if (month == 1) {
            return "Jänner";
        } else if (month == 2) {
            return "Februar";
        } else if (month == 3) {
            return "März";
        } else if (month == 4) {
            return "April";
        } else if (month == 5) {
            return "Mai";
        }*/

        switch (month) {
            case 1: return "Jänner";
            case 2: return "Februar";
            case 3: return "März";
            case 4: return "April";
            case 5: return "Mai";
            case 6: return "Juni";
            case 7: return "Juli";
            case 8: return "August";
            case 9: return "September";
            case 10: return "Oktober";
            case 11: return "November";
            case 12: return "Dezember";
            default: return "Falsches Monat";
        }
    }

    public String getSeason() {
        switch (month) {
            case 1, 2:
                return "Winter";
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5: return "Frühling";
            case 6:
            case 7:
            case 8: return "Sommer";
            case 9:
            case 10:
            case 11: return "Herbst";
            case 12: return "Winter";
            default: return "Falsches Monat";

        }
        //return "";
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
        else {
            System.out.println("Falsches Monat: " + month);
        }
    }
}
