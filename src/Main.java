public class Main {
    public static void main(String[] args) {
        int initialBalans = 100;
        int addend = 300;

        int bonus = 0;
        if (addend > 1000)
        bonus = addend / 100;

        int finalBalans = initialBalans + addend + bonus;
        System.out.println("Итоговый баланс: " + initialBalans);
        System.out.println("Итоговый бонус: " + bonus);

        if (addend > 1000) {
            bonus = addend / 100;

        } else {
            System.out.println("Итоговый бонус: " + bonus);

        }

    }
}