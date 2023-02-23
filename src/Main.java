public class Main {
    public static void main(String[] args) {

        int amount = 120;
        int deposit = 200;
        int bonus = 0;
        int result;
        if (deposit > 1000) {
            bonus = deposit / 100;
        }
        result = amount + deposit + bonus;
        System.out.println("Начислено бонусов:" + bonus);
        System.out.println("Итого на счете:" + result);
    }
}