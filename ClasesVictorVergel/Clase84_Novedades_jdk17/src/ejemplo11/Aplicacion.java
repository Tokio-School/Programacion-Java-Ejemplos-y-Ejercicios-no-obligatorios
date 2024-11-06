package ejemplo11;
// https://www.examtopics.com/exams/oracle/1z0-809/view/
public class Aplicacion {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(100);
		v.increSpeed(60);
	}
}

/**
 * What is the result?

    A. Velocity with new speed 1 kmph
    B. A compilation error occurs at line n1.
    C. A compilation error occurs at line n2.
    D. A compilation error occurs at line n3. 
    
    Result: 
    D. */
