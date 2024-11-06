package ejemplo13;

import java.time.Duration;
import java.time.Period;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duration duration = Duration.ofMillis (5000) ;
		System.out.print (duration) ;
		duration = Duration.ofSeconds (60) ;
		System.out.print (duration) ;
		Period period = Period.ofDays (6) ;
		System.out.print (period) ;
	}
	/*What is the result?

		    A. PT5000SPT60MP6D
		    B. PT5SPT1MP6D
		    C. 5S1M6D
		    D. 5000S60M6D
		    
		    Answer: 
		    B
*/

}
