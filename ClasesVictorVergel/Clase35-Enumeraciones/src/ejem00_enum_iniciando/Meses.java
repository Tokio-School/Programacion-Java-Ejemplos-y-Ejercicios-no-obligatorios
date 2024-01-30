package ejem00_enum_iniciando;

import java.util.Random;

public enum Meses {
	ENERO(1),FEBRERO(2),MARZO(3),ABRIL(4),MAYO(5);

	private int mes;
	
	Meses(int i) {
		// TODO Auto-generated constructor stub
		mes=i;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public static Meses obtenerPorNumero(int i) throws Exception
	{
		//Meses[] meses=values();
		for (Meses mes : values()) {
			if (mes.getMes()==i)
				return mes;
		}

		throw new Exception("Ese mes no existe");
	}
	
	
	
	public static Meses obtenerMesAletarorio()
	{
		Random aleatorio=new Random();
		return values()[aleatorio.nextInt(1, 5)];
	}
	

	

}
