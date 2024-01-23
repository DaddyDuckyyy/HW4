import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во пассаживров: ");
        int occupiedSeats = in.nextInt();
        int sittingSeats = 62;
        int standingSeats = 40;
        if (occupiedSeats>=(standingSeats+sittingSeats)){
            System.out.println("Все места заняты");
        } else if (occupiedSeats>=sittingSeats){
            System.out.println("Все сидячие места заняты, осталось " + (standingSeats-(occupiedSeats-sittingSeats)) + " стоячих");
        } else {
            System.out.println("Осталось " + (sittingSeats-occupiedSeats) + " сидячих мест и " + standingSeats + " стоячих");
        }
        in.close();
    }
}
