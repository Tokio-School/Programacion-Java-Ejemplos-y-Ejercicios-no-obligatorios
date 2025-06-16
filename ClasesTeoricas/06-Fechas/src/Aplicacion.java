import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha = LocalDate.now();
		LocalDate fecha2=fecha.minusDays(1);
		System.out.println(fecha);
		System.out.println(fecha2.plusDays(1));
		
		LocalDate fecha3 = LocalDate.of(2020, 1, 1);
		System.out.println(fecha3.getDayOfWeek());
		
		//DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE", new Locale("es","ES"));
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEE", new Locale("es","ES"));
		String diaSemana=fecha3.format(formato);
		System.out.println(diaSemana);
		
		
		System.out.println(fecha3.isBefore(fecha2));
		
		Period periodo = Period.between(fecha3, fecha2);
		System.out.println(periodo.getYears() + " años, " + periodo.getMonths() + " meses, " + periodo.getDays() + " días");
		
		Duration duracion = Duration.between(LocalDateTime.of(fecha3, LocalTime.of(8, 8)), fecha2.atStartOfDay());
		System.out.println(duracion.toDays() + " días");
		System.out.println(duracion.toMinutes() + " minutos");
		
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", new Locale("es","ES"));
		System.out.println(LocalDateTime.now().format(formato2));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una fecha (dd/MM/yyyy): ");
		//String fechaIntroducida = scanner.nextLine();
		//LocalDate fechaIntroducidaDate = LocalDate.parse(fechaIntroducida, DateTimeFormatter.ofPattern("d/M/yy", new Locale("es","ES")));
		//System.out.println("Fecha introducida: " + fechaIntroducidaDate);
		
		
		ZonedDateTime fechaMadrid=ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
		
		ZonedDateTime proximoLunes= fechaMadrid.with(LocalDate.now().getDayOfWeek().plus(1));
		System.out.println(LocalDate.of(2025, 6, 17).with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
		
		
		LocalDate inicio= LocalDate.of(2025, 6, 17);
		LocalDate fin = LocalDate.of(2025, 6, 16);
		
		Stream.iterate(inicio, date -> date.plusDays(1)).limit(ChronoUnit.DAYS.between(inicio, fin) + 365)
				.forEach(System.out::println);
		
		Stream.iterate(inicio, d-> d.plusDays(10)).map(LocalDate::getMonth).limit(10).forEach(System.out::println);
		
		
		//int dias= (int) LocalDate.now().until(LocalDate.parse(LocalDate.of(2026,2,3)),ChronoUnit.DAYS);
		//int dias=(int) LocalDate.now().until(LocalDate.parse(LocalDate.of(2026,2,3)), java.time.temporal.ChronoUnit.DAYS);
		
		int dias=(int) ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(2026,2,3));
		System.out.println("Días hasta el 3 de febrero de 2026: " + dias);
		
		System.out.println(inicio.toEpochDay() - LocalDate.now().toEpochDay());
	}

}
