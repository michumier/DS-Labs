package tiposcampos;

import campos.Campo;

public class TipoRango implements Campo {

	private int min, max, dato;
	private String texto;

	public TipoRango(int mini, int maxi, String t) {
		this.max = maxi;
		this.min = mini;
		this.texto = t;
		this.dato = Integer.parseInt(texto);
	}

	@Override
	public boolean comprueba() {
		if (dato < min || dato > max) {
			System.out.println("Introduzca un valor entre 800 y 1200");
			return false;

		}
		return true;
	}

	@Override
	public String getDato() {
		return texto;
	}

}
