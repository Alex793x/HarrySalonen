public class PlannerMenu {
    Holiday holiday = new Holiday();
    VacantHours vacantHours = new VacantHours();

    private int userChoice;
    private String menuHeader;
    private String leadText;
    private String[] menuItems = {"1: Make Appointment","2: Delete Appointment", "3: Add Vacant Hours",
            "4: Add Holiday", "5: Make Payment", "6: Access Store Finance", "9: QUIT"};

    private boolean tryAgain = true;

    public PlannerMenu() {

    }

    public void printMenu(){
        menuHeader = "MENU:";
        leadText = "Please Choose: ";
        System.out.println(menuHeader);
        System.out.println(toString());
        System.out.println(leadText);
    }


    @Override
    public String toString() {
        return menuItems[0]+ "\n" + menuItems[1] + "\n" + menuItems[2] + "\n" + menuItems[3] + "\n" +
                menuItems[4]+ "\n" + menuItems[5] + "\n" + menuItems[6];
    }

    public void readChoice(){

        while(tryAgain) {

            userChoice = TestHarrySalon.in.nextInt();


            switch (userChoice) {
                case 1:
                    System.out.println(menuItems[0]);
                    makeAppointment();
                    tryAgain = false;
                    break;
                case 2:
                    System.out.println(menuItems[1]);
                    deleteAppointment();
                    tryAgain = false;
                    break;
                case 3:
                    System.out.println(menuItems[2]);
                    addHoliday();
                    tryAgain = false;
                    break;
                case 4:
                    System.out.println(menuItems[3]);
                    addVacantHour();
                    tryAgain = false;
                    break;
                case 5:
                    System.out.println(menuItems[4]);

                    tryAgain = false;
                    break;
                case 6:
                    System.out.println(menuItems[5]);

                    tryAgain = false;
                    break;
                case 9:
                    System.out.println(menuItems[6]);
                    tryAgain = false;
                    break;
                default:
                    System.out.println("Please choose a valid option!");
                    System.out.println();
            }
            if (tryAgain){
                printMenu();
                readChoice();
            }
        }

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


}
