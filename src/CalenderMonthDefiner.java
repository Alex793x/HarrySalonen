public enum CalenderMonthDefiner {

    JANUARY(31, "January"),
    FEBRUARY(28, "February"),
    MARCH(31, "March"),
    APRIL(30, "April"),
    MAY(31, "May"),
    JUNE(30, "June"),
    JULY(31, "July"),
    AUGUST(31, "August"),
    SEPTEMBER(30, "September"),
    OCTOBER(31, "October"),
    NOVEMBER(30, "November"),
    DECEMBER(31, "December");


    public final int monthValue;
    public final String monthName;

    CalenderMonthDefiner(int monthValue, String monthName) {
        this.monthValue = monthValue;
        this.monthName = monthName;
    }

    public int getCalenderMonthDefiner() {
        return monthValue;
    }

    public String getMonthName() {
        return monthName;
    }

}