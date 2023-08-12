import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the speed and time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator distance=new JourneyCalculator();
		double d=distance.calculateDistance(speed, time);
		System.out.println(d);
		}

}
