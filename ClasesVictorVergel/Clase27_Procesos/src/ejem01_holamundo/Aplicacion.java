package ejem01_holamundo;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread().getName()+": hola mundo proceso padre");
		ContadorComun contadorComun=new ContadorComun(0);
		
		
		
		Proceso proceso=new Proceso("p1",contadorComun);
		proceso.start();
		
		Proceso proceso2=new Proceso("p2",contadorComun);
		proceso2.start();
		
		Proceso proceso3=new Proceso("p3",contadorComun);
		proceso3.start();
		
		Proceso proceso4=new Proceso("p4",contadorComun);
		proceso4.start();
		
		
//		for(int i=0;i<200;i++)
//			System.out.println(Thread.currentThread().getName()+": Fin del proceso padre");
	}

}
