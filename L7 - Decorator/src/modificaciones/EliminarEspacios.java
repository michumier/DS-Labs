package modificaciones;

import java.io.IOException;

import fileSystem.Output;

public class EliminarEspacios extends AbsMod implements Output {
		
	private char lastChar = 0;

	public EliminarEspacios(Output out) {
		super(out);
	}

	@Override
	public void send(char c) throws IOException {
		if(c != ' ' && lastChar == ' ')
			return;
			
			output.send(c);	
			lastChar = c; // SE PUEDE HACER ESTO PORQUE SOLO SE CREA UN OBJETO
			
	}

}
