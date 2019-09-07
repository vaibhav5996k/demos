package carde;
import java.io.IOException;

public class CarSelector {
    public static void main(String[] arguments)  {
        CarServices carService = new CarServices();
        for (String argument : arguments) {
            carService.process(argument);
        }
    }
}
