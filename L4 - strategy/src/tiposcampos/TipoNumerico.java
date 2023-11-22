package tiposcampos;

import campos.Campo;

public class TipoNumerico implements Campo {
	
	private String texto;
	
	public TipoNumerico(String t) {
		this.texto = t;
	}

	@Override
	public boolean comprueba() {
		for (char ch : texto.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public String getDato() {
		return texto;
	}

}
