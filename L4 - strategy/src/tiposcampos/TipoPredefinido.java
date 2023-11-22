package tiposcampos;

import campos.Campo;

public class TipoPredefinido implements Campo{
	
	private String texto;
    private String[] valores;
    
    public TipoPredefinido(String eti, String... val) {
    	this.texto = eti;
    	this.valores = val;
    }

	@Override
	public boolean comprueba() {
		for (String valor : valores) {
            if (texto.toLowerCase().equals(valor.toLowerCase())) {
                return true;
            }
        }
		return false;
		
	}

	@Override
	public String getDato() {
		return texto;
	}

}
