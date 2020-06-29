//This is a program which calculates the average of a 
// student's test scores and also shows the letter grade of each
//grade received.

import java.util.Scanner;

public class TestAvgAndGrades
{
	//method which calculates the average of the test scores
	public static double calcAverage(double score1, double score2, 
			double score3, double score4, double score5)
	{
		//average
		double average = (score1 + score2 + score3 + score4 + score5)/5;
		return average; //returns the test average
	}
	//method which determines the letter grade for each inputed
	//score
	public static String determineGrade (double score)
	{
		if (score >= 90)
			return "A";
		else if (score >= 80)
			return "B";
		else if (score >= 70)
			return "C";
		else if (score >= 60)
			return "D";
		else
			return "F";
	}
	//Allows for the user to enter each grade so that the 
	//score will have its corresponding letter grade as well
	//as the average calculated
    public static void main (String[] args)
	{
    	//to input the value
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter first score: ");
		//first score
        double One = keyboard.nextDouble();
	    System.out.println("Grade: " + determineGrade(One));
	    //second score
	    System.out.print("Please enter second score: ");
	    double Two = keyboard.nextDouble();
	    System.out.println("Grade: " + determineGrade(Two));
	    //third score
	    System.out.print("Please enter third score: ");
	    double Three = keyboard.nextDouble();
	    System.out.println("Grade: " + determineGrade(Three));
	    //fourth score
	    System.out.print("Please enter fourth score: ");
	    double Four = keyboard.nextDouble();
	    System.out.println("Grade: " + determineGrade(Four));
	    //fifth score
	    System.out.print("Please enter fifth score: ");
	    double Five = keyboard.nextDouble();
	    System.out.println("Grade: " + determineGrade(Five));
	    //This displays the average of the test scores
	    System.out.println("Average score: " + calcAverage(One,Two,Three,Four,Five));

	}
}