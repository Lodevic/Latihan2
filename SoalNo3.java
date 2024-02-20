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
public class SoalNo3 {
    public static void main(String[] args){
        
        for(int jam=1;jam<=12;jam++){//untuk perulangan jam sama dengan 1,dengan kondisi jam kurang dari sama dengan 5 dan unutk setiap perulangan isi variable jam ditambah 1
            System.out.print("Jam :");//mencetak "Jam : "
            System.out.println(jam);//mencetak isi variable jam
            
            for(int menit=1;menit<60;menit++){//unutk perulangan menit yang berisi 1 dengan kondisi menit kurang dari sama dengan 60 dan unutk setiap perulangan isi variable menit ditambah 1 
                System.out.print("Menit :");//mencetak "Menit : "
                System.out.println(menit);//mencetak isi variable menit
                System.out.print("Detik :");//mencetak "Detik : "
                
                for(int detik=1;detik<=60;detik++){//untuk perulangan detik yang berisi 1 dengan kondisi detik lebih kecil sama dengan 60 dan untuk setiap perulangan isi variable detik ditambah 1
                    System.out.print(detik+" ");//mencetak "detik : "
                }
                System.out.println("");// mencetak "" untuk barisan baru
            }  
        }
    }
}
