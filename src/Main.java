public class Main {
    public static void main(String[] args) {
        int amount = 100; //кол-во денег на счету
        System.out.println("На счету " + amount + " рублей");

        int deposit = 1100; //кол-во денег внесенное пользователем для пополнения счета
        int Bonus; //кол-во бонусов
        int TotalSum; //сумма счета вместе с бонусами
        System.out.println("Сумма пополнения: " + deposit);

        if (deposit < 1001) {
            TotalSum = amount + deposit; //Сохранение в переменную TotalSum итоговой суммы счета вместе с бонусами
            Bonus = 0; //Сохранение в переменную Bonus кол-ва бонусов
            System.out.println("Начислено " + Bonus + " бонусов.");
            System.out.println("Итоговая сумма: " + TotalSum);
        } else {
            Bonus = (deposit / 100); //Сохранение в переменную Bonus кол-ва бонусов
            TotalSum = deposit + (deposit / 100 + amount); //Сохранение в переменную TotalSum итоговой суммы счета вместе с бонусами
            System.out.println("Количество бонусов: " + Bonus);
            System.out.println("Итоговая сумма: " + TotalSum);

    }

    }
}
