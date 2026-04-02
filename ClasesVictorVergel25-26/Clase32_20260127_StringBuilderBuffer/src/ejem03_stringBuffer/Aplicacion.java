package ejem03_stringBuffer;

public class Aplicacion {

	public static void main(String[] args) {
		StringBuffer stringBufferCompartido = new StringBuffer();
		//StringBuilder stringBufferCompartido = new StringBuilder();
		Thread[] procesos=new Thread[5];
		
		for(int i=0;i<5;i++) {
			procesos[i]=new Thread(()-> {
					for(int j=0;j<5;j++) {
						stringBufferCompartido.append("["+Thread.currentThread().getName()+"-"+j+"]\n");
					}
				
			},"Proceso-"+(i+1));
		}
		for(int i=0;i<5;i++) {
			procesos[i].start();
		}
		for(int i=0;i<5;i++) {
				try {
					procesos[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		System.out.println(stringBufferCompartido);
		

	}

}
