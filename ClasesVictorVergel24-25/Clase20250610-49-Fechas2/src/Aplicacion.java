import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.parse("2025-06-10");
		System.out.println("Fecha: " + date);
		System.out.println(date.plusDays(5));
		
		DayOfWeek diaDeLaSemana=date.getDayOfWeek();
		System.out.println("Día de la semana: " + diaDeLaSemana);		
		
		System.out.println(LocalDate.of(2020, 6, 23).isAfter(date));
		
		
		String patronFecha= "dd/MM/YYYY";
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern(patronFecha);
		LocalDate fechaHoy2= LocalDate.now();
		String fechaFormateada = fechaHoy2.format(formatoFecha);
		System.out.println("Fecha formateada: " + fechaFormateada);
		
		
		LocalDate fechaInicial = LocalDate.of(2020, 1, 1);
		LocalDate fechaFinal = LocalDate.of(2020, 12, 31);
		
		System.out.println("Dias entre fechas:"+Duration.between(fechaInicial.atStartOfDay(), fechaFinal.atStartOfDay()).toDays());
		
		int dias=LocalDate.now().until(LocalDate.of(2025, 6, 16)).getDays();
		System.out.println("Días hasta el 10 de junio de 2025: " + dias);
		
		long dias2=ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
		System.out.println(dias2);
		
		Stream.iterate(fechaInicial, fecha -> fecha.plusDays(1)).limit(10).forEach(System.out::println);
		
		
		
		ArrayList<LocalDate> listadoFechas=Stream.iterate(fechaInicial, fecha -> fecha.plusDays(1)).limit(20).collect(Collectors.toCollection(ArrayList::new));
		System.out.println("----------------");
		listadoFechas.forEach(System.out::println);
		System.out.println("----------------");
		listadoFechas.stream().filter(fecha -> fecha.getDayOfWeek() == DayOfWeek.MONDAY).forEach(System.out::println);
		
		
		
	}

}
