import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int temperature = in.nextInt();
        if(temperature<=5){
            System.out.printf("Температура: %d \nСовет: холодно, наденьте шапку", temperature);
        }else{
            System.out.printf("Температура: %d \nСовет: тепло, можно не надевать шапку", temperature);
        }
        in.close();
    }
}
