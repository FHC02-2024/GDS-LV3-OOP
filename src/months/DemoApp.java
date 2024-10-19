package months;

public class DemoApp {
    public static void main(String[] args) {
        
        MonthManager mm = new MonthManager(3);

        System.out.println("mm.getMonth() = " + mm.getMonth());

        System.out.println("mm.getName() = " + mm.getName());

        System.out.println("mm.getSeason() = " + mm.getSeason());
        
    }
}
