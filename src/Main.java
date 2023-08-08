public class Main {

    public static void main(String[] args) {
        int initiaBalance = 100;
        int addend = 300;
        int bonus = 0;

        if (addend > 1000) {
            bonus = addend / 100;
        }
        int finalBalance = initiaBalance + addend + bonus;
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}

