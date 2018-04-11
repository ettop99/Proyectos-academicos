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
public class Componente {
    private String Nom;
    private ArrayList <Componente> sub_componentes = new ArrayList<>();

    public Componente(String nom) {
        this.Nom = nom;
    }
    
    public void ensamblar_sub_componente (String nomsub){
        Componente c = new Componente(nomsub);
        sub_componentes.add(c);
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public ArrayList<Componente> getComponentes() {
        return sub_componentes;
    }
    
}
