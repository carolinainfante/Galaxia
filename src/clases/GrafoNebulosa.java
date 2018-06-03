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
public class GrafoNebulosa {
    
     //lista de todos las nebulosas
   public List<Nebulosa> listaNebulosa;
  
//constructor
    public GrafoNebulosa( ) {
        this.listaNebulosa = new ArrayList();
       
    }

    public int getTotalNebulosas() {
        return listaNebulosa.size();
    }

    public List<Nebulosa> getListaNebulosas() {
        return listaNebulosa;
    }

    public void setListNebulosas(List<Nebulosa> listaNebulosas) {
        this.listaNebulosa = listaNebulosas;
    }
    
    //adicione nebulosas a la lista
    public void adicionarNebulosa(Nebulosa nebulosa){
    this.listaNebulosa.add(nebulosa);
    
    }
   
   public void imprimirGrafo(){
       listaNebulosa.forEach((nebulosa) -> {
           System.out.println("grafo"+nebulosa.getX()+ nebulosa.getY());
       });
   }
    
}
