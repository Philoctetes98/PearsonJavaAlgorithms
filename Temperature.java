/** This is program which serves as a temperature converter
 * The user enter a temperature in Fahrenheit and the program
 * changes it to Celsius and Kelvin
 * @author Binyam Ephrem
 */
import java.util.Scanner;

/** main driver class which uses the fields and data from
 * the fields and other methods below.
 *
 */
public class Temperature 
{
    public static void main (String[] args)
    {
    	/** Creates an instance of the Scanner class
    	 * 
    	 */
        Scanner keyboard = new Scanner(System.in);
        /** Temperature inserted in degrees Fahrenheit
         * 
         */
        double fahrInput;
        /** Prompts the user to enter the temperature
         * in Fahrenheit
         */
        System.out.print("Enter a Fahrenheit temperature: ");
        /** The fahrenheit temperature input
         * 
         */
        fahrInput = keyboard.nextDouble();
        /** Creates a new instance of the temperature class
         * 
         */
        Temperature temp = new Temperature(fahrInput);
        /** Displays the temperature in Fahrenheit
         * 
         */
        System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
        /** Displays the temperature in Celsius
         * 
         */
        System.out.println("The temperature in Celsius is " + temp.getCelsius());
        /** Displays the temperature in Kelvin
         * 
         */
        System.out.println("The temperature in Kelvin is " + temp.getKelvin());
    }
    /** field which holds the Fahrenheit temperature
     * 
     */
    private double ftemp;
    
    /** Constructor which holds the Fahrenheit temperature
     * 
     * @param FahrTemp
     */
    public Temperature(double FahrTemp)
    {
        ftemp = FahrTemp;
    }
    
    /** Set method which holds the Fahrenheit temperature 
     * 
     * @param theTemp
     */
    public void setFahrenheit(double theTemp)
    {
        ftemp = theTemp;
    }
    
    /** Get method which returns the value of the Fahrenheit temperature
     * 
     * @return ftemp
     */
    public double getFahrenheit()
    {
        return ftemp;
    }
    
    /** Method which calculates the temperature in Celsius
     * 
     * @return ((double)5/9)*(ftemp-32)
     */
    public double getCelsius()
    {
        return ((double)5/9)*(ftemp-32);
    }
    
    /** Method which calculates the temperature in Kelvin
     * 
     * @return ((5/(double)9)*(ftemp-32)+273)
     */
    public double getKelvin()
    {
        return((5/(double)9)*(ftemp-32)+273);
    }
}