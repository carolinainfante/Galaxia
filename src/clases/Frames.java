/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import frames.UniversoVentana;
import frames.SistemaPlanetarioVentana;
import frames.NebulosaVentana;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carolina
 */

public final class Frames implements Runnable
{
    int cantidad;
    Thread hilo;
 
    
    public Frames()
    {
        this.cantidad = 3;
        this.hilo = new Thread(this);
        start();
    }
    
    public void start(){
        this.hilo.start();
    }
//    public String[][] llenarcoordenadas() {
//        int xalterno = 0;
//        int yalterno = 0;
//
//        String matriz[][] = new String[15][20];
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 20; j++) {
//                matriz[i][j] = yalterno + "," + xalterno;
//                xalterno += 59;
//            }
//            xalterno = 0;
//            yalterno += 45;
//        }
//
//        for (String[] matriz1 : matriz) {
//            System.out.print("|");
//            for (int y = 0; y < matriz1.length; y++) {
//                System.out.print(matriz1[y]);
//                if (y != matriz1.length - 1) {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println("|");
//        }
//
//        return matriz;
//
//    }
//    
    
    @Override
    public void run()
    {
        //for (int i = 0; i < this.cantidad; i++)
        //{
            try
            {
                Thread.sleep(1000);
                //creando ventanas de casa seccion
                UniversoVentana newventa = new UniversoVentana();
                SistemaPlanetarioVentana nVentana = new SistemaPlanetarioVentana();
                NebulosaVentana nuevaVentana = new NebulosaVentana();
                
                //ventanas visibles de cada una de las secciones
                newventa.setVisible(true);
                nuevaVentana.setVisible(true);
                
                nVentana.setVisible(true);
                
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(Frames.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    //}
    
}
