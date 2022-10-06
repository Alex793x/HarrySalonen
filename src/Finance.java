public class Finance {
    public void sumDayUp(){
        Calendar.setMonth();
        Calendar.setDate();
        double sumDay = 0;
        int arrayPositionForRequestedDates = (Calendar.getMonth() * 31 * 8) - (31 * 8) + (Calendar.getDate() * 8) - 8;
        for (int i = arrayPositionForRequestedDates;
             i < arrayPositionForRequestedDates + 40; i++) {
            if (new Calendar().getCalendar().get(i).customerAppointment.getHasPaid()){
                //udregning for shampoo pris 15.75
                sumDay += new Calendar().getCalendar().get(i).customerAppointment.shampoo.getProductAmount()*15.75;
                // udregnign for hårbørste pris  50
                sumDay += new Calendar().getCalendar().get(i).customerAppointment.hairbrush.getProductAmount()*50;
            }
            System.out.println(new Calendar().getCalendar().get(i));
        }
        System.out.println("Dagens omsætning: "+sumDay);
    }
}
