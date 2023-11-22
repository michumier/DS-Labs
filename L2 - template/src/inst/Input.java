package inst;

import java.util.Scanner;

import pilas.State;

public class Input extends InstruccionesAbs{

    private static Scanner console = new Scanner(System.in);

	
	@Override
	public State execute(State state) {
		System.out.println("Escriba un entero:");
        state.push(console.nextInt());
        state.setIp(state.getIp() + 1);                
        return state;
	}

}
