//This is a program which allows one to enter any line of
//text and as well as an index value representing the position 
//of the character and it will return the actual character
import java.util.Scanner;

//method which allows for the index to become the character's
//position value
public class Method_showChar
{
	public static void showChar(String input, int i)
    {
       System.out.print(input.charAt(i));   //uses charAt to find the character's position value
    }
	public static void main(String[] args)
	{
	    String name;        //the line of text
	    int index;          //the index value
	    //allows for input
	    Scanner keyboard = new Scanner(System.in);
	    //Prompts the user to enter any form of text
	    System.out.print("Enter a line of text: ");
	    name = keyboard.nextLine();
	    //Prompts the user to enter the index value
	    System.out.print("Enter your index: ");
	    index = keyboard.nextInt();
	    //calls the method which displays the character present
	    //at the place which the index value represents
	    showChar(name, index);

	} 
}
