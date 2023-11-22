package pilas;

public class State {

	private int ip; // apunta a la instruccion que esta

    private int[] memoria;

    private int[] pila;
    private int sp; // apunta a la cima de la pila
    
    public State() {
    	ip = 0;
    	memoria = new int[1024];
    	pila = new int[32];
    	sp = 0;
    }
    
    public void push(int valor) {
        pila[sp] = valor;
        sp++;
    }

    public int pop() {
        sp--;
        return pila[sp];
    }
    
    public void setMemoria(int pos) {
    	push(memoria[pos]);
    }
    
    public void setMemoriaValue(int pos, int val) {
    	memoria[pos] = val;
    }
    
    public int getMemoria(int pos) {
    	return memoria[pos];
    }
    
    public int getIp() {
    	return ip;
    }
    
    public void setIp(int newIP) {
    	this.ip = newIP;
    }
}
