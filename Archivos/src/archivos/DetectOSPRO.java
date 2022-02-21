package archivos;

public class DetectOSPRO {

	public static void main(String[] args) {
		System.out.println(getOperatingSystem());

	}
public static String getOperatingSystem() {
	String os = System.getProperty("os.name");
	return os;
}
}
