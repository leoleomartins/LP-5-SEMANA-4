package padroescomportamentais.chainofresponsability;

public class FuncionarioGerente extends Funcionario{

    public FuncionarioGerente(Funcionario superior){
        listaSuporte.add(TipoSolicitacaoReembolso.getTipoSolicitacaoReembolso());
    }

    @Override
    public String getFuncao() {
        return "Gerente";
    }
}
