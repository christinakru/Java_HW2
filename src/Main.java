import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите баланс счета:");
        Scanner in = new Scanner(System.in);
        int balance = in.nextInt();

        System.out.println("Введите сумму пополнения:");
        int payment = in.nextInt();

        int result = payment + balance;
        int bonus = 0;

        if (payment > 1000){
            bonus = payment / 100;
            result += bonus;
        }

        System.out.printf("Итоговый баланс: %d\n", result);
        System.out.printf("Количество бонусных рублей: %d", bonus);
    }
}