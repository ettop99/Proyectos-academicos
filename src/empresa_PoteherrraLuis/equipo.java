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
public class equipo {

    private String Nom;
    private ArrayList<equipo> sub_equipos = new ArrayList<>();
    private ArrayList<empleado> empleados = new ArrayList<>();
    private ArrayList<avion> aviones = new ArrayList<>();

    public equipo(String nombre,empleado emp1) {
        this.Nom = nombre;
        empleados.add(emp1);
    }

    public void crear_subequipo(equipo e, empleado em) {
        sub_equipos.add(e);
        add_al_team(em);
    }
    
    public void crear_avion(String nom, String frcomp){
        avion av = new avion(nom, frcomp);
        aviones.add(av);
    }
    public void add_componente(String avion, String nvo_comp){
        for (avion avi : aviones) {
            if (avi.getRef().equals(avion)){
                avi.crearcomponente(nvo_comp);
            }
        }
    }
    public void add_sub_compo(String avion,String compoP, String nvo_comp){
        for (avion avi : aviones) {
            if (avi.getRef().equals(avion)){
                for (Componente comp : avi.getComponentes()) {
                    if (comp.getNom().equals(compoP)){
                        comp.ensamblar_sub_componente(nvo_comp);
                    }
                }
            }
        }
    }

    public ArrayList<avion> getAviones() {
        return aviones;
    }

    public void add_al_team(empleado em) {
        empleados.add(em);
    }

    public ArrayList<empleado> getEmpleados() {
        return empleados;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public ArrayList<equipo> getSub_equipos() {
        return sub_equipos;
    }

}
