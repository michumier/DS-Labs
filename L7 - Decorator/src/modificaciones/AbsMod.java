package modificaciones;

import java.io.IOException;

import fileSystem.Output;

public abstract class AbsMod implements Output {

	protected Output output;

	public AbsMod(Output output) {
		this.output = output;
	}

	public void close() throws IOException {
		output.close();
	}

}
