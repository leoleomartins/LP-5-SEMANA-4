package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Venda Swing Trade: Template Method")
class VendaSwingTradeTest {

    @Test
    @DisplayName("Deve retornar Swing Trade")
    void deveRetornarSwingTrade(){
        VendaSwingTrade vendaSwingTrade = new VendaSwingTrade();
        assertEquals("Swing Trade", vendaSwingTrade.getTipo());
    }

    @Test
    @DisplayName("Deve retornar 15%")
    void deveRetornarCerto(){
       VendaSwingTrade vendaSwingTrade = new VendaSwingTrade();
       assertEquals("Swing Trade deve pagar imposto de: 15%", vendaSwingTrade.getInfo());
    }
}
