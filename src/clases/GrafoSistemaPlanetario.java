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
public class GrafoSistemaPlanetario {
    public List<SistemaPlanetario> listaSistemasPlanetarios;
  
//constructor
    public GrafoSistemaPlanetario( ) {
        this.listaSistemasPlanetarios = new ArrayList();
       
    }

    public int getTotalSitemasPlanetarios() {
        return listaSistemasPlanetarios.size();
    }

    public List<SistemaPlanetario> getListaSistemasPlanetarios() {
        return listaSistemasPlanetarios;
    }

    public void setListPlanetas(List<SistemaPlanetario> listaSistemaPlanetario) {
        this.listaSistemasPlanetarios = listaSistemaPlanetario;
    }
    
    //adicione sistemas planetarios a la lista
    public void adicionarSistemaPlanetario(SistemaPlanetario sistemaplanetario){
    this.listaSistemasPlanetarios.add(sistemaplanetario);
    
    }
   
   public void imprimirGrafo(){
       listaSistemasPlanetarios.forEach((sistemaPlanetario) -> {
           System.out.println("grafo"+sistemaPlanetario.getX()+ sistemaPlanetario.getY());
       });
   }
}
