public class CustomerAppointment {

    private String firstName;
    private String phone;
    Product shampoo = new Product("Shampoo", 15.75);
    Product hairbrush = new Product("Hårbørste", 50.00);
    private boolean hasPaid = true;

    // CONSTRUCTOR -----------------------------------
    public CustomerAppointment(String firstName, String phone) {
        setFirstName(firstName);
        setPhone(phone);
    }

    // GETTER -------------------------------
    public boolean getHasPaid() {
        return hasPaid;
    }

    // SETTER ---------------------------------
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    // ADD APPOINTMENT ------------------------------------------------
    public static void setAppointment() {
        new Calendar().getCalendar().get(Calendar.findCalendarArrayPosition()
                + readTimeSlot()).setCustomerAppointment(readName(), readPhone());
    }

    private static String readName() {
        TestHarrySalon.in.nextLine();
        System.out.println("Tast kundens navn:");
        return TestHarrySalon.in.nextLine();
    }

    private static String readPhone() {
        System.out.println("Tast kundens telefon nr.");
        return TestHarrySalon.in.nextLine();
    }

    public static int readTimeSlot() {
        System.out.println();
        System.out.println("""
                HVILKET TIDSPUNKT PÅ DAGEN?\s
                Tast 10 for 10:00\s
                Tast 11 for 11:00\s
                Tast 12 for 12:00
                Tast 13 for 13:00\s
                Tast 14 for 14:00\s
                Tast 15 for 15:00\s
                Tast 16 for 16:00\s
                Tast 17 for 17:00""");
        return TestHarrySalon.in.nextInt() - 10;
    }

    //DELETE CUSTOMER AND MAKE ARRAY POSITION DEFAULT ---------------------------------------------------------------
    public static void deleteAppointment() {
        new Calendar().getCalendar().get(Calendar.findCalendarArrayPosition() +
                readTimeSlot()).setCustomerAppointment("KLAR TIL AT BOOKE", "");
    }

    @Override
    public String toString() {
        if (firstName.equalsIgnoreCase("Ferie")) {
            return firstName;

        } else if (firstName.equalsIgnoreCase("Frokost") || firstName.equalsIgnoreCase("Optaget")) {
            return firstName;

        } else if (firstName.equalsIgnoreCase("Klar til at booke")) {
            return "Tid ledig - " + firstName;

        } else if (shampoo.getProductAmount() <= 0 && hairbrush.getProductAmount() <= 0) {
            return "Kundeaftale: " + firstName + ", Telefon: " + phone + ", Kunde har betalt: " + hasPaid;
        }
        else {
            return "Kundeaftale: " + firstName + ", Telefon: " + phone
                    + ", Produkter købt: " + shampoo + hairbrush + ", Kunde har betalt: " + hasPaid;
        }
    }
}