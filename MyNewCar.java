/** The driver class which uses the values and
 * methods of the Car class and figures out the speed of 
 * the specific car (in our case a 2013 Toyota Camry) which
 * increments and decrements by 5 mph
 * @author Binyam Ephrem
 */
import java.util.Scanner;

public class MyNewCar
{
	public static void main (String[] args)
	{
		/** creates an instance of the Car class
		 * 
		 */
		Car theCar = new Car (2013, "Toyota");
		
		/** prints a message that lets the user know that
		 * the car is accelerating
		 */
		System.out.println("The car is accelerating now..");
		
		/**The loop which sets up for the car to accelerate by
		 * increments of 5 mph
		 */
		for (int index = 0; index < 5; index++)
		{
			/**Calls the accelerate method
			 * 
			 */
			theCar.accelerate();
			/** Prints out the speed of the car
			 * 
			 */
			System.out.println("Current speed of the " +
			theCar.getYearModel() + " " + theCar.getMake() 
			+ " is " + theCar.getSpeed() + " mph");
		}
		
		/** prints a message that lets the user know that
		 * the car is braking
		 */
		System.out.println("The car is braking now..");
		
		/** The loop which sets up for the car to brake
		 * , decreasing by 5 mph
		 */
		for (int index = 0; index < 5; index++)
		{
			/**Calls the brake method
			 * 
			 */
			theCar.brake();
			/** Prints out the speed of the car
			 * 
			 */
			System.out.println("Current speed of the " +
			theCar.getYearModel() + " " + theCar.getMake() 
			+ " is " + theCar.getSpeed() + " mph");
		}
	}
}
