package formulario.forms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Monumento;

public class FormMonumento implements FormsEditable {

	private Monumento monumento;

	public FormMonumento(Monumento monumento) {
		this.monumento = monumento;
		this.consola = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public void editar() {
		System.out.println("Editando Monumento.");

		System.out.println("Valores actuales:");
		imprime();

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print("- Autor: ");
		String texto = getLínea();
		if (texto.length() > 0)
			monumento.setAutor(texto);

		System.out.print("- Dirección: ");
		texto = getLínea();
		if (texto.length() > 0)
			monumento.setDirección(texto);

		System.out.println("Valores finales:");
		imprime();

	}

	@Override
	public void imprime() {
		System.out.println("- Autor = " + monumento.getAutor());
		System.out.println("- Dirección = " + monumento.getDirección());

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
