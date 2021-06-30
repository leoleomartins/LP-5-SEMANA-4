package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solicitacao: Chain of Responsability")
class SolicitacaoTest {

    FuncionarioAtendente atendente;
    FuncionarioFinanceiro financeiro;
    FuncionarioGerente gerente;

    @BeforeEach
    void setUp(){
        gerente = new FuncionarioGerente(null);
        financeiro = new FuncionarioFinanceiro(gerente);
        atendente = new FuncionarioAtendente(financeiro);
    }

    @Test
    @DisplayName("Deve Retornar Atendente Para dar informações")
    void deveRetornarAtendente(){
        assertEquals("Atendente", atendente.realizarSuporte(new Solicitacao(TipoSolicitacaoInfo.getTipoSolicitacaoInfo())));
    }

    @Test
    @DisplayName("Deve Retornar Financeiro Para realizar ordens de compra e venda")
    void deveRetornarFinanceiro(){
        assertEquals("Financeiro", atendente.realizarSuporte(new Solicitacao(TipoSolicitacaoOrdem.getTipoSolicitacaoOrdem())));
    }

    @Test
    @DisplayName("Deve Retornar Gerente Para realizar reembolso")
    void deveRetornarGerente(){
        assertEquals("Gerente", atendente.realizarSuporte(new Solicitacao(TipoSolicitacaoReembolso.getTipoSolicitacaoReembolso())));
    }

    @Test
    @DisplayName("Deve Retornar não realizado para serviço não cadastrado")
    void deveRetornarNãoRealizadoParaServiçoNaoCadastrado(){
        assertEquals("Não realizado", atendente.realizarSuporte(new Solicitacao(TipoSolicitacaoQueimarDinheiro.getTipoSolicitacaoQueimarDinheiro())));
    }

}
