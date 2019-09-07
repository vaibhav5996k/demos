package carde;
import java.io.IOException;

public class CarSelector {
    public static void main(String[] arguments)  {
        CarServices carService = new CarServices();
        for (String argument : arguments) {
            try {
                carService.process(argument);
            }catch (RuntimeException e){
                 System.out.println(e.getMessage());
            }

        }
    }
}
