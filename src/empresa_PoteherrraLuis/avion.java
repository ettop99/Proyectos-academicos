/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa_PoteherrraLuis;

import java.util.ArrayList;

/**
 *
 * @author lpotte
 */
public class avion {

    private String Ref;
    private ArrayList<Componente> componentes = new ArrayList<>();

    public avion(String Ref, String nom_comp) {
        this.Ref = Ref;
        crearcomponente(nom_comp);
    }

    public String getRef() {
        return Ref;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void crearcomponente(String nom) {
        Componente c = new Componente(nom);
        componentes.add(c);
    }
}
