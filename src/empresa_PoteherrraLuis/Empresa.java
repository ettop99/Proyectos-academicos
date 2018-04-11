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
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <equipo> equipos = new ArrayList<>();
        ArrayList <avion> aviones = new ArrayList<>();
        equipo eq = new equipo("equipo 1", new empleado("equipo 1"));
        eq.crear_avion("avion1", "componente 0");
        eq.add_componente("avion1", "nvo_comp");
        eq.add_sub_compo("avion1", "componente 0", "subomponente 001");
        for (avion avione : eq.getAviones()) {
            aviones.add(avione);
        }
        for (avion avi : aviones) {
            System.out.println("avion: "+avi.getRef());
            for (Componente compo : avi.getComponentes()) {
                System.out.println("Componente: "+compo.getNom());
                for (Componente componente : compo.getComponentes()) {
                    System.out.println(" - Subcomponente: "+componente.getNom());
                }
            }
        }
        
        
    }
    
}
