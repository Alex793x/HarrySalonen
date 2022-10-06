import java.util.ArrayList;

public class Calendar {
    private static final ArrayList<Dates> calendar = new ArrayList<>();
    private static int date;
    private static int month;

    // GETTER --------------------------

    public static int getDate() {
        return date;
    }

    public static int getMonth() {
        return month;
    }

    // SETTER --------------------------
    public static void setDate(){
        date = scanDate();
    }

    public static void setMonth() {
        month = scanMonth();
    }

    public void makeCalendar() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 31; j++)
                for (int x = 1000; x < 1800; x += 100) {
                    calendar.add(new Dates(j, i, x));
                }
        }
    }

    public static int scanDate() {
        System.out.println("Hvilken dato");
        return TestHarrySalon.in.nextInt();
    }

    public static int scanMonth() {
        System.out.println("Hvilken måned?");
        return TestHarrySalon.in.nextInt();
    }

    public static void printRequestedCalendarDates() {
        Calendar.setMonth();
        Calendar.setDate();
        int arrayPositionForRequestedDates = (getMonth() * 31 * 8) - (31 * 8) + (getDate() * 8) - 8;
        for (int i = arrayPositionForRequestedDates;
             i < arrayPositionForRequestedDates + 40; i++) {
            System.out.println(calendar.get(i));
        }
    }

    public static void printRequestDay() {
        Calendar.setMonth();
        Calendar.setDate();
        int arrayPositionForRequestedDates = (getMonth() * 31 * 8) - (31 * 8) + (getDate() * 8) - 8;
        for (int i = arrayPositionForRequestedDates; i < arrayPositionForRequestedDates + 8; i++) {
            System.out.println(calendar.get(i));
        }
    }

    public ArrayList<Dates> getCalendar() {
        return calendar;
    }
}