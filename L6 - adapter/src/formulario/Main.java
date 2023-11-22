package formulario;

import formulario.forms.FormFoto;
import formulario.forms.FormMonumento;
import formulario.forms.FormRestaurante;
import google.maps.Coordenadas;
import model.Foto;
import model.Monumento;
import model.Restaurante;

public class Main {

    public static void main(String[] args) {

        Monumento monumento = new Monumento("Coliseo", "Vespasiano", "Avenida del Coliseo 1. Roma");
        Restaurante restaurante = new Restaurante("Mario", "Via della Dataria. Roma", "555 123 457");
        Foto foto = new Foto("Raúl", "Un perro mordiendo a un turista", new Coordenadas(40, 40));

        MiniFormulario formulario = new MiniFormulario();
        formulario.editar(new FormMonumento(monumento));
        formulario.editar(new FormFoto(foto));
        formulario.editar(new FormRestaurante(restaurante));
        
        // Tarea 1. Editar también restaurante. Que se puedan editar el nombre y la dirección del mismo.

        // Tarea 2. Editar también foto. Que se puedan editar el usuario y la descripción de la misma.

        // NOTA: Para simplificar, suponer que siempre se van a pedir sólo dos campos en todo formulario
    }

}
