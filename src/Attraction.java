import java.util.Scanner;

public class Attraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        if (age>=14) {
            System.out.println("Можно кататься на аттракционе без сопровождения родителей");
        } else if (age>=5) {
            System.out.println("Можно кататься на аттракционе с сопровождением родителей");
        } else {
            System.out.println("Нельзя кататься на аттракционе");
        }
        in.close();
    }
}
