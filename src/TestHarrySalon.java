import java.util.Scanner;

public class TestHarrySalon {
    public static Scanner in = new Scanner(System.in);
    Product shampoo = new Product("Shampoo", 15.75);
    Product hairbrush = new Product("Hairbrush", 50.00);
    Calendar calendar = new Calendar();
    PlannerMenu plannerMenu = new PlannerMenu();

    public void run(){
        int testFourtyTimes = 40;
        calendar.makeCalendar();
        plannerMenu.printMenu();


        for (int i = 0; i < testFourtyTimes; i++) {
            plannerMenu.readChoice();
        }

    }

    public static void main(String[] args){
        new TestHarrySalon().run();
    }
}