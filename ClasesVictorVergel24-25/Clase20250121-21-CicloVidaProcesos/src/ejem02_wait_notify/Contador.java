package ejem02_wait_notify;

public class Contador {
	private int c = 0;

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	/**
	 * @param c
	 */
	public Contador(int c) {
		super();
		this.c = c;
	}

	/**
	 * 
	 */
	public Contador() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contador [c=" + c + "]";
	}

	

}
