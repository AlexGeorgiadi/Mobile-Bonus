import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int onAccount = 109;
        int amount = 2000;

        int bonus;
        if (amount >= 1000)
        {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int total = onAccount + amount + bonus;

        System.out.println("Итоговый счет:");
        System.out.println(total);

        System.out.println("Количество бонусных рублей:");
        System.out.println(bonus);
    }
}
