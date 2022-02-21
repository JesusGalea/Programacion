package archivos;

public class DetectOS {
private static String OS = System.getProperty("os.name").toLowerCase();
	
	public static void main(String[] args) {
		
		System.out.println("os.name: " + OS);
		
		if(isWindows()) {
			System.out.println("this is Windows");
		} else if (isMac()) {
			System.out.println("mac");		
		} else if (isUnix()) {
			System.out.println("unix");
		} else if (isSolaris()) {
			System.out.println("solaris");
		} else {
			System.out.println("OS no soportado");
		}
	}
public static boolean isWindows() {
	return (OS.indexOf("win" )>= 0);
}

public static boolean isMac () {
	return (OS.indexOf("mac") >= 0);
}

public static boolean isUnix () {
	return (OS.indexOf("nix") >= 0) || OS.indexOf("nux") >=0 || OS.indexOf("aix") >= 0;
}

public static boolean isSolaris () {
	return (OS.indexOf("sunos") >= 0);
}
}
