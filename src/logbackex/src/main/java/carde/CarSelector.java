package carde;
import java.io.IOException;

public class CarSelector {
    public static void main(String[] arguments) {
        CarServices carService = new CarServices();
        for (String argument : arguments) {
            if (isValid(argument)) {
                carService.process(argument);
            } else{
                System.err.println("Ignoring invalid argument:"+argument);
            }
        }
    }
    private static boolean isValid(String argument) {
        try {
            CarState carstate = CarState.valueOf(argument);
            System.out.print("somtttt");
            System.out.print("erfgtdb");
            System.out.print("gwrtg");
            carstate = null;
        }catch (IllegalArgumentException e){


        }
        return false;
    }
}
