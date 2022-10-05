public class PlannerMenu {
    Holiday holiday = new Holiday();
    VacantHours vacantHours = new VacantHours();


    public void makeAppointment() {
        CustomerAppointment.setAppointment();
    }

    public void deleteAppointment() {
        CustomerAppointment.deleteAppointment();
    }

    public void addHoliday() {
        holiday.setHoliday();
    }

    public void addVacantHour() {
        vacantHours.setVacantHour();
    }


}
