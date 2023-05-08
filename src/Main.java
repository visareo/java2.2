public class Main {
    public static void main(String[] args) {
        int amount = 100;
        System.out.println("На счету 100 рублей");

        int x = 2000;
        System.out.println("Сумма пополнения:" + x);

        if (x < 1000) {
            System.out.println("Бонусов 0");

            System.out.println("Итоговая сумма:");
            System.out.println(amount + x);
        } else {
            System.out.println("Количество бонусов:" + (x / 100));
            System.out.println("Итоговая сумма:" + (x + (x / 100 + amount)));

    }

    }
}
