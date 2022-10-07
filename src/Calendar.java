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

        if (month==1){
            System.out.println("VÆLG MELLEM 1-31");
        } else if (month==2) {
            System.out.println("VÆLG MELLEM 1-28");
        } else if (month==3) {
            System.out.println("VÆLG MELLEM 1-31");
        } else if (month==4) {
            System.out.println("VÆLG MELLEM 1-30");
        } else if (month==5) {
            System.out.println("VÆLG MELLEM 1-31");
        } else if (month==6) {
            System.out.println("VÆLG MELLEM 1-30");
        } else if (month==7) {
            System.out.println("VÆLG MELLEM 1-31");
        } else if (month==8) {
            System.out.println("VÆLG MELLEM 1-31");
        } else if (month==9) {
            System.out.println("VÆLG MELLEM 1-30");
        } else if (month==10) {
            System.out.println("VÆLG MELLEM 1-31");
        } else if (month==11) {
            System.out.println("VÆLG MELLEM 1-30");
        } else if (month==12) {
            System.out.println("VÆLG MELLEM 1-31");
        }
        return TestHarrySalon.in.nextInt();
    }

    public static int scanMonth() {
        System.out.println("VÆLG MÅNED:");
        System.out.println("""
                (Januar - 1)\s
                (Februar - 2)\s
                (Marts - 3)\s
                (April - 4)\s
                (Maj - 5)\s
                (Juni - 6)\s
                (Juli - 7)\s
                (August - 8)\s
                (September - 9)\s
                (Oktober - 10)\s
                (November - 11)\s
                (December - 12)""");
        return TestHarrySalon.in.nextInt();
    }

    public static int getMonthDays(int month) {
        if (month == 1) {
            return CalenderMonthDefiner.JANUARY.getCalenderMonthDefiner();
        } else if (month == 2) {
            return CalenderMonthDefiner.FEBRUARY.getCalenderMonthDefiner();
        } else if (month == 3) {
            return (CalenderMonthDefiner.MARCH.getCalenderMonthDefiner());
        } else if (month == 4) {
            return CalenderMonthDefiner.APRIL.getCalenderMonthDefiner();
        } else if (month == 5) {
            return CalenderMonthDefiner.MAY.getCalenderMonthDefiner();
        } else if (month == 6) {
            return CalenderMonthDefiner.JUNE.getCalenderMonthDefiner();
        } else if (month == 7) {
            return CalenderMonthDefiner.JULY.getCalenderMonthDefiner();
        } else if (month == 8) {
            return CalenderMonthDefiner.AUGUST.getCalenderMonthDefiner();
        } else if (month == 9) {
            return CalenderMonthDefiner.SEPTEMBER.getCalenderMonthDefiner();
        } else if (month == 10) {
            return CalenderMonthDefiner.OCTOBER.getCalenderMonthDefiner();
        } else if (month == 11) {
            return CalenderMonthDefiner.NOVEMBER.getCalenderMonthDefiner();
        } else if (month == 12) {
            return CalenderMonthDefiner.DECEMBER.getCalenderMonthDefiner();
        }
        return 12;
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