import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите скорость: ");
        int speed = in.nextInt();
        if(speed>=60){
            System.out.printf("Скорость: %d \nВы превысили скоростной режим! Придётся заплатить штраф.", speed);
        }else{
            System.out.printf("Скорость: %d \nВы соблюдаете скоростной режим.", speed);
        }
        in.close();
    }
}
