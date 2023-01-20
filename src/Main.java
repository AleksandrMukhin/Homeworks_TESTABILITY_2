import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double weight = 80; // вес в кг.
        double height = 1.60; // рост в метрах
        double bodyMassIndex = service.calculate(height);

        System.out.println("Индекс массы тела: " + weight / bodyMassIndex);
    }
}