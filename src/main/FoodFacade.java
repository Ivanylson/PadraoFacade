package main;

public class FoodFacade {
    public static String verificarSeTemCupom(Cliente cliente){
        if(RestauranteBrazukaFood.getInstance().verificaClienteTemCupom(cliente)){
            return "BrazukaFood";
        }
        if(RestauranteQatarFood.getInstance().verificaClienteTemCupom(cliente)){
            return "QatarFood";
        }
        return "Cupom não encontrado";
    }
}
