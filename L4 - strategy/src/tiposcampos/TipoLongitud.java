package tiposcampos;

import campos.Campo;

public class TipoLongitud implements Campo {

	private String texto;
	private int longmax;

	public TipoLongitud(String texto, int l) {
		this.texto = texto;
		this.longmax = l;
	}

	@Override
	public boolean comprueba() {
		if (texto.length() != longmax) {
			return false;
		}
		return true;

	}

	@Override
	public String getDato() {
		return texto;
	}

}
