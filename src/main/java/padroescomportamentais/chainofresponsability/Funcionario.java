package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaSuporte = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getFuncao();

    public String realizarSuporte(Solicitacao solicitacao){
        if(listaSuporte.contains(solicitacao.getTipoSolicitacao())){
            return getFuncao();
        }else {
            if (funcionarioSuperior != null){
                return funcionarioSuperior.realizarSuporte(solicitacao);
            }else {
                return "Não realizado";
            }
        }
    }
}
