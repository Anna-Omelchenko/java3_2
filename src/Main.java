public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetres = 1.64;
        double massKg = 60.0;
        int bmi = service.calculateBMI(heightMetres, massKg);
        System.out.println("BMI-индеск: " + bmi);
    }
}