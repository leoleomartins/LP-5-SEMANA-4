package padroescomportamentais.chainofresponsability;

public class FuncionarioAtendente extends Funcionario {

   public FuncionarioAtendente(Funcionario superior){
   listaSuporte.add(TipoSolicitacaoInfo.getTipoSolicitacaoInfo());
   setFuncionarioSuperior(superior);
   }

    @Override
    public String getFuncao() {
        return "Atendente";
    }
}
