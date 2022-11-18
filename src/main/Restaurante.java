package main;

import java.util.ArrayList;
import java.util.List;

public abstract class Restaurante {

    private List<Cliente> clienteComCupom = new ArrayList<Cliente>();

    public void adicionaClienteComCupom(Cliente cliente){
        this.clienteComCupom.add(cliente);
    }

    public boolean verificaClienteTemCupom(Cliente cliente){
        return this.clienteComCupom.contains(cliente);
    }



}
