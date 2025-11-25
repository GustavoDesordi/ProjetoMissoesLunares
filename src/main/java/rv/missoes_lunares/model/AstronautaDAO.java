package rv.missoes_lunares.model;

public class AstronautaDAO {

	private String nome;
	private int idade;
	private String especialidade;
	private int horas_de_voo;
	
	public AstronautaDAO(int idade) {
		super();
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getHoras_de_voo() {
		return horas_de_voo;
	}
	public void setHoras_de_voo(int horas_de_voo) {
		this.horas_de_voo = horas_de_voo;
	}
	
}
