import java.util.Arrays;

public class Register {
    private boolean productPick = true;

    private final String[] registerOptions = {"\n1: BETAL", "\n2: PÅ KREDIT", "\n3: TILFØJ PRODUKTER", "\n9: GÅ TILBAGE"};


    // MENU SELECTOR --------------------------

    public void paymentOptions() {
        String menuHeader = "MENU:";
        String leadText = "VÆLG VENLIGST: ";
        System.out.println(menuHeader);
        paymentChoice();
        System.out.println(leadText);

    }

    public void paymentChoice() {

        while (productPick) {
            System.out.println(this);
            int userChoice = TestHarrySalon.in.nextInt();


            switch (userChoice) {
                case 1 -> {
                    System.out.println(registerOptions[0]);
                    Calendar.printRequestDay();
                    makePayment();
                    productPick = false;
                }
                case 2 -> {
                    System.out.println(registerOptions[1]);
                    Calendar.printRequestDay();
                    doCredit();
                    productPick = false;
                }
                case 3 -> {
                    System.out.println(registerOptions[2]);
                    addProduct();
                }
                case 9 -> {
                    System.out.println(registerOptions[3]);
                    productPick = false;
                }
                default -> {
                    System.out.println("VÆLG EN RIGTIG MULIGHED");
                    System.out.println();
                }
            }
        }
    }

    public void makePayment() {
        new Calendar().getCalendar().get(((Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getDate() * 8) - 8) +
                CustomerAppointment.readTimeSlot()).customerAppointment.setHasPaid(true);

    }

    public void addProduct() {
        String[] productList = {"\n1: SHAMPOO", "\n2: HÅRBØRSTE", "\n9: GÅ TILBAGE"};
        boolean productPick = true;
        String menuHeader = "PRODUKTLISTE:";
        String leadText = "VÆLG MELLEM: ";
        System.out.println(menuHeader);
        System.out.println(leadText);

        while (productPick) {
            System.out.println(Arrays.toString(productList));
            int userChoice = TestHarrySalon.in.nextInt();


            switch (userChoice) {
                case 1 -> {
                    System.out.println(productList[0]);
                    Calendar.printRequestDay();
                    setShampooAmount();
                    productPick = false;
                }
                case 2 -> {
                    System.out.println(productList[1]);
                    Calendar.printRequestDay();
                    setHairbrushAmount();
                    productPick = false;
                }
                case 9 -> {
                    System.out.println(productList[2]);

                    productPick = false;
                }
                default -> {
                    System.out.println("VÆLG EN RIGTIG MULIGHED");
                    System.out.println();
                }
            }
        }
    }



    public void doCredit() {
        new Calendar().getCalendar().get(((Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getDate() * 8) - 8) +
                CustomerAppointment.readTimeSlot()).customerAppointment.setHasPaid(false);
    }

    public void setShampooAmount() {
        new Calendar().getCalendar().get(((Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getDate() * 8) - 8) +
                CustomerAppointment.readTimeSlot()).customerAppointment.shampoo.setProductAmount();
    }
    public void setHairbrushAmount() {
        new Calendar().getCalendar().get(((Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getDate() * 8) - 8) +
                CustomerAppointment.readTimeSlot()).customerAppointment.hairbrush.setProductAmount();
    }

    @Override
    public String toString() {
        return registerOptions[0] + "\n" + registerOptions[1] + "\n" + registerOptions[2] + "\n" + registerOptions[3];
    }
}
