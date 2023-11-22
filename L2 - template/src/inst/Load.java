package inst;

import pilas.State;

public class Load extends InstruccionesAbs{

	@Override
	public State execute(State state) {
		int direccion = state.pop();
        state.push(state.getMemoria(direccion));
		state.setIp(state.getIp() + 1);
        return state;
	}

}
