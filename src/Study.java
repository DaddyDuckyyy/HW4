import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        if(age<2) {
            System.out.println("Это значение не подходит");
        } else if (age<=6) {
            System.out.printf("Возраст: %d \nНужно ходить в садик", age);
        } else if (age<=17) {
            System.out.printf("Возраст: %d \nНужно ходить в школу", age);
        } else if (age<=24) {
            System.out.printf("Возраст: %d \nНужно ходить в университет", age);
        }else{
            System.out.printf("Возраст: %d \nНужно ходить на работу", age);
        }
        in.close();
    }
}
