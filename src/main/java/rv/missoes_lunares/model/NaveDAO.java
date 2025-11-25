package rv.missoes_lunares.model;

public class NaveDAO {
	
	private String tipo;
	private int numero_de_tripulantes;
	
	public NaveDAO(String tipo, int numero_de_tripulantes) {
		super();
		this.tipo = tipo;
		this.numero_de_tripulantes = numero_de_tripulantes;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getNumero_de_tripulantes() {
		return numero_de_tripulantes;
	}

}
