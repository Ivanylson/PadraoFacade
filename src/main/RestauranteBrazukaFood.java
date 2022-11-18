package main;

public class RestauranteBrazukaFood extends Restaurante {

    private static RestauranteBrazukaFood restaurante = new RestauranteBrazukaFood();

    private RestauranteBrazukaFood(){};

    public static RestauranteBrazukaFood getInstance(){
        return restaurante;
    }

}
