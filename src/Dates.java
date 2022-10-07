public class Dates {
    CustomerAppointment customerAppointment = new CustomerAppointment("Klar til at booke", "");

    private int date;
    private CalenderMonthDefiner month;
    private int timeSlot;

    public Dates(int date, CalenderMonthDefiner month, int timeSlot) {
        setDate(date);
        setMonth(month);
        setTimeSlot(timeSlot);
        new CustomerAppointment("", "");
    }

    private int getDate() {
        return date;
    }

    private CalenderMonthDefiner getMonth() {
        return month;
    }

    private int getTimeSlot() {
        return timeSlot;
    }

    public CustomerAppointment getCustomerAppointment() {
        return customerAppointment;
    }

    private void setDate(int date) {
        this.date = date;
    }

    private void setMonth(CalenderMonthDefiner month) {
        this.month = month;
    }

    private void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void setCustomerAppointment(String firstName, String phoneNumber) {
        this.customerAppointment = new CustomerAppointment(firstName, phoneNumber);
    }

    public String toString() {
        return getDate() + "/" + getMonth() + " - Klokken " + getTimeSlot() + " - Aktiviteter: "
                + getCustomerAppointment();
    }
}