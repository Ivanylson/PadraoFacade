package main;

public class Cliente {

    public String usarCupom(){
        return FoodFacade.verificarSeTemCupom(this);
    }

}
