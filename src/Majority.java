import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();
        if(age>=18){
            System.out.printf("Возраст: %d \nСтатус: совершеннолетний", age);
        }else{
            System.out.printf("Возраст: %d \nСтатус: несовершеннолетний", age);
        }
        in.close();
    }
}
