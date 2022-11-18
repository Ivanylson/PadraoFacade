package main;

public class RestauranteQatarFood extends Restaurante {
    private static RestauranteQatarFood restaurante = new RestauranteQatarFood();

    private RestauranteQatarFood(){};

    public static RestauranteQatarFood getInstance(){
        return restaurante;
    }
}
