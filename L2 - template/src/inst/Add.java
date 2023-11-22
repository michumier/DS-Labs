package inst;

import pilas.State;

public class Add extends InstruccionesAbs{

	@Override
	public State execute(State state) {
		state.push(state.pop() + state.pop());
        state.setIp(state.getIp() + 1);
        return state;
	}

}
