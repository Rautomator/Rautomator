package rautomator.st;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LecturaCSV {
	public static final String SEPARADOR = ",";
	public static final String COMILLAS = "\"";

	public static void main(String[] args) throws IOException {

		BufferedReader fichero = new BufferedReader(new FileReader("src/main/resources/files/swimming_pools.csv"));
		String linea = fichero.readLine();
		while (null != linea) {
			String[] campos = linea.split(SEPARADOR);
			campos = eliminarComillas(campos);
			linea = fichero.readLine();
			System.out.println(Arrays.toString(campos));

		}

	}

	private static String[] eliminarComillas(String[] campos) {

		String res[] = new String[campos.length];

		for (int i = 0; i < res.length; i++) {
			res[i] = campos[i].replaceAll(COMILLAS, "");
		}
		return res;
	}

}
