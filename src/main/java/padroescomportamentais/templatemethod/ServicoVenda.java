package padroescomportamentais.templatemethod;

public abstract class ServicoVenda implements Servico{

    public abstract String calcularImposto();
    public abstract String getTipo();

    public String getInfo(){
        return getTipo() + " deve pagar imposto de: " + calcularImposto();
    }

    @Override
    public String executar() {
        return "Venda Feita";
    }

    @Override
    public String cancelar() {
        return "Venda Desfeita";
    }


}
