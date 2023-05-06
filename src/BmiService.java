public class BmiService {
    public int calculateBMI(double heightMetres, double massKg) {
        double result = massKg / (heightMetres * heightMetres);
        return (int) result;
    }
}
