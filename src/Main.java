public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double bmi = service.calculate(50, 170);
        System.out.println(bmi);
    }
}
