package inst;

import pilas.State;

public class Jump extends InstruccionesAbs{
	
	private String dir;

	public Jump(String dirpam) {
		dir = dirpam;
	}

	@Override
	public State execute(State state) {
        state.setIp(Integer.parseInt(dir));
		return state;
	}

}
