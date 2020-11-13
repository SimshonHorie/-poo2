public class Votos {
	private Concorrente vereador;
	private Concorrente prefeito;
	private Votantes votantes;
	
	public Votos () {}
	
	public Votos (Concorrente vereador,Concorrente prefeito,Votantes votantes) {
		this.setVereador(vereador);
		this.setPrefeito(prefeito);
		this.setVotantesr(votantes);
	}
	
	public boolean setVereador(Concorrente vereador) {
		if (vereador.getFuncao() != 1 || vereador.getRg() == null) {
			return false;
		}
		
		this.vereador = vereador;
		
		return true;
	}
	
	public boolean setPrefeito(Concorrente prefeito) {
		if (prefeito.getFuncao() != 2 || vereador.getRg() == null) {
			return false;
		}
		
		this.prefeito = prefeito;
		
		return true;
	}
	
	public boolean setVotantesr(Votantes votantes) {
		if (votantes.getRg() == null) return false;
		
		this.votantes = votantes;
		
		return true;
	}
	
	public Votantes getVotantes() {
		return votantes;
	}
	
	public Concorrente getVereador() {
		return vereador;
	}
	
	public Concorrente getPrefeito() {
		return prefeito;
	}
}

