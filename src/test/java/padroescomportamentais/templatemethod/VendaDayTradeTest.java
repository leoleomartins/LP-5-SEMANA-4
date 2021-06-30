package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Venda Day Trade: Template Method")
class VendaDayTradeTest {

    @Test
    @DisplayName("Deve retornar Day Trade")
    void deveRetornarDayTrade(){
        VendaDayTrade vendaDayTrade = new VendaDayTrade();
        assertEquals("Day Trade", vendaDayTrade.getTipo());
    }

    @Test
    @DisplayName("Deve retornar 20%")
    void deveRetornarCerto(){
        VendaDayTrade vendaDayTrade = new VendaDayTrade();
        assertEquals("Day Trade deve pagar imposto de: 20%", vendaDayTrade.getInfo());
    }

}
