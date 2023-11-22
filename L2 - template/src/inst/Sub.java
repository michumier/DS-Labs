package inst;

import pilas.State;

public class Sub extends InstruccionesAbs{

	@Override
	public State execute(State state) {
		int b = state.pop();
        int a = state.pop();
        state.push(a - b);
		state.setIp(state.getIp() + 1);
		return state;
	}

}
