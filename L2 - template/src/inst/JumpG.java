package inst;

import pilas.State;

public class JumpG extends InstruccionesAbs {

	private String dir;

	public JumpG(String dirpam) {
		dir = dirpam;
	}

	@Override
	public State execute(State state) {
		int b = state.pop();
		int a = state.pop();
		if (a > b)
			state.setIp(Integer.parseInt(dir));
		else
			state.setIp(state.getIp() + 1);

		return state;
	}

}
