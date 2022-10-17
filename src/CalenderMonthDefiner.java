public enum CalenderMonthDefiner {

    JANUARY(31, "January", 1),
    FEBRUARY(28, "February", 2),
    MARCH(31, "March", 3),
    APRIL(30, "April", 4),
    MAY(31, "May", 5),
    JUNE(30, "June", 6),
    JULY(31, "July", 7),
    AUGUST(31, "August", 8),
    SEPTEMBER(30, "September", 9),
    OCTOBER(31, "October", 10),
    NOVEMBER(30, "November", 11),
    DECEMBER(31, "December", 12  );


    public final int monthValue;
    public final int monthDay;
    public final String monthName;

    CalenderMonthDefiner(int monthValue, String monthName, int monthDay) {
        this.monthValue = monthValue;
        this.monthName = monthName;
        this.monthDay = monthDay;
    }

    public int getCalenderMonthDefiner() {
        return monthValue;
    }

    public String getMonthName() {
        return monthName;
    }

}