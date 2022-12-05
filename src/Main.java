public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        System.out.println();
        System.out.println(service.calculate(40_000_66));

        System.out.println();
        System.out.println(service.calculate(-40_000_66));

        System.out.println();
        System.out.println(service.calculate(1_00));

        System.out.println();
        System.out.println(service.calculate(20_00));

    }
}
