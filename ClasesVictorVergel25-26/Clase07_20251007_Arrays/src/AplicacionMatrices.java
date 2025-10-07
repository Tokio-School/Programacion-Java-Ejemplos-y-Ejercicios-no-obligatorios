
public class AplicacionMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		imprimirMatriz(matriz);
		
		int[][] matriz2=new int[5][5];
		for(int i=0;i<5;i++) { //recorre filas
			for(int j=0;j<5;j++) { //recorre columnas
				matriz2[i][j]=i*j;
			//	System.out.print(matriz2[i][j] + " ");
			}
			//System.out.println();
		}
		imprimirMatriz(matriz2);
		
	}
	public static void imprimirMatriz(int[][] matrizInterna) {
		
		for(int i=0;i<matrizInterna.length;i++) { //recorre filas
			//System.out.println(matriz[i][0] + " " + matriz[i][1] + " " + matriz[i][2]);
			for(int j=0;j<matrizInterna[0].length;j++) { //recorre columnas
				System.out.print(matrizInterna[i][j] + " ");
			}
			System.out.println();
		}
	}

}
