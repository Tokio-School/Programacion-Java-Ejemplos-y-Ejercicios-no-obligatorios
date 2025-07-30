

public class Ejemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recuperoString(33.4));

		String version = System.getProperty("java.version");
		String vendor = System.getProperty("java.vendor");
		String vmVersion = System.getProperty("java.vm.version");
		String vmVendor = System.getProperty("java.vm.vendor");

		System.out.println("Java Version: " + version);
		System.out.println("Java Vendor: " + vendor);
		System.out.println("Java VM Version: " + vmVersion);
		System.out.println("Java VM Vendor: " + vmVendor);
	}

	static String recuperoString(Object obj) {
		return switch (obj) {
	        case Integer i -> String.format("int %d", i);
	        case Long l    -> String.format("long %d", l);
	        case Double d  -> String.format("double %f", d);
	        case String s  -> String.format("String %s", s);
	        default        -> obj.toString();
    };
	}
}
