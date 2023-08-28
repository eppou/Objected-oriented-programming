package br.uel.singleton;

public class Incremental {
	
	private static Incremental instancia;
	
	private int count = 0;
	
	
	private Incremental(){
		count = 0;
	}
	
	public String toString(){
		return "Incremental "+this.count;
	}
	
	public void incrementar(){
		count++;
	}
	
	public static Incremental getInstance() {
		if( instancia == null) {
			instancia = new Incremental();
		}
		return instancia;
	}

}
