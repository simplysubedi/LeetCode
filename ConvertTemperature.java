import java.util.Arrays;

public class ConvertTemperature {
public static void main(String[] args){
    double celsius = 23.5;
    System.out.println("The conversion in kelvin and farenheit is : "+ Arrays.toString(convertTemperature(celsius)));
}

    public static double[] convertTemperature(double celsius) {
        return new double[] { celsius + 273.15, (celsius * 1.80) + 32.00 };
    }
}
