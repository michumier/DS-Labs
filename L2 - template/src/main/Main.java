package main;

/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

import java.io.*;
import java.util.*;

import load.ProgramLoader;
import pilas.Executer;

public class Main {

	public static void main(String[] args) throws Exception {

		Executer exe = new Executer("fibonacci.txt");
		exe.execute();

		// CARGA EL PROGRAMA EN PROGRAMLOADER
		// PASAR EL PROGRAMA AL EXECUTER
		// EL EXECUTER DEBE TENER EL ESTADO DE LA PILA EN CADA MOMENTO PARA MODIFICARLA
		// CON INSTRUCTION SE LLAMA A LAS INSTRUCCIONES
	}

}
