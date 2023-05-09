public class Main {
    public static void main(String[] args) {
        int amount = 999;
        System.out.println("На счету " + amount + " рублей");

        int deposit = 1001;
        int Bonus;
        int TotalSum;
        System.out.println("Сумма пополнения: " + deposit);

        if (deposit < 1001) {
            TotalSum = amount + deposit;
            Bonus = 0;
            System.out.println("Начислено " + Bonus + " бонусов.");
            System.out.println("Итоговая сумма: " + TotalSum);
        } else {
            Bonus = (deposit / 100);
            TotalSum = deposit + (deposit / 100 + amount);
            System.out.println("Количество бонусов: " + Bonus);
            System.out.println("Итоговая сумма: " + TotalSum);

    }

    }
}
