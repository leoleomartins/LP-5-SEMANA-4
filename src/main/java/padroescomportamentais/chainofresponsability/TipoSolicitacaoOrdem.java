package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoOrdem implements TipoSolicitacao{
    private static TipoSolicitacaoOrdem tipoSolicitacaoOrdem = new TipoSolicitacaoOrdem();
    private TipoSolicitacaoOrdem(){};
    public static TipoSolicitacaoOrdem getTipoSolicitacaoOrdem(){return tipoSolicitacaoOrdem;}
}
