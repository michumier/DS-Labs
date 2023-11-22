/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

package main;

import java.io.IOException;

import fileSystem.FileSystem;
import modificaciones.ContadorCaracteres;
import modificaciones.EliminarEspacios;
import modificaciones.Encriptar;
import modificaciones.Normalizar;
import outputs.BluetoothOutput;
import outputs.FileOutput;
import outputs.InternetOutput;

public class Main {

	public static void main(String[] args) throws IOException {
		FileSystem fs = new FileSystem();

		// validaciones!!! strategy!!!!
		fs.copy("privado.txt", new Normalizar(new FileOutput("copia.txt")));
		fs.copy("privado.txt", new EliminarEspacios(new InternetOutput("1.1.1.1")));
		fs.copy("privado.txt", new Encriptar(new BluetoothOutput("iPhone")));

		// MODIFICACION 1
		fs.copy("privado.txt", new Normalizar(new Encriptar(new FileOutput("copia.txt"))));

		// MODIFICACION 2
		fs.copy("privado.txt", new Encriptar(new Normalizar(
				new EliminarEspacios(new InternetOutput("copia.txt")))));
		
		// MODIFICACION 3 CUENTA DESPUES
		ContadorCaracteres counter = new ContadorCaracteres(new InternetOutput("156.17.11.196"));
		fs.copy("privado.txt", new Encriptar(counter));
		System.out.println("Modificacion 3: " + counter.getCont());
		
		// MODIFICACION 4 CUENTA ANTES
		ContadorCaracteres counter2 = new ContadorCaracteres(new Encriptar(new InternetOutput("156.17.11.196")));
		fs.copy("privado.txt", counter2);
		System.out.println("Modificacion 4: " + counter2.getCont());

	}

}
