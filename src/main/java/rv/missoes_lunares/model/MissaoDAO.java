package rv.missoes_lunares.model;

import rv.missoes_lunares.model.NaveDAO;
import rv.missoes_lunares.model.AstronautaDAO;

import java.util.ArrayList;
import java.util.List;

public class MissaoDAO {
	
	private int codigo;
	private String none;
	private int data;
	private String destino;
	private String objetivo;
	private String resultado;
	private NaveDAO nave; 
	private List<AstronautaDAO> astronautas = new ArrayList();
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNone() {
		return none;
	}
	
	public void setNone(String none) {
		this.none = none;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public NaveDAO getNave() {
		return nave;
	}
	
	public void setNave(NaveDAO nave) {
		this.nave = nave;
	}
	
	public List<AstronautaDAO> getAstronautas() {
		return astronautas;
	}
	
	public void setAstronautas(List<AstronautaDAO> astronautas) {
		this.astronautas = astronautas;
	}
	
	
}
