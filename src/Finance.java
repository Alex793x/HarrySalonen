public class Finance {

    // MENU SELECTOR
    private final String[] accountingChoices = {"\n1: DAGS AFSTEMNING", "\n2: UGE AFSTEMNING", "\n9: GÅ TILLAGE"};
    private boolean keepRunning = true;
    public void accountingOptions() {
        String menuHeader = "MENU:";
        String leadText = "VÆLG VENLIGST: ";
        System.out.println(menuHeader);
        accountMenu();
        System.out.println(leadText);

    }

    public void accountMenu() {
        while (keepRunning) {
            System.out.println(this);
            int userChoice = TestHarrySalon.in.nextInt();


            switch (userChoice) {
                case 1 -> {
                    System.out.println(accountingChoices[0]);
                    calculateDailySum();
                    keepRunning = false;
                }
                case 2 -> {
                    System.out.println(accountingChoices[1]);
                    calculateFiveDaysSum();
                    keepRunning = false;
                }
                case 9 -> {
                    System.out.println(accountingChoices[3]);
                    keepRunning = false;
                }
                default -> {
                    System.out.println("VÆLG EN RIGTIG MULIGHED");
                    System.out.println();
                }
            }
        }
    }


    // ACCOUNT MENU METHODS
    public void calculateDailySum() {
        Calendar.setMonth();
        Calendar.setDate();
        double sumDay = 0;
        int arrayPositionForRequestedDates = (Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getDate() * 8) - 8;
        for (int i = arrayPositionForRequestedDates;
             i < arrayPositionForRequestedDates + 8; i++) {
            if (new Calendar().getCalendar().get(i).customerAppointment.getHasPaid()){
                //udregning for shampoo pris 15.75
                sumDay += new Calendar().getCalendar().get(i).customerAppointment.shampoo.getProductAmount()*15.75;
                // udregning for hårbørste pris  50
                sumDay += new Calendar().getCalendar().get(i).customerAppointment.hairbrush.getProductAmount()*50;
            }
            System.out.println(new Calendar().getCalendar().get(i));
        }
        System.out.println("Dagens omsætning: "+sumDay);
    }
    public void calculateFiveDaysSum(){
        Calendar.setMonth();
        Calendar.setDate();
        double sumFiveDays = 0;
        int arrayPositionForRequestedDates = (Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getDate() * 8) - 8;
        for (int i = arrayPositionForRequestedDates;
             i < arrayPositionForRequestedDates + 40; i++) {
            if (new Calendar().getCalendar().get(i).customerAppointment.getHasPaid()) {
                //udregning for shampoo pris 15.75
                sumFiveDays += new Calendar().getCalendar().get(i).customerAppointment.shampoo.getProductAmount()*15.75;
                // udregning for hårbørste pris  50
                sumFiveDays += new Calendar().getCalendar().get(i).customerAppointment.hairbrush.getProductAmount()*50;
            }
            System.out.println(new Calendar().getCalendar().get(i));
        }
        System.out.println("Dagens omsætning: "+sumFiveDays);
    }

    @Override
    public String toString() {
        return accountingChoices[0] + "\n" + accountingChoices[1] + "\n" + accountingChoices[2];
    }
}