package tiposcampos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import campos.Campo;

public class CampoValida {

	private String textoImprimir;
	private Campo[] campos;
	private String texto;

	public CampoValida(String tx, Campo... c) {
		this.textoImprimir = tx;
		this.campos = c;
	}

	public void pideData() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = true;
			try {
				System.out.print(textoImprimir + ": ");
				texto = consola.readLine();

				for (Campo c : campos) {
					if (c.comprueba()) {
						valido = true;
					}
				}

			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}
	
	public String getDato() {
		return texto;
	}

}
