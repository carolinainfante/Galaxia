/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Carolina
 */
public class Planeta {
    //atributos de un planeta
    public  int x;
    public  int y;
    public  int i;
    
    

    public Planeta(int x, int y, int i) {
        this.x = x;
        this.y = y;
        this.i = i;
       
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
    
}
