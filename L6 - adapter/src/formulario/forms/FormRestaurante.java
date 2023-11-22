package formulario.forms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Restaurante;

public class FormRestaurante implements FormsEditable {

	private Restaurante restaurante;

	public FormRestaurante(Restaurante res) {
		this.restaurante = res;
		this.consola = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public void editar() {
		System.out.println("Editando Restaurante.");

		System.out.println("Valores actuales:");
		imprime();

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print("- Nombre: ");
		String texto = getLínea();
		if (texto.length() > 0)
			restaurante.setNombre(texto);

		System.out.print("- Dirección: ");
		texto = getLínea();
		if (texto.length() > 0)
			restaurante.setDirección(texto);

		System.out.println("Valores finales:");
		imprime();

	}

	@Override
	public void imprime() {
		System.out.println("- Nombre = " + restaurante.getNombre());
		System.out.println("- Dirección = " + restaurante.getDirección());

	}

	private String getLínea() {
		do {
			try {
				return consola.readLine();
			} catch (IOException ex) {
				System.out.println("Error de lectura. Inténtelo de nuevo.");
			}
		} while (true);
	}

	BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

}

