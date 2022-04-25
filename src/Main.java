public class Main {
    public static void main(String[] args) {

        int ticket = 5942; // Стоимость билета
        int rubles = 20; // Количество рублей для одной бонусной мили

        int bonusMile = ticket / rubles; // Бонусные мили

        System.out.println("Начисленно бонусных миль: " + bonusMile);
    }
}
