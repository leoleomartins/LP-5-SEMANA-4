package padroescomportamentais.iterator;

public class Conta {

    private Double montanteTotal;
    private String investidor;
    private Carteira carteira;

    public Conta(String investidor, Carteira carteira) {
        this.investidor = investidor;
        this.carteira = carteira;
    }

    public Double calcularMontante(){
        montanteTotal = 0d;
        for (Acao acao:carteira){
            montanteTotal+= acao.getMontante();
        }
        return montanteTotal;
    }

    public Double calcularMontante(Empresa empresa){
        double montante = 0;
        for(Acao acao:carteira){
            if(acao.getEmpresa().equals(empresa)){
                montante+= acao.getMontante();
            }
        }
        return montante;
    }

    public Double getMontanteTotal() {
        return montanteTotal;
    }

    public void setMontanteTotal(Double montanteTotal) {
        this.montanteTotal = montanteTotal;
    }

    public String getInvestidor() {
        return investidor;
    }

    public void setInvestidor(String investidor) {
        this.investidor = investidor;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }
}
