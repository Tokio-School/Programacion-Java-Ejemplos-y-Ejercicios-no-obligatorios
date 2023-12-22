
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContadorComun contador=new ContadorComun(0);
		/*Proceso p1=new Proceso(contador,"p1");
		Proceso p2=new Proceso(contador,"p2");*/
		
		/*Thread p=new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i);
				}
			}
		});
		p.start();*/
		
		/*new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i);
				}
			}
		}).start();*/
		
		new Thread(()-> {
			for (int i = 0; i < 100; i++) 
				System.out.println(i);
		}).start();
		
		

	}

}
