import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 2008;
        int miles = service.calculate(price);

        System.out.println("Цена " + price);
        System.out.println("Мили " + miles);

    }
}
