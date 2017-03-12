/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Hashtable;

/**
 *
 * @author 093529
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Hashtable monogenes = new Hashtable();
     monogenes.put("Homozygous Dominant","AA"); */
        
        
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PunnetGUI().setVisible(true);
            }
        });
    }

    /*void setAlleles(int index, String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


class monopunnet {
    String[] genes = new String[4];
     genes[0] = "mom allele 1";
    String[] data = {"allele1", "allele2","allele3","allele4"};
    
   public void setAlleles(int index, String a) {
        if(a == "A"){
            data[index] = a;
        }
        if(a == "B"){
            data[index] = a;
        }
        if(a == "C"){
            data[index] = a;
        }
        if(a == "D"){
            data[index] = a;
        }
    }
    
   String aChild() {
       String 
       return "lol"; 
   }
    
    */
}
