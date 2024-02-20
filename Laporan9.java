/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan9;

/**
 *
 * @author USER
 */
public class Laporan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int baris =1; baris<= 10; baris++){
               for(int kolom=1; kolom <= 10; kolom++)System.out.printf("%5d", baris*kolom);
               System.out.println();
           }    

    }
    
}
