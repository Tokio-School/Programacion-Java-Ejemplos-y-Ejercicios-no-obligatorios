package ejem03_ejemploProyectoHerencia;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pepe=new Persona("Pepe");
		Curso java=new Curso();
		java.setNombre("java");
		pepe.setMatricula(java);
		
		Asignatura poo=new Asignatura("Programación orientada a objetos");
		Asignatura sintaxis= new Asignatura("Sintaxis java");
		
		java.setAsignaturas(poo,sintaxis);
		
		Calificacion nota1=new Calificacion(sintaxis, 2);
		Calificacion nota2=new Calificacion(poo, 30);
		
		pepe.setCalificaciones(nota1,nota2);
		
		pepe.sobonar();
		
		
		System.out.println(pepe);
		System.out.println(java.calcularPrecio());
		
	}

}
