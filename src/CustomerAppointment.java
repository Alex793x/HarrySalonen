public class CustomerAppointment {

    private String firstName;
    private String phone;
    private Product product;
    boolean hasPaid;

    // CONSTRUCTOR -----------------------------------

    public CustomerAppointment(String firstName, String phone) {
        setFirstName(firstName);
        setPhone(phone);
    }

    // GETTER -------------------------------
    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    // SETTER ---------------------------------
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    // ADD APPOINTMENT
    public static void setAppointment() {
        new Calendar().getCalendar().get(readTimeSlot() + (Calendar.scanMonth() * 31 * 8) - (31 * 8) + (Calendar.scanDate() * 8) - 8).
                setCustomerAppointment(readName(), readPhone());
    }

    public static String readName() {
        TestHarrySalon.in.nextLine();
        System.out.println("tast kundens navn:");
        return TestHarrySalon.in.nextLine();
    }

    public static String readPhone() {
        System.out.println("tast kundens telefon nr.");
        return TestHarrySalon.in.nextLine();
    }

    public static int readTimeSlot() {
        System.out.println("Hvilket tidspunkt på dagen, tast 1 for 10:00, tast 2 for 11:00 3 for 12:00 og så videre:");
        return TestHarrySalon.in.nextInt() - 1;
    }

    //DELETE CUSTOMER AND MAKE ARRAYPOS DEFAULT
    public static void deleteAppointment() {
        new Calendar().getCalendar().get(readTimeSlot() + (Calendar.scanMonth() * 31 * 8) - (31 * 8) + (Calendar.scanDate() * 8) - 8).
                setCustomerAppointment("klar til at booke", "");
    }


    @Override
    public String toString() {
        if (firstName.equalsIgnoreCase("Ferie")) {
            return firstName;

        } else if (firstName.equalsIgnoreCase("Frokost") || firstName.equalsIgnoreCase("Optaget")) {
            return firstName;

        } else {
            return "CustomerAppointment: " + firstName + ", phone: " + phone
                    + ", products bought: " + product + ", Customer has paid: " + hasPaid;
        }
    }
}
