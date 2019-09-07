package carde;
import java.io.IOException;

public class CarSelector {
    public static void main(String[] arguments) throws Exception {
        CarServices carService = new CarServices();
        for (String argument : arguments) {
            carService.process(argument);
        }
    }
}
