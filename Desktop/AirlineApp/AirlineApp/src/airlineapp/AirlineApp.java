/*
 * Airline Poject Written in Java Using Netbenas IDE, and it's simple project for
 * the college in where this application is requierd let user create a new flight booking 
 * a<ol type="1">
<li></li>
<li></li>
</ol>
<meta http-equiv="Content-Language" content="en-US" />
nd save it to a file, alos should let the user to add/ ammend or change anything that he might wish in "Airport Listing"
 
 * Christian Matei <meta http-equiv="Content-Language" content="en-US" />
 * christian.matei@icloud.com
 * SOFTWARE PROJECT "Airline Application"<form method="POST">
</form>
 * City and Guild Application 
 * 
 * 
 */

// using airline package, cans we requiere more packages for the application 
package airlineapp;

// importing the necessary libraries for the project
import airlineapp.GUI.HOME;
import java.io.FileNotFoundException;

/**
 * @author Christian
 */

// this is the main class in the application form where the porgram will start

public class AirlineApp {

	/**
	 * @param args
	 *            the command line arguments // or start of the application
	 * @throws java.io.FileNotFoundException
	 */

	public static void main(String[] args) throws FileNotFoundException {

		// creating object and display the main from of the app
		HOME h = new HOME();
		h.show();
	}
}
