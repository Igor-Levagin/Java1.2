public class Main {
    public static void main(String[] args) {

        int money =47;
        int summa =760;
        int bonus;

        if (summa > 100) {
            bonus = summa / 100;
        } else {
            bonus = 0;
        }
        int result = money + summa + bonus;

        System.out.println("Сумма счета: " + money);
        System.out.println("Сумма пополнения: " + summa);
        System.out.println("Бонус пополнения: " + bonus);
        System.out.println("Итог: " + result);


    }
}