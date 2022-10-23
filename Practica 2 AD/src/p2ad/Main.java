package p2ad;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		Logica lg = new Logica();
		try {
			lg.insertar("Jesusa", "pollita", 1);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

}
