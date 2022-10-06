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

    // ADD APPOINTMENT
    public static void setAppointment() {
        Calendar.printRequestDay();
        new Calendar().getCalendar().get(((Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getDate() * 8) - 8) +
                readTimeSlot()).setCustomerAppointment(readName(), readPhone());
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
        System.out.println("Hvilket tidspunkt på dagen, tast 1 for 10:00, tast 2 for 11:00 3 for 12:00 og så videre:");
        return TestHarrySalon.in.nextInt() - 1;
    }

    //DELETE CUSTOMER AND MAKE ARRAYPOS DEFAULT
    public static void deleteAppointment() {
        Calendar.printRequestDay();
        new Calendar().getCalendar().get(((Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getDate() * 8) - 8) +
                readTimeSlot()).setCustomerAppointment("klar til at booke", "");
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