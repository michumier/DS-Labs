package editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import tools.Herramienta;

public class Editor {

    private Dibujo dibujo;

    private Herramienta herrSelec; // la herramienta que esta seleccionada
    
    public Editor() {
        dibujo = new Dibujo();
    }

    public void dibujar() {
        // Dibujar menú
        // Dibujar barra de herramientas lateral
        // Dibujar línea de estado
        dibujo.dibujar();
    }

    public void run() throws IOException {

        System.out.println("Comandos de Herramientas: cuadrado | circulo | triangulo | seleccion");
        System.out.println("Comandos de Ratón: pinchar x,y | mover x,y | soltar x,y");
        System.out.println("Otros Comandos: dibujar | exit");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // LECTURA DE COMANDO

        do {
            System.out.print(">");
            String[] line = in.readLine().split("[ ,]");

            if (line[0].equals("exit"))
                return;
            if (line[0].equals("cuadrado"))
                ; // COMIENZA LA ACCION DE CREAR EL CUADRADO
            else if (line[0].equals("circulo"))
                ; // COMIENZA LA ACCION DE CREAR EL CIRCULO
            else if (line[0].equals("triangulo"))
                ; // COMIENZA LA ACCION DE CREAR EL TRIANGULO
            else if (line[0].equals("seleccion"))
                ; // DEJA LA ACCION QUE ESTE HACIENDO PARA SELECCIONAR
            
            
            else if (line[0].equals("pinchar")) {
                int x = Integer.parseInt(line[1]);
                int y = Integer.parseInt(line[2]);
                //	PARA COMENZAR A DIBUJAR LAS FIGURAS O SELECCIONAR
            } else if (line[0].equals("mover")) { // Esto es mover el ratón
                int x = Integer.parseInt(line[1]);
                int y = Integer.parseInt(line[2]);
                //	SIGUE SELECCIONADO AUNQUE CAMBIE LA POSICION DE LA FIGURA
            } else if (line[0].equals("soltar")) {
                int x = Integer.parseInt(line[1]);
                int y = Integer.parseInt(line[2]);
                //	UNA VEZ TENGA LAS COORDENADAS DE SOLTAR SE ACABA LA ACCION  DE CREAR MOVER O PINCHAR
                
                
            } else if (line[0].equals("dibujar"))
                dibujar(); // QUE MUESTRE LOS ELEMENTOS QUE ESTÁN DIBUJADOS
            else
                System.out.println("Comando no válido");

        } while (true);
    }

    public void setDibujo(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    public Dibujo getDibujo() {
        return dibujo;
    }

}
