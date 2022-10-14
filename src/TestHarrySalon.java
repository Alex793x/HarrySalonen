import java.util.Scanner;

public class TestHarrySalon {
    public static Scanner in = new Scanner(System.in);
    Calendar calendar = new Calendar();
    PlannerMenu plannerMenu = new PlannerMenu();

    public void run(){
        calendar.makeCalendar();
        plannerMenu.printMenu();

    }

    public static void main(String[] args){
        new TestHarrySalon().run();
    }

}