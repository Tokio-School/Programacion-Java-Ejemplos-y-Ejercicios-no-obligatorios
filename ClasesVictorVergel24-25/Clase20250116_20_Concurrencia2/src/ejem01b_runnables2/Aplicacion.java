package ejem01b_runnables2;

public class Aplicacion {

	public static void main(String[] args) {
		int i=0;
		
		
		/*new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int i = 0;
				while (i < 100000000) {
					System.out.println("Proceso hijo->" + i);
					i++;
				}
			}
		}).start();*/
			
		new Thread(() -> {
            int i_contador = 0;
            while (i_contador < 100000000) {
                System.out.println("Proceso hijo->" + i_contador);
                i_contador++;
            }
        }).start();
		

		while(i<100000000)	
		{
			System.out.println("Proceso padre->"+i);
			i++;
		}
	}
	


}
