//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int score = 100;
        int replenishment = 300;
        if (replenishment >= 1000){
            int bonus = replenishment/100;
            score += bonus + replenishment;
           System.out.println("Бонус равен: "+ bonus);
           System.out.println("На счету: " + score + " рублей.");
        } else {
            score += replenishment;
            System.out.println("На счету: " + score + " рублей.");
        }


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}