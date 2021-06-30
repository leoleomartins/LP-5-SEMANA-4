package padroescomportamentais.chainofresponsability;

public class TipoSolicitacaoQueimarDinheiro implements TipoSolicitacao {
    private static TipoSolicitacaoQueimarDinheiro tipoSolicitacaoQueimarDinheiro = new TipoSolicitacaoQueimarDinheiro();
    private TipoSolicitacaoQueimarDinheiro(){};
    public static TipoSolicitacaoQueimarDinheiro getTipoSolicitacaoQueimarDinheiro(){return tipoSolicitacaoQueimarDinheiro;}

}
