package archivos;

import java.io.File;

public class CreateDirs {

	public static void main(String[] args) {
		File directorio = new File("directorio_nuevo\\Alvaro_chucklador");
		if (!directorio.exists()) {
			if (directorio.mkdirs()) {
				System.out.println("Directorio creado");
			} else {
				System.out.println("error al crear el directorio");
			}
		}
	}

}
