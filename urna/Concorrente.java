public class Concorrente extends Votantes {
    private int funcao = -1;
    private int votos = 0;
    private int numeroDoCandidato = -1;
    
    public Concorrente () {}
    
    public Concorrente (String nome, String rg, int funcao, int numeroDoCandidato) {
        this.setNome(nome);
        this.setRg(rg);
        this.setFuncao(funcao);
        this.setnumeroDoCandidato(numeroDoCandidato);
    }
    
    public int getFuncao() {
        return funcao;
    }

    public boolean setFuncao(int funcao) {
        if (funcao == 1 || funcao == 2) {
            this.funcao = funcao;
            
            return true;
        } else {
            return false;
        }
    }
    
    public int getvotos () {
        return this.votos;
    }
    
    public void acrescentarVotos () {
        this.votos++;
    }
    
    public int numeroDoCandidato () {
        return this.numeroDoCandidato;
    }
    
    public boolean setnumeroDoCandidato (int numeroDoCandidato) {
        if (numeroDoCandidato <= 0) return false;
        this.numeroDoCandidato = numeroDoCandidato;
        return true;
    }
    
    public boolean verificarDocumentos () {
        return super.verificarDocumentos() &&
            funcao != -1 &&
            numeroDoCandidato != -1;
    }
}