package WhileLoopsAssignment;
import java.util.Scanner; // import the Scanner
/**
 *@author James Su
 *@Teacher Ms Leung
 *@Date September 25th, 2018
 */
public class While5 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter A Word: "); // prompt user for a word
		String word = sc.next(); // get the user inputed word
		System.out.println("How Many Times: ?"); // ask user to repeat for how many times
		int times = sc.nextInt(); // get the user inputed time
		int index = 0;
		while(index < times){ // this loop will as long as index is smaller than times
			System.out.println(word);
			index++; // increment the index by 1
		}
		sc.close();
	}
}
