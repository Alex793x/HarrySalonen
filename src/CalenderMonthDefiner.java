public enum CalenderMonthDefiner {

    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);


    public final int monthValue;

    CalenderMonthDefiner(int monthValue) {
        this.monthValue = monthValue;
    }

    public int getCalenderMonthDefiner() {
        return monthValue;
    }
}