public class Holiday {
    public void setHoliday() {
        int month = Calendar.scanMonth();
        int date = Calendar.scanDate();

        for (int i = 0; i <= 7; i++) {
            new Calendar().getCalendar().get(i + (month * 31 * 8) - (31 * 8) + (date * 8) - 8).
                    setCustomerAppointment("FERIE", "");
        }
    }
}
