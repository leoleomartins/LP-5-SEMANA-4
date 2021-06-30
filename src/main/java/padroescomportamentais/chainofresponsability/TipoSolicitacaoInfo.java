package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoInfo implements TipoSolicitacao  {

    private static TipoSolicitacaoInfo tipoSolicitacaoInfo = new TipoSolicitacaoInfo();
    private TipoSolicitacaoInfo(){};
    public static TipoSolicitacaoInfo getTipoSolicitacaoInfo(){return tipoSolicitacaoInfo;}
}
