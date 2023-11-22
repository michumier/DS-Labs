package inst;

import pilas.State;

public class Push extends InstruccionesAbs {

	private String parsea;

	public Push(String p) {
		parsea = p;
	}

	@Override
	public State execute(State state) {
		state.push(Integer.parseInt(parsea));
		state.setIp(state.getIp() + 1);
		return state;
	}

}
