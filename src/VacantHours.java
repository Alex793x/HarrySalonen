public class VacantHours {

    public void setVacantHour() {
        int month = Calendar.scanMonth();
        int date = Calendar.scanDate();

        TestHarrySalon.in.nextLine();

        System.out.println("1: For at booke ud til frokost, 2: for andre grunde");
        String input = TestHarrySalon.in.nextLine();


        if(input.equals("1")) {
            new Calendar().getCalendar().get(CustomerAppointment.readTimeSlot() + (month * 31 * 8) - (31 * 8) + (date * 8) - 8).
                    setCustomerAppointment("Til FROKOST", "");
        } else {
            new Calendar().getCalendar().get(CustomerAppointment.readTimeSlot() + (month * 31 * 8) - (31 * 8) + (date * 8) - 8).
                    setCustomerAppointment("DESVÆRRE OPTAGET", "");
        }
    }
}

