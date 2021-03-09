public class Main {
    public static void main(String[] args) {
    int balance = 100;
    int refill = 1100;
    int bonus;
    if (refill > 1000)
    { bonus = refill / 100 * 1;
    }
    else {
        bonus = 0;
    }
    int totalbonus = balance + refill + bonus;
    System.out.println("Текущий баланс "+ balance +" руб + " + "Пополнение " + refill +
            " руб + " + "Бонус " + bonus + " руб = " + "Баланс после пополнения = " + totalbonus + " руб");


    }
}
