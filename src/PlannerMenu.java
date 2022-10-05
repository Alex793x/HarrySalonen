public class PlannerMenu {
    Holiday holiday = new Holiday();
    VacantHours vacantHours = new VacantHours();

    private int userChoice;
    private String menuHeader;
    private String leadText;
    private final String[] menuItems = {"1: Make Appointment","2: Delete Appointment", "3: Add Vacant Hours",
            "4: Add Holiday", "5: Make Payment", "6: Access Store Finance", "7: Print Requested Date", "9: QUIT"};

    private boolean tryAgain = true;

    public PlannerMenu() {

    }

    public void printMenu(){
        menuHeader = "MENU:";
        leadText = "Please Choose: ";
        System.out.println(menuHeader);
        System.out.println(leadText);
        readChoice();
    }


    @Override
    public String toString() {
        return menuItems[0]+ "\n" + menuItems[1] + "\n" + menuItems[2] + "\n" + menuItems[3] + "\n" +
                menuItems[4]+ "\n" + menuItems[5] + "\n" + menuItems[6] + "\n" + menuItems[7] + "\n";
    }

    public void readChoice(){

        do {
            System.out.println(this);
            userChoice = TestHarrySalon.in.nextInt();


            switch (userChoice) {
                case 1 -> {
                    System.out.println(menuItems[0]);
                    makeAppointment();
                    tryAgain = false;
                }
                case 2 -> {
                    System.out.println(menuItems[1]);
                    deleteAppointment();
                    tryAgain = false;
                }
                case 3 -> {
                    System.out.println(menuItems[2]);
                    addVacantHour();
                    tryAgain = false;
                }
                case 4 -> {
                    System.out.println(menuItems[3]);
                    addHoliday();
                    tryAgain = false;
                }
                case 5 -> {
                    System.out.println(menuItems[4]);

                    tryAgain = false;
                }
                case 6 -> {
                    System.out.println(menuItems[5]);
                    tryAgain = false;
                }
                case 7 -> {
                    System.out.println(menuItems[6]);
                    printRequestedDay();
                    tryAgain = false;
                }
                case 9 -> {
                    System.out.println(menuItems[7]);
                    tryAgain = false;
                }
                default -> {
                    System.out.println("Please choose a valid option!");
                    System.out.println();
                }
            }
        } while(tryAgain);
    }

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

    public void printRequestedDay() {
        Calendar.printRequestedCalendarDates();
    }

}
