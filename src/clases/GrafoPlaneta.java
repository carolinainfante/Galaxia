/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carolina
 */
public class GrafoPlaneta {

    //lista de todos los planetas
    public List<Planeta> listaPlanetas;

//constructor
    public GrafoPlaneta() {
        this.listaPlanetas = new ArrayList();

    }

    public int getTotalPlanetas() {
        return listaPlanetas.size();
    }

    public List<Planeta> getListaPlanetas() {
        return listaPlanetas;
    }

    public void setListPlanetas(List<Planeta> listaPlanetas) {
        this.listaPlanetas = listaPlanetas;
    }

    //adicione planetas a la lista
    public void adicionarPlaneta(Planeta planeta) {
        this.listaPlanetas.add(planeta);

    }

    public void imprimirGrafo() {
        listaPlanetas.forEach((planeta) -> {
            System.out.println("grafo" + planeta.getX() + planeta.getY());
        });
    }
}
