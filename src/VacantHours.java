public class VacantHours {

    public void setVacantHour() {
        TestHarrySalon.in.nextLine();

        System.out.println("Tryk - 1: For at booke ud til frokost, 2: for andre grunde");
        String input = TestHarrySalon.in.nextLine();


        if(input.equals("1")) {
            new Calendar().getCalendar().get(Calendar.findCalendarArrayPosition() + CustomerAppointment.readTimeSlot()).
                    setCustomerAppointment(Colors.RED+"FROKOST" + Colors.RESET, "");
        } else {
            new Calendar().getCalendar().get(Calendar.findCalendarArrayPosition() + CustomerAppointment.readTimeSlot()).
                    setCustomerAppointment(Colors.RED+"OPTAGET"+ Colors.RESET, "");
        }
    }
}