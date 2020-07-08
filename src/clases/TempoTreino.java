package clases;

import java.util.ArrayList;

public class TempoTreino {
    
    private ArrayList<Treino> listaTempoTreino;

    public TempoTreino() {
        this.listaTempoTreino = new ArrayList<Treino>();
    }

    public ArrayList<Treino> getListaTempoTreino() {
        return listaTempoTreino;
    }

    public void setListaTempoTreino(ArrayList<Treino> listaTempoTreino) {
        this.listaTempoTreino = listaTempoTreino;
    }
    
}
