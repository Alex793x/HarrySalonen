import java.util.ArrayList;

public class Calendar {

    private static final ArrayList<Dates> calendar = new ArrayList<>();

    public void makeCalendar() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 31; j++)
                for (int x = 1000; x < 1800; x += 100) {
                    calendar.add(new Dates(j, i, x));
                }
            System.out.println();
        }
    }

    /*    --------- CHECK --------     (Har vi overhovedet brug for denne metode?)

    public void printCalendar() {
        for (int i = 0; i < calendar.size(); i++)
            System.out.println(calendar.get(i));
    }

     */

    public static int scanDate() {
        System.out.println("Hvilken dato");
        return TestHarrySalon.in.nextInt();
    }

    public static int scanMonth() {
        System.out.println("Hvilken måned?");
        return TestHarrySalon.in.nextInt();
    }

    public static void printRequestedCalendarDates() {
        int arrayPositionForRequestedDates = (scanMonth() * 31 * 8) - (31 * 8) + (scanDate() * 8) - 8;
        for (int i = arrayPositionForRequestedDates;
             i < arrayPositionForRequestedDates + 40; i++) {
            System.out.println(calendar.get(i));
        }
    }
    public ArrayList<Dates> getCalendar() {
        return calendar;
    }
}
