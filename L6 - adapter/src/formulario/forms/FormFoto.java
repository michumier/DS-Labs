package formulario.forms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Foto;

public class FormFoto implements FormsEditable {

	private Foto foto;

	public FormFoto(Foto foto) {
		this.foto = foto;
		this.consola = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public void editar() {
		System.out.println("Editando Foto.");

		System.out.println("Valores actuales:");
		imprime();

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print("- Usuario: ");
		String texto = getLínea();
		if (texto.length() > 0)
			foto.setUsuario(texto);

		System.out.print("- Descripción: ");
		texto = getLínea();
		if (texto.length() > 0)
			foto.setDescripción(texto);

		System.out.println("Valores finales:");
		imprime();

	}

	@Override
	public void imprime() {
		System.out.println("- Usuario = " + foto.getUsuario());
		System.out.println("- Descripción = " + foto.getDescripción());

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

