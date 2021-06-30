package padroescomportamentais.templatemethod;

public class VendaSwingTrade extends ServicoVenda {

    public String calcularImposto(){
        return "15%";
    }
    @Override
    public String getTipo() {
        return "Swing Trade";
    }
}
