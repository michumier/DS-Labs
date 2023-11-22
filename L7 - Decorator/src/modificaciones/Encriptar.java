package modificaciones;

import java.io.IOException;

import fileSystem.Output;

public class Encriptar extends AbsMod implements Output {

	public Encriptar(Output out) {
		super(out);
	}

	@Override
	public void send(char c) throws IOException {
		output.send((char) (Character.isLetterOrDigit(c) ? c + 1 : c));

	}


}