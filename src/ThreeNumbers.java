import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 3 числа: ");
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        if (one>two) {
            System.out.println("Большее число: " + Math.max(one, three));
        } else {
            System.out.println("Большее число: " + Math.max(two, three));
        }
        in.close();
    }
}
