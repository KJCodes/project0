/** Description of class: ComputeSum
 *  This class will compute the sum of two user inputs.
 * @author Khushboo Jamal
 */

import java.util.Scanner;

public class ComputeSum{
	public static void main(String [] args){

		int input1 = 0; //If user enters an int first, it'll be stored in this variable
		int input2 = 0; //If user enters an int again, it'll be stored in this variable
		int sumofints = 0; //Will hold sum of two integer inputs
		double input11 = 0.0; //If user enters a double first, it'll be stored here
		double input22 = 0.0; //If user enters a double again, it'll be stored here
		double sumofdoubles = 0.0; //Will hold sum of two double inputs

		Scanner inputSource = new Scanner(System.in); //scanner object created

		System.out.print("Enter two numbers you would like me to compute the sum of: ");

		if(inputSource.hasNextInt()) {		//This will check what type of input is entered
			input1 = inputSource.nextInt();
		} else if(inputSource.hasNextDouble()) {
			input11 = inputSource.nextDouble();
		}  else System.out.print("You entered an invalid input. Please try again.");


		if(inputSource.hasNextInt()) {
			input2 = inputSource.nextInt();
		} else if(inputSource.hasNextDouble()) {
			input22 = inputSource.nextDouble();
		}  


		if (input1 != 0 && input2 !=0) {	//If the value of inputs have been changed, compute sum
			sumofints = input1 + input2;
			System.out.print("The sum of your two inputs is: " + sumofints); 
		} else if (input11 !=0 && input22 !=0) {
			sumofdoubles = input11 + input22;
			System.out.print("The sume of your two inputs is: " + sumofdoubles); 
		}

		//If user enters an integer and then a double, typecast the int into a double.
		//Doing such was simpler in C++ for me. I couldn't get that code to compile 
		//so I erased it. I also need to get used to using separate classes which is
		//why I put all the code in one since it was confusing.
	}
}
