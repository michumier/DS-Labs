package form;

import java.util.ArrayList;
import java.util.List;

import campos.Campo;
import tiposcampos.CampoValida;

public class Formulario {

	private List<CampoValida> campos = new ArrayList<CampoValida>();

	public void addCampo(CampoValida campo) {
		campos.add(campo);
	}

	public void pideDatos() {
		for (CampoValida campo : campos) {
			campo.pideData();
			System.out.println(campo.getDato());
		}
	}

	

}
