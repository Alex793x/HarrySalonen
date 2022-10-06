public class VacantHours {

    public void setVacantHour() {
        Calendar.printRequestDay();

        TestHarrySalon.in.nextLine();

        System.out.println("Tryk - 1: For at booke ud til frokost, 2: for andre grunde");
        String input = TestHarrySalon.in.nextLine();


        if(input.equals("1")) {
            new Calendar().getCalendar().get(CustomerAppointment.readTimeSlot() + (Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getDate() * 8) - 8).
                    setCustomerAppointment("FROKOST", "");
        } else {
            new Calendar().getCalendar().get(CustomerAppointment.readTimeSlot() + (Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getMonth() * 8) - 8).
                    setCustomerAppointment("OPTAGET", "");
        }
    }
}