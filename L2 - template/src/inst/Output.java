package inst;

import pilas.State;

public class Output extends InstruccionesAbs{

	@Override
	public State execute(State state) {
		System.out.println(state.pop());
        state.setIp(state.getIp() + 1);        
        return state;
	}

}
