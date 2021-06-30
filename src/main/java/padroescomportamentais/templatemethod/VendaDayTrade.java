package padroescomportamentais.templatemethod;

public class VendaDayTrade extends ServicoVenda{

    public String calcularImposto(){
        return "20%";
    }
    @Override
    public String getTipo() {
        return "Day Trade";
    }
}
