package modificaciones;

import java.io.IOException;

import fileSystem.Output;

public class Normalizar extends AbsMod implements Output {

	public Normalizar(Output out) {
		super(out);
	}

	@Override
	public void send(char c) throws IOException {
		if (c != '\r') {
			output.send(c);
		}
	}

}