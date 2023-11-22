package load;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import inst.*;
import pilas.Instruction;

public class ProgramLoader {

	private static List<Instruction> instrucciones = new ArrayList<>();

	public ProgramLoader(String programName) throws IOException {
		BufferedReader fichero = new BufferedReader(new FileReader(programName));

		String linea;
		while ((linea = fichero.readLine()) != null)
			cargaInstruccion(linea);
		fichero.close();

	}

	// $ Cargar programa al array de strings[] --------------------------------
	public List<Instruction> cargaInstruccion(String linea) {
		if (linea.trim().length() == 0)
			return null;

		String[] instruccion = linea.split(" ");

		if (instruccion[0].equals("push")) {
			instrucciones.add(new Push(instruccion[1]));
		} else if (instruccion[0].equals("add")) {
			instrucciones.add(new Add());
		} else if (instruccion[0].equals("sub")) {
			instrucciones.add(new Sub());
		} else if (instruccion[0].equals("mul")) {
			instrucciones.add(new Mul());
		} else if (instruccion[0].equals("jmp")) {
			instrucciones.add(new Jump(instruccion[1]));
		} else if (instruccion[0].equals("jmpg")) {
			instrucciones.add(new JumpG(instruccion[1]));
		} else if (instruccion[0].equals("load")) { // guarda en pila
			instrucciones.add(new Load());
		} else if (instruccion[0].equals("store")) { // guarda en memoria
			instrucciones.add(new Store());
		} else if (instruccion[0].equals("input")) {
			instrucciones.add(new Input());
		} else if (instruccion[0].equals("output")) {
			instrucciones.add(new Output());
		}
		
		return instrucciones;
	}


}
