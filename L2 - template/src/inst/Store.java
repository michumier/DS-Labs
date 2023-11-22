package inst;

import pilas.State;

public class Store extends InstruccionesAbs{

	@Override
	public State execute(State state) {
		int valor = state.pop();
        int direccion = state.pop();
        
        //memoria[direccion] = valor;
        state.setMemoriaValue(direccion,valor);
		state.setIp(state.getIp() + 1);
		return state;
		
	}

}
