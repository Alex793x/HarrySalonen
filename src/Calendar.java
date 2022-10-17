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
    public static void setDate() {
        date = scanDate();
    }

    public static void setMonth() {
        month = scanMonth();
    }

    public void makeCalendar() {
        for (CalenderMonthDefiner months : CalenderMonthDefiner.values()) {
            for (int j = 1; j <= months.getCalenderMonthDefiner(); j++) {
                for (int x = 1000; x < 1800; x += 100) {
                    calendar.add(new Dates(j, months, x));
                }
            }
        }
    }

    public static int scanDate() {
        System.out.println("VÆLG DAG:");
        for (CalenderMonthDefiner months : CalenderMonthDefiner.values()) {
            if (month == months.monthDay) {
                System.out.printf("VÆLG MELLEM 1 - %d%n", months.getCalenderMonthDefiner());
            }
        }
        return TestHarrySalon.in.nextInt();
    }

    public static int scanMonth() {
        System.out.println("VÆLG MÅNED:");
        int count = 1;
        for (CalenderMonthDefiner month : CalenderMonthDefiner.values()) {
            System.out.println(month.getMonthName() + " - " + count++);
        }

        return TestHarrySalon.in.nextInt();
    }

    public static int getMonthDays(int month) {
        for (CalenderMonthDefiner months : CalenderMonthDefiner.values()) {
            if (month == months.monthDay) {
                System.out.println(months.monthValue);
                return months.monthValue;
            }
        }
        return 0;
    }

    public static int getDiffDays(int month) {

        return switch (month) {
            case 1 -> 0;
            case 2 -> -3;
            case 3 -> 3;
            case 4 -> 0;
            case 5 -> 4;
            case 6 -> -1;
            case 7 -> 5;
            case 8 -> 5;
            case 9 -> -3;
            case 10 -> 6;
            case 11 -> -4;
            case 12 -> 7;
            default -> 0;
        };
    }

    public static void printRequestedCalendarDates() {
        Calendar.setMonth();
        Calendar.setDate();
        int arrayPositionForRequestedDates = findCalendarArrayPosition();
        for (int i = arrayPositionForRequestedDates;
             i < arrayPositionForRequestedDates + 40; i++) {
            System.out.println(calendar.get(i));
        }
    }

    public static void printRequestDay() {
        Calendar.setMonth();
        Calendar.setDate();
        int arrayPositionForRequestedDates = findCalendarArrayPosition();
        for (int i = arrayPositionForRequestedDates; i < arrayPositionForRequestedDates + 8; i++) {
            System.out.println(calendar.get(i));
        }
    }

    public static int findCalendarArrayPosition() {
        return (getMonth() * getMonthDays(getMonth()) * 8) - (getDiffDays(getMonth()) * 8) -
                (getMonthDays((getMonth())) * 8) + (getDate() * 8) - 8;
    }

    public ArrayList<Dates> getCalendar() {
        return calendar;
    }
}