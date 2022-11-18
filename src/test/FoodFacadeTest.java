package test;

import main.Cliente;
import main.RestauranteBrazukaFood;
import main.RestauranteQatarFood;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodFacadeTest {

    @Test
    void deveRetonarComidaBrazukaFood(){
        Cliente cliente = new Cliente();
        RestauranteBrazukaFood.getInstance().adicionaClienteComCupom(cliente);

        assertEquals("BrazukaFood", cliente.usarCupom());
    }

    @Test
    void deveRetonarComidaQatarFood(){
        Cliente cliente = new Cliente();
        RestauranteQatarFood.getInstance().adicionaClienteComCupom(cliente);

        assertEquals("QatarFood", cliente.usarCupom());
    }

    @Test
    void deveRetonarNaoEncontradoCupom(){
        Cliente cliente = new Cliente();

        assertEquals("Cupom não encontrado", cliente.usarCupom());
    }
}