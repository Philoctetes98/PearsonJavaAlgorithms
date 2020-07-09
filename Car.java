/** This is a class which holds the values of 
 * the make, model, and the speed of a car
 * @author Binyam Ephrem
 *
 */

/** The public class which creates the fields, instances, and
 * methods for the Car
 *
 */
public class Car
{
	/** The year the car was made
	 * 
	 */
    private int yearModel;
    /** The make of the car
     * 
     */
    private String make;
    /** The speed of the car
     * 
     */
    private int speed;
    
    /** Constructor which holds the make and year of the car
     * it also initializes the speed at 0
     * @param model
     * @param makeA
     */
    public Car (int model, String makeA)
    {
        model = yearModel;
        makeA = make;
        speed = 0;
    }
    
    /** The method which holds the year the car was made
     * 
     * @return yearModel
     */
    public int getYearModel()
    {
        return yearModel;
    }
    
    /** The method which holds the make of the car
     * 
     * @return make
     */
    public String getMake()
    {
        return make;
    }
    
    /** The method which holds the speed of the car
     * 
     * @return speed
     */
    public int getSpeed()
    {
        return speed;
    }
    
    /** The method which adds to the speed of the car if it accelerates
     * 
     */
    public void accelerate()
    {
        speed+=5;
    }
    
   /** The method which diminishes the speed of the car if it brakes
    * 
    */
    public void brake()
    {
        speed -= 5;
    }
    
}
