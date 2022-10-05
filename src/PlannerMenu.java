public class PlannerMenu {
    Holiday holiday = new Holiday();


    public void makeAppointment() {
        CustomerAppointment.setAppointment();
    }

    public void deleteAppointment() {
        CustomerAppointment.deleteAppointment();
    }

    public void addHoliday() {
        holiday.setHoliday();
    }


}
