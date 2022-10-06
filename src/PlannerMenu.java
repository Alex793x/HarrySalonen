public class PlannerMenu {
    Holiday holiday = new Holiday();
    VacantHours vacantHours = new VacantHours();

    private final String[] menuItems = {"\n1: LAV AFTALE","2: FJERN AFTALE", "3: TILFØJ PAUSER",
            "4: TILFØJ FERIEDAGE", "5: KASSE", "6: TILGÅ AFSTEMNING", "7: PRINT KALENDER", "9: QUIT"};

    private boolean tryAgain = true;

    public boolean isTryAgain() {
        return tryAgain;
    }

    public void printMenu(){
        String menuHeader = "MENU:";
        String leadText = "VEÆL VENLIGST: ";
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


        while(tryAgain) {
            System.out.println(this);
            int userChoice = TestHarrySalon.in.nextInt();


            switch (userChoice) {
                case 1 -> {
                    System.out.println(menuItems[0]);
                    makeAppointment();
                }
                case 2 -> {
                    System.out.println(menuItems[1]);
                    deleteAppointment();
                }
                case 3 -> {
                    System.out.println(menuItems[2]);
                    addVacantHour();
                }
                case 4 -> {
                    System.out.println(menuItems[3]);
                    addHoliday();
                }
                case 5 -> {
                    System.out.println(menuItems[4]);
                    register();
                }
                case 6 -> {
                    System.out.println(menuItems[5]);
                    enterPassword();
                }
                case 7 -> {
                    System.out.println(menuItems[6]);
                    printRequestedDay();
                }
                case 9 -> {
                    System.out.println(menuItems[7]);
                    tryAgain = false;
                }
                default -> {
                    System.out.println("VÆLG EN GYLDIG MULIGHED");
                    System.out.println();
                }
            }
        }
    }

    private void makeAppointment() {
        CustomerAppointment.setAppointment();
    }

    private void deleteAppointment() {
        CustomerAppointment.deleteAppointment();
    }

    private void addHoliday() {
        holiday.setHoliday();
    }

    private void addVacantHour() {
        vacantHours.setVacantHour();
    }

    private void printRequestedDay() {
        Calendar.printRequestedCalendarDates();
    }

    public void enterPassword(){
        boolean isPasswordIncorrect = true;
        while (isPasswordIncorrect) {
            System.out.println("Indtast venligst password: ");
            String password = TestHarrySalon.in.nextLine();
            if (password.equals("hairyharry")) {
                isPasswordIncorrect = false;
                new Finance().sumDayUp();
            }
        }
    }

    private void register() {
        new Register().paymentOptions();
    }

}
