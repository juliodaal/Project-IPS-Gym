/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class MovimentosCartao {
    
    private ArrayList<Cartao> listaMovimentos;

    public MovimentosCartao() {
        this.listaMovimentos = new ArrayList<Cartao>();
    }

    public ArrayList<Cartao> getListaMovimentos() {
        return listaMovimentos;
    }

    public void setListaMovimentos(ArrayList<Cartao> listaMovimentos) {
        this.listaMovimentos = listaMovimentos;
    }
}
