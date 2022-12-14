public class Finance {

    // MENU FINANCE SELECTOR -----------------------------------------------
    private final String[] accountingChoices = {"\n1: DAGS AFSTEMNING", "\n2: UGE AFSTEMNING", "\n9: GÅ TILLAGE"};
    private boolean keepRunning = true;

    public void accountingOptions() {
        String menuHeader = "MENU:";
        String leadText = "VÆLG VENLIGST: ";
        System.out.println(menuHeader);
        accountMenu();
        System.out.println(leadText);
    }

    private void accountMenu() {
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

    // ACCOUNT MENU METHODS ----------------------------------------------
    private void calculateDailySum() {
        Calendar.setMonth();
        Calendar.setDate();

        double sumDay = 0;
        int arrayPositionForRequestedDates = Calendar.findCalendarArrayPosition();

        for (int i = arrayPositionForRequestedDates;
             i < arrayPositionForRequestedDates + 8; i++) {
            if (new Calendar().getCalendar().get(i).customerAppointment.getHasPaid()) {

                //udregning for shampoo pris 15.75
                sumDay += new Calendar().getCalendar().get(i).customerAppointment.shampoo.getProductAmount() * 15.75;

                // udregning for hårbørste pris  50
                sumDay += new Calendar().getCalendar().get(i).customerAppointment.hairbrush.getProductAmount() * 50;
            }
            System.out.println(new Calendar().getCalendar().get(i));
        }
        if (sumDay < 1) {
            System.out.println(Colors.RED + "\nDagens omsætning: " + sumDay + ",- DKK" + Colors.RESET);
        } else {
            System.out.println(Colors.GREEN + "\nDagens omsætning: " + sumDay + ",- DKK" + Colors.RESET);
        }
    }

    private void calculateFiveDaysSum() {
        Calendar.setMonth();
        Calendar.setDate();

        double sumFiveDays = 0;
        int arrayPositionForRequestedDates = Calendar.findCalendarArrayPosition();

        for (int i = arrayPositionForRequestedDates;
             i < arrayPositionForRequestedDates + 40; i++) {
            if (new Calendar().getCalendar().get(i).customerAppointment.getHasPaid()) {

                //udregning for shampoo pris 15.75
                sumFiveDays += new Calendar().getCalendar().get(i).customerAppointment.shampoo.getProductAmount() * 15.75;

                // udregning for hårbørste pris  50
                sumFiveDays += new Calendar().getCalendar().get(i).customerAppointment.hairbrush.getProductAmount() * 50;
            }
            System.out.println(new Calendar().getCalendar().get(i));
        }
        if (sumFiveDays < 1) {
            System.out.println(Colors.RED + "\nDagens omsætning: " + sumFiveDays + ",- DKK" + Colors.RESET);
        } else {
            System.out.println(Colors.GREEN + "\nDagens omsætning: " + sumFiveDays + ",- DKK" + Colors.RESET);
        }

    }

    @Override
    public String toString() {
        return accountingChoices[0] + "\n" + accountingChoices[1] + "\n" + accountingChoices[2];
    }
}