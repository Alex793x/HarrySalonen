public class Holiday {
    public void setHoliday() {
        Calendar.setMonth();
        Calendar.setDate();

        for (int i = 0; i <= 7; i++) {
            new Calendar().getCalendar().get(Calendar.findCalendarArrayPosition() + i).
                    setCustomerAppointment(Colors.RED + "FERIE" + Colors.RESET, "");
        }
    }
}
