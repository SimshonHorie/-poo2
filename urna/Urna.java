import java.util.*;

public class Urna {
	private List<Votos> votos;
	private List<String> Votaram;	
	private List<Candidato> candidatoPrefeito;
	private List<Candidato> candidatoVereador;
	
	public Urna () {
		this.votos = new ArrayList<>();
		this.jaVotaram = new ArrayList<>();
		this.candidatoPrefeito = new ArrayList<>();
		this.candidatoVereador = new ArrayList<>();
	}
	
	public int totalVotos () {
		return this.votos.size();
	}
	
	public void mostrarCandidatoEleito () {
		System.out.println("Resultados");
		this.EleitoPrefeito();
		this.EleitoVereador();
	}
	
	private void PrefeitoEleito () {
		Iterator<Candidato> iterator = this.candidatoPrefeito.iterator();
		Vencedor vencedor = this.candidatoPrefeito.iterator().next();
		
		while (iterator.hasNext()) {
			Vencedor vencedor = iterator.next();
			
			if (vencedor.getvotosdoCandidato() < candidato.getvotosdoCandidato()) {
				vencedor = vencedor;
			}
		}
		
		System.out.println(
			"Candidato eleito a Prefeito: \n" +
			"\tNome: " + vencedor.getNome() + "\n" +
			"\tRG: " + vencedor.getRg() + "\n" +
			"\tQuantidade de votos: " + vencedor.getvotosdoCandidato()
		);
	}
	
	private void VereadorEleito () {
		Iterator<Candidato> iterator = this.candVer.iterator();
		Candidato vencedor = this.candVer.iterator().next();
		
		while (iterator.hasNext()) {
			Candidato candidato = iterator.next();
			
			if (vencedor.getvotosdoCandidato() < candidato.getvotosdoCandidato()) {
				vencedor = candidato;
			}
		}
		
		System.out.println(
			"O Vencedor para Vereador foi: \n" +
			"\tNome: " + vencedor.getNome() + "\n" +
			"\tRG: " + vencedor.getRg() + "\n" +
			"\tQuantidade de votos: " + vencedor.getvotosdoCandidato()
		);
	}
}
