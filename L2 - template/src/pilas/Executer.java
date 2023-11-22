package pilas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import load.ProgramLoader;

public class Executer {

	private State state;
    private List<Instruction> instrucciones = new ArrayList<>();

	
	public Executer(String prog) throws IOException {
		state = new State();
		ProgramLoader pl = new ProgramLoader(prog);
		instrucciones = pl.cargaInstruccion(prog);
	}
	
	public void execute() {
		while(instrucciones.size() > state.getIp()) {
			instrucciones.get(state.getIp()).execute(state);
		}
	}
	
	
}
