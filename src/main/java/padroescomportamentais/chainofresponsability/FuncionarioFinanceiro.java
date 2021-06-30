package padroescomportamentais.chainofresponsability;

public class FuncionarioFinanceiro extends Funcionario{

    public FuncionarioFinanceiro(Funcionario superior){
        listaSuporte.add(TipoSolicitacaoOrdem.getTipoSolicitacaoOrdem());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getFuncao() {
        return "Financeiro";
    }
}
