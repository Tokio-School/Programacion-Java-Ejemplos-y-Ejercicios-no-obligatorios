package ejem02_ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/**1Gestión de Empleados:
En una empresa, tienes una lista de empleados. 
Cada empleado tiene un salario. Escribe un programa
 que calcule el salario total de todos los empleados
  cuyos salarios sean mayores que cierto umbral.*/
		ArrayList<Empleado> empleados = new ArrayList<>();
		empleados.add(new Empleado("Juan",1800.5));
		empleados.add(new Empleado("Pedro",1500.5));
		empleados.add(new Empleado("Maria",2000.5));
		empleados.add(new Empleado("Ana",1600.5));
		empleados.add(new Empleado("Luis",1700.5));
		empleados.add(new Empleado("Carlos",1900.5));
		empleados.add(new Empleado("Pablo",1800.5));
		
		//Stream<Double> datos=
		System.out.println(empleados.stream()
			.filter(e->e.getSalario()>1700)
			.mapToDouble(e->e.getSalario())
			.sum());
		//DoubleStream datos2;	
		


/**2Gestión de Productos en un Supermercado:
En un supermercado, tienes una lista de productos. 
Algunos productos tienen descuento. Escribe un 
programa que calcule el precio total después de 
aplicar el descuento a los productos.*/

		Stream<Producto> productos = Stream.of(
		new Producto("Leche", 1.5,0.1,10),
		new Producto("Pan", 1.0,0.2,20),
		new Producto("Huevos", 3.5,0.3,30),
		new Producto("Azucar", 2.5,0.4,40),
		new Producto("Sal", 1.5,0.5,50),
		new Producto("Aceite", 4.5,0.6,60),
		new Producto("Arroz", 3.5,0.7,70));
		
		productos
		.forEach(p->System.out.println(new Producto(
								p.getNombre(),
								p.getPrecio()*(1-p.getDescuento()),
								0,
								p.getCantidad())));
		
		
		

/**3Filtrado de Datos de Estudiantes:
Tienes una lista de estudiantes con sus calificaciones 
en diferentes materias. Escribe un programa que 
encuentre a los estudiantes que hayan aprobado todas
 las materias.*/
		Estudiante estudiantes[]=new Estudiante[8];
		estudiantes[0]=new Estudiante("Juan",new ArrayList<Double>(List.of(8.5,9.5,10.0,8.0,2.0)));
		estudiantes[1]=new Estudiante("Pedro",new ArrayList<Double>(List.of(3.5,9.5,10.0,8.0,9.0)));
		estudiantes[2]=new Estudiante("Maria",new ArrayList<Double>(List.of(8.5,9.5,10.0,8.0,9.0)));
		estudiantes[3]=new Estudiante("Ana",new ArrayList<Double>(List.of(8.5,9.5,10.0,8.0,9.0)));
		estudiantes[4]=new Estudiante("Luis",new ArrayList<Double>(List.of(8.5,9.5,4.0,8.0,9.0)));
		estudiantes[5]=new Estudiante("Carlos",new ArrayList<Double>(List.of(8.5,9.5,10.0,8.0,4.0)));
		estudiantes[6]=new Estudiante("Pablo",new ArrayList<Double>(List.of(8.5,9.5,3.0,8.0,9.0)));
		estudiantes[7]=new Estudiante("Sofia",new ArrayList<Double>(List.of(8.5,9.5,10.0,8.0,1.0)));

		
		Arrays.stream(estudiantes)
			  .filter(e->e.getCalificaciones().stream().allMatch(nota->nota>=5))
			  .forEach(System.out::println);
		
		

/**4Gestión de Pedidos en un Restaurante:
En un restaurante, tienes una lista de pedidos con 
el importe total de cada uno. Escribe un programa 
que encuentre el pedido de mayor importe.*/
		ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1,150.5,new ArrayList<Producto>(List.of(
                new Producto("Leche", 1.5,0.1,10),
                new Producto("Pan", 1.0,0.2,20),
                new Producto("Huevos", 3.5,0.3,30)))));
        pedidos.add(new Pedido(2,250.5,new ArrayList<Producto>(List.of(
                new Producto("Azucar", 2.5,0.4,40),
                new Producto("Sal", 1.5,0.5,50),
                new Producto("Aceite", 4.5,0.6,60)))));
        pedidos.add(new Pedido(3,350.5,new ArrayList<Producto>(List.of(
                new Producto("Arroz", 3.5,0.7,70),
                new Producto("Leche", 1.5,0.1,10),
                new Producto("Pan", 1.0,0.2,20)))));
        pedidos.add(new Pedido(4,450.5,new ArrayList<Producto>(List.of(
                new Producto("Huevos", 3.5,0.3,30),
                new Producto("Azucar", 2.5,0.4,40),
                new Producto("Sal", 1.5,0.5,50)))));
        pedidos.add(new Pedido(5,550.5,new ArrayList<Producto>(List.of(
                new Producto("Aceite", 4.5,0.6,60),
                new Producto("Arroz", 3.5,0.7,70),
                new Producto("Leche", 1.5,0.1,10)))));
        pedidos.add(new Pedido(6,650.5,new ArrayList<Producto>(List.of(
                new Producto("Pan", 1.0,0.2,20),
                new Producto("Huevos", 3.5,0.3,30),
                new Producto("Azucar", 2.5,0.4,40)))));

        pedidos.stream()
        	/*.max(new Comparator<Double>(){

				@Override
				public int compare(Double o1, Double o2) {
					// TODO Auto-generated method stub
					return o1.compareTo(o2);
				}
        		
        	});*/
            .max(Comparator.comparing(Pedido::getImporteTotal))
            .ifPresent(System.out::println);

        Pedido pedidoMax=pedidos.stream()
    	    .max(Comparator.comparing(Pedido::getImporteTotal))
    	    .orElseGet(()->new Pedido(0,0.0,new ArrayList<Producto>()));
        System.out.println(pedidoMax);


/**5Filtrado de Libros por Género:
Tienes una biblioteca con una lista de libros. Cada 
libro tiene un género. Escribe un programa que filtre
 los libros por un género específico.*/
        Stream<Libro> libros = Stream.of(
        new Libro("El principito","Novela"," Antoine de Saint-Exupéry"),
        new Libro("Don Quijote de la Mancha","Novela","Miguel de Cervantes"),
        new Libro("El Hobbit","Fantasia","J.R.R. Tolkien"),
        new Libro("El Señor de los Anillos","Fantasia","J.R.R. Tolkien"),
        new Libro("Cien años de soledad","Novela","Gabriel García Márquez"),
        new Libro("El amor en los tiempos del cólera","Novela","Gabriel García Márquez"),
        new Libro("El Aleph","Cuento","Jorge Luis Borges"),
        new Libro("Ficciones","Cuento","Jorge Luis Borges"),
        new Libro("El túnel","Novela","Ernesto Sabato"),
        new Libro("Sobre héroes y tumbas","Novela","Ernesto Sabato"));

        libros.filter(l->l.getGenero().equals("Cuento")).forEach(System.out::println);
        


/**6Gestión de Transacciones Financieras:
Tienes una lista de transacciones financieras. 
Algunas transacciones son gastos y otras son 
ingresos. Escribe un programa que calcule el 
balance total.*/
        
        ArrayList<Transaccion> transacciones = new ArrayList<>();
        transacciones.add(new Transaccion(1,Transaccion.TipoTransaccion.INGRESO,150.5));
        transacciones.add(new Transaccion(2,Transaccion.TipoTransaccion.GASTO,250.5));
        transacciones.add(new Transaccion(3,Transaccion.TipoTransaccion.INGRESO,350.5));
        transacciones.add(new Transaccion(4,Transaccion.TipoTransaccion.GASTO,450.5));
        

        System.out.println(transacciones.stream()
        	.mapToDouble(t->t.getTipo()==Transaccion.TipoTransaccion.INGRESO?t.getCantidad():-t.getCantidad())
        	.sum());
        

/**7Filtrado de Usuarios por Edad:
Tienes una lista de usuarios con sus edades. Escribe
 un programa que filtre los usuarios menores de 
 cierta edad.*/
            
        Stream<Usuario> usuarios = Stream.of(
        new Usuario("Juan",25,"juan@gmail.com"),
        new Usuario("Pedro",30,"pedro@gmail.com"),
        new Usuario("Maria",20,"maria@gmail.com"),
        new Usuario("Ana",35,"ana@gmail.com"),
        new Usuario("Luis",40,"luis@gmail.com"),
        new Usuario("Carlos",45,"carlos@gmail.com"));
        
        usuarios.filter(u->u.getEdad()<30).forEach(System.out::println);
        

/**8 Gestión de Inventarios en una Tienda:
En una tienda, tienes una lista de productos en 
inventario. Escribe un programa que encuentre el 
producto con la cantidad más alta en inventario.*/

        Stream<Producto> inventario = Stream.of(
        new Producto("Leche", 1.5,0.1,10),
        new Producto("Pan", 1.0,0.2,20),
        new Producto("Huevos", 3.5,0.3,30),
        new Producto("Azucar", 2.5,0.4,40),
        new Producto("Sal", 1.5,0.5,50),
        new Producto("Aceite", 4.5,0.6,60),
        new Producto("Arroz", 3.5,0.7,70));


        Optional<Producto> productoMax=inventario.max(Comparator.comparing(Producto::getCantidad));
        productoMax.ifPresent(System.out::println);
        
        
/**9 Filtrado de Tareas por Prioridad:
Tienes una lista de tareas pendientes con diferentes
 prioridades. Escribe un programa que filtre las 
 tareas por una prioridad específica.*/
        Stream<Tarea> tareas = Stream.of(
        new Tarea("Estudiar",1,new Date(2024,3,30)),
        new Tarea("Recoger pepinos del huerto",3,new Date(2024,4,1)),
        new Tarea("Lavar el coche",3,new Date(2024,5,20)),
        new Tarea("Hacer la compra",1,new Date(2024,3,20)),
        new Tarea("Pasear al perro",2,new Date(2024,3,15)),
        new Tarea("Comprar",2,new Date(2024,3,20)));

        List<Tarea> listaTareas=tareas.filter(t->t.getPrioridad()==1)
            .collect(Collectors.toList());
        


/**10 Gestión de Puntos de Interés en un Mapa:
Tienes una lista de puntos de interés en un mapa. 
Cada punto de interés tiene una categoría. Escribe 
un programa que encuentre todos los puntos de interés
 de una categoría específica.*/
        Stream<PuntoDeInteres> puntosInteres = Stream.of(
        		new PuntoDeInteres("Museo de Bellas Artes",-34.5839152,-58.392915186234 ,"Museo"),
        		new PuntoDeInteres("Cataratas del Niágara",43.0839152,-79.392915186234 ,"Naturaleza"),
        		new PuntoDeInteres("Torre Eiffel",48.8588443,2.2943506,"Monumento"),
        		new PuntoDeInteres("Giralda",37.3874757,-5.9875365,"Monumento"),
        		new PuntoDeInteres("Museo de Louvre",48.8606111,2.337644,"Museo"),
        		new PuntoDeInteres("Ayuntamiento de Valladolid",41.6521343,-4.724859,"Monumento"),
        		new PuntoDeInteres("Central Park",40.785091,-73.968285,"Naturaleza"));
        
		List<PuntoDeInteres> puntosDeInteres = puntosInteres.filter(p -> p.getCategoria().equals("Museo"))
				.collect(Collectors.toList());

	}

}
