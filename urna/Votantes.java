public class Votantes {
	private String nome = "";
	private String rg = null;
	
	public Votantes () {}
	
	public Votantes (String nome, String rg) {
		this.setNome(nome);
		this.setRg(rg);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	public boolean setRg(String rg) {
		if (rg.length() < 9 || rg.length() > 12) {
			return false;
		}
		
		this.rg = rg;
		
		return true;
	}
	
	public boolean verificarDocumentos () {
		return nome != null && rg != null;
	}
	
}

