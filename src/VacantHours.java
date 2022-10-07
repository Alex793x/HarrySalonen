public class VacantHours {

    public void setVacantHour() {
        TestHarrySalon.in.nextLine();

        System.out.println("1: FOR AT BOOKE FROKOST \n" +
                "2: FOR ANDRE GRUNDE");
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