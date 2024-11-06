package ejemplo02_switch;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version = System.getProperty("java.version");
		String vendor = System.getProperty("java.vendor");
		String vmVersion = System.getProperty("java.vm.version");
		String vmVendor = System.getProperty("java.vm.vendor");
		System.out.println("Java Version: " + version);
		System.out.println("Java Vendor: " + vendor);
		System.out.println("Java VM Version: " + vmVersion);
		System.out.println("Java VM Vendor: " + vmVendor);

		System.out.println(convertirAString(10));

	}

	static Object convertirAString(Object obj) {

		return switch (obj) {
		case Integer i -> i.toString();
		case String s -> s;
		case Double d -> d.toString();
		case Long l -> l.toString();
		default -> obj.toString();
		};
	}

}
