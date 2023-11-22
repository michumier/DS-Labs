package tiposcampos;

import campos.Campo;

public class TipoTexto implements Campo{
	
	private String texto;
	
	public TipoTexto(String t) {
		this.texto = t;
	}

	@Override
	public boolean comprueba() {
		for (char ch : texto.toCharArray()) {
			if (!Character.isLetter(ch)) {
				System.out.println("Introduzca texto sin números");
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

