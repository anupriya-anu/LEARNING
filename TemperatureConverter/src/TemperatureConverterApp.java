import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Entre the temperature in degree-F");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		double tempincelsius=temperatureConverter.convertFahrenheitToCelsius(f);
		System.out.println(tempincelsius);
	}

}
