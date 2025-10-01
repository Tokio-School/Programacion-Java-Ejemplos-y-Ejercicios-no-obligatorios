
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=7;
		
		switch(numero)
		{
			case 1,2,3:
				System.out.println("El numero es 1");
				break;
			case 7:
				System.out.println("El numero es 7");
				break;
			default:
				System.out.println("El numero no es ninguno de los casos descritos");
				break;
		}
		
		
		do
		{
			System.out.println("El numero es: "+numero);
			numero--;
		}while(numero>0);
		System.out.println("Finalizado la ejecución del do-while");
		
		
		while(numero<7)
		{
			numero++;
			System.out.println("El numero es: "+numero);
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println("El valor de i es: "+i);
			/*if (i==5)
			{
				System.out.println("Se ha alcanzado el valor 5, se sale del bucle");
				break;
			}*/
		}
		
		for(int i=0;i<10 && i!=5 ;i++)
		{
			System.out.println("---->El valor de i es: "+i);
			
		}
		
		
		
		
		
		
		
		int lineas=0;
		do
		{
			System.out.println("********");
			lineas++;
		}while(lineas<8);
		
		
		char letra='a';
		for(int i=0;i<26;i++)
		{
			System.out.print(letra+" ");
			letra++;
		}
		for(int filas=0;filas<=5;filas++)
		{
			for(int columnas=0;columnas<=filas;columnas++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
