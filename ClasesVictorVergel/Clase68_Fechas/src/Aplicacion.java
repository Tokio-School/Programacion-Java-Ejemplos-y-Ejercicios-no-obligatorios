import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fechaHoy = LocalDate.now();
		
		fechaHoy = fechaHoy.plusDays(5);
		
		System.out.println(fechaHoy.getDayOfMonth() + "/" + fechaHoy.getMonthValue() + "/" + fechaHoy.getYear());
		
		LocalDate fecha2=LocalDate.of(2021, 12, 25);
		System.out.println(fecha2.minusYears(3));
		
		
		
		if (fechaHoy.isAfter(fecha2))
			System.out.println("La fecha de hoy es posterior a la fecha 2");
		else
			System.out.println("La fecha de hoy es anterior a la fecha 2");
		
		String patternFecha="dd/MM/YYYY";
		DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern(patternFecha);
		String cadenaFecha2=fecha2.format(formatoFecha);
		System.out.println(cadenaFecha2);
		
		
		String date1="16/Aug/2016";
		System.out.println(Locale.getDefault());
		
		LocalDate fecha3=LocalDate.of(2023, Month.NOVEMBER, 23);
		
		long diasTranscurridos=Duration.between(fecha2.atStartOfDay(), fecha3.atStartOfDay()).toDays();
		System.out.println(diasTranscurridos);
		
		LocalDateTime fechaHora=LocalDateTime.now();
		System.out.println(fechaHora);
		
		System.out.println(fechaHora.getHour());
		
		
		Stream.iterate(fecha3, fecha -> fecha.plusDays(1)).limit(10).forEach(System.out::println);
		
		
		
		
	}

}
