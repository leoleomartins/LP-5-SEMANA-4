package padroescomportamentais.iterator;

public class Acao implements Cloneable {
    private Long id;
    private String codigo;
    private Empresa empresa;
    private Double valor;
    private Integer quantidade;
    private Double montante;

    public Acao(Long id, String codigo, Empresa empresa, Double valor, Integer quantidade) {
        this.id = id;
        this.codigo = codigo;
        this.empresa = empresa;
        this.valor = valor;
        this.montante = quantidade * valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getMontante() {
        return montante;
    }

    public void setMontante(Double montante) {
        this.montante = montante;
    }

    @Override
    public Acao clone() throws CloneNotSupportedException {
        Acao acaoClone = (Acao) super.clone();
        acaoClone.empresa = (Empresa)acaoClone.empresa.clone();
        return acaoClone;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", valor=" + valor +
                '}';
    }
}
