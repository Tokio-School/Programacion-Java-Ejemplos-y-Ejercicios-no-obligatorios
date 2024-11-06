package ejemplo12;

public class Aplicacion {
	public static void main(String[] args) {
		Test t = new Test();
		Runnable r1 = () -> {
			Thread trd = Thread.currentThread();
			while (t.x < 3) {
				System.out.print(trd.getName() + " : " + t.x + " : ");
				t.x++;
			}
		};

		Runnable r2 = () -> {
			Thread trd = Thread.currentThread();
			while (t.xObj.get() < 3) {
				System.out.print(trd.getName() + ": " + t.xObj.get() + " : ");
				t.xObj.getAndIncrement();
			}
		};
		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r2, "t2");
		t1.start();
		t2.start();

	}
}

/**
 * Which is true?
 * 
 * A. The program prints t1 : 1 : t2 : 1: t1 : 2 : t2 : 2 : in random order. 
 * B. The program prints t1 : 1 : t2 : 1: t1 : 2 : t2 : 2 : 
 * C. The program prints t1 : 1 : t2 : 1: t1 : 1 : t2 : 1 : indefinitely. 
 * D. The program prints an exception.
 * 
 * Answer: A
 */
