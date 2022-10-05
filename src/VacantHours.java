import java.util.Scanner;

public class VacantHours {
    Scanner in = new Scanner(System.in);
    public String vacantReason;
    public int occupiedHours;

    // GETTER ---------------------------------------
    public String getVacantReason() {
        return vacantReason;
    }

    public int getOccupiedHours() {
        return occupiedHours;
    }

    // SETTER ----------------------------------------
    public void setVacantReason(String vacantReason) {
        this.vacantReason = vacantReason;
    }

    public void setOccupiedHours(int occupiedHours) {
        this.occupiedHours = occupiedHours;
    }


    // CONSTRUCTOR ------------------------------------
    public VacantHours() {
        System.out.print("Whats the reason for vacant hours? :");
        setVacantReason(in.nextLine());
        System.out.print("How many hours will you be away? :");
        setOccupiedHours(in.nextInt());
    }

    public String toString() {
        return "VacantHours{vacantReason='" + vacantReason + "', occupiedHours=" + occupiedHours + "}";
    }
}
