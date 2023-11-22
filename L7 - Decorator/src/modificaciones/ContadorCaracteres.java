package modificaciones;

import java.io.IOException;

import fileSystem.Output;

public class ContadorCaracteres extends AbsMod implements Output {

	private int cont;
	
	public ContadorCaracteres(Output out) {
		super(out);
	}

	@Override
	public void send(char c) throws IOException {
		if(c != ' ') {
			output.send(c);
			cont++;
		}
	}
	
	public int getCont() {
		return cont;
	}

}
