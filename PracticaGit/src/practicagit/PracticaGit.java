/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Francisco Zamora Agudo
 */
public class PracticaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1º Crea una clase con tu nombre
        
        
        // 2º Crea obetos con las clases nuevas y utilizalas

        
        MarcosPellicer m = new MarcosPellicer();
                
        System.out.println(m);


         
        FranciscoVara   yo = new FranciscoVara("");
        System.out.println(yo);


        Andres andres = new Andres();
        System.out.println(andres.toString());


        JavierSancho js = new JavierSancho();
        System.out.println(js);

  
        GeorgeMitica gm  = new GeorgeMitica();
        JOptionPane.showMessageDialog(null, gm.toString());


    }
    
}
