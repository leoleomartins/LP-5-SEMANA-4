package padroescomportamentais.iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Conta: Teste de Iterator")
class ContaTest {
    @DisplayName("Deve calcular o montante na carteira")
    @Test
    void deveContarMontante(){
        Empresa empresa = new Empresa(1L,"Petrobras","123");
        Carteira carteira = new Carteira(
                new Acao(1L,"PETR4",empresa,13.2,100),
                new Acao(2L, "VVAR3",new Empresa(2L,"Via Varejo", "321"),5.6,200)
        );
        Conta conta = new Conta("Léo", carteira);

        assertEquals(2440d, conta.calcularMontante());
    }

    @DisplayName("Deve calcular o montante por empresa")
    @Test
    void deveCalcularMontantePorEmpresa(){
        Empresa empresa = new Empresa(1L,"Petrobras","123");
        Carteira carteira = new Carteira(
                new Acao(1L,"PETR4",empresa,13.2,100),
                new Acao(2L, "VVAR3",new Empresa(2L,"Via Varejo", "321"),5.6,200)
        );
        Conta conta = new Conta("Léo", carteira);

        assertEquals(1320d, conta.calcularMontante(empresa));
    }
}
