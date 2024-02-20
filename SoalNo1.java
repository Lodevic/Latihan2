/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan9;

/**
 *
 * @author USER
 */import java.util.Scanner;
public class SoalNo1 {
    public static void main(String[] args) {
        Scanner ganteng=new Scanner(System.in);//meminta mememori dengan nama ganteng
        int N;//meminta tempat pada interger dengan nama N
        
        System.out.print("Masukan jumlah Data:");//mencetak Masukan jumlah Data:
        N=ganteng.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable N interger ke memori ganteng pada class scanner
        
        
        for(int baris=1;baris<=N;baris++){//untuk baris berisi variabel 1,lalu isi variabel baris lebih kecil samadengan isi variabel N,lalu setiap perulangan isi variabel baris ditambah 1
            for(int kolom=1; kolom <=N; kolom++)//untuk kolom berisi variabel 1,lalu isi variabel kolom lebih kecil samadengan isi variabel N,lalu setiap perulangan isi variabel kolom ditambah 1
            if(baris != kolom){//jika baris tidak sama dengan kolom
                System.out.print(" 0");//mencetak " 0"
            }else if(baris == kolom)//atau jika baris sama dengan kolom
               System.out.print(" 1");//mencetak " 1"
               System.out.println("");//mencetak "" untuk barisan baru
            }
            System.out.println("");//mencetak "" untuk barisan baru
        }
    }

