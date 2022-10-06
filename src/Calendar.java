import java.util.ArrayList;
import java.util.Arrays;

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
        for (CalenderMonthDefiner months : CalenderMonthDefiner.values()) {
            for (int j = 1; j <= 31; j++) {
            for (int x = 1000; x < 1800; x += 100) {
                    calendar.add(new Dates(j, months, x));
                }
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
        int k = 0;
        Calendar.setMonth();
        Calendar.setDate();
        int arrayPositionForRequestedDates = (getMonth() * 31 * 8) - (31 * 8) + (getDate() * 8) - 8;
        for (int i = arrayPositionForRequestedDates + 1, m = arrayPositionForRequestedDates;
             i < arrayPositionForRequestedDates + 40; i+=2) {
             for (int j = 0; j % 2 == 0; j++) {
                 System.out.print(calendar.get(m));
                 System.out.print("\t"+calendar.get(i)+"\n");
                 m+=2;
                 k++;

                 if (k % 4 == 0) {
                     System.out.println("--------------------------------------------------------------------" +
                             "-------------------------------------------------------------------------");
                 }
            }
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

    public void printCalendar() {
        for (int i = 0; i < calendar.size(); i++)
            System.out.println(calendar.get(i));
    }

    public ArrayList<Dates> getCalendar() {
        return calendar;
    }
}