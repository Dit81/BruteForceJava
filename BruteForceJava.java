import java.io.IOException;
import java.util.Random;


public class BruteForceJava {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Random rnd = new Random();

		int rndPasswords = rnd.nextInt(9999); // Generate password
		System.out.println("Password: " + rndPasswords);
		
		while (true){
			int userPasswords = rnd.nextInt(9999); // Generate brute password
			//System.out.println(userPasswords);
			if (rndPasswords == userPasswords){
				System.out.println(rndPasswords);
				break;
			}
		}
	}
}
