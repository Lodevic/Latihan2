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

public class SoalNo2 {
    public static void main(String[] args) {
        Scanner ganteng=new Scanner(System.in);//meminta mememori dengan nama ganteng
        
        int N,usia,A=0,B=0,C=0,D=0,E=0;//meminta tempat pada interger dengan nama N,usia,A=0,B=0,C=0,D=0,E=0
        
        System.out.print("Masukan Jumlah Penduduk:");//mencetak Masukan Jumlah Penduduk:
        N=ganteng.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable N interger ke memori ganteng pada class scanner
        
        for(int i=1;i<=N;i++){//untuk i berisi variabel 1,lalu isi variabel i lebih kecil samadengan isi variabel N,lalu setiap perulangan isi variabel 1 ditambah 1
            
            System.out.print("Usia warga "+i+":");//mencetak Usia warga "+isi variabel i+":"
            usia=ganteng.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable usia interger ke memori ganteng pada class scanner
            
            if(0<=usia&&usia<=20){//jika isi variable usia  lebih besar sama dengan 0 dan usia  lebih kecil sama dengan 20 maka
               A++;//isi variable A ditambah 1
            }else if(21<=usia&&usia<=40){//atau jika isi variable usia  lebih besar sama dengan 21 dan usia  lebih kecil sama dengan 40 maka
               B++;//isi variable B ditambah 1 
            }else if(41<=usia&&usia<=60){//atau jika isi variable usia lebih besar sama dengan 41 dan usia  lebih kecil sama dengan 60 maka
                C++;//isi variable C ditambah 1
            }else if(61<=usia&&usia<=80){//atau jika isi variable usia  lebih besar sama dengan 61 dan usia  lebih kecil sama dengan 80 maka
                D++;//isi variable D ditambah 1
            }else if(81<=usia&&usia<=100){//atau jika isi variable usia lebih besar sama dengan 81 dan usia lebih kecil sama dengan 100 maka
                E++;//isi variable E ditambah 1
        }
            
    }
        System.out.println("Distribusi usia "+N+" penduduk diatas adalah:");//mencetak "Distribusi usia "+ isi variabel N+" penduduk diatas adalah:"
        System.out.print("0-20:");//mencetak 0-20:
        for(int Z=1;Z<=A;Z++){//untuk Z berisi variabel 1,lalu isi variabel Z lebih kecil samadengan isi variabel A,lalu setiap perulangan isi variabel Z ditambah 1
            System.out.print("*");//mencetak *
         }System.out.println("");//mencetak "" untuk barisan baru
        
        System.out.print("21-40:");//mencetak 21-40:
         for(int Y=1;Y<=B;Y++){//untuk Y berisi variabel 1,lalu isi variabel Y lebih kecil samadengan isi variabel B,lalu setiap perulangan isi variabel Y ditambah 1
            System.out.print("*");//mencetak *
         }System.out.println("");//mencetak "" untuk barisan baru
         
         System.out.print("41-60:");//mencetak 41-60:
         for(int X=1;X<=C;X++){//untuk X berisi variabel 1,lalu isi variabel X lebih kecil samadengan isi variabel C,lalu setiap perulangan isi variabel X ditambah 1
            System.out.print("*");//mencetak *
         }System.out.println("");//mencetak "" untuk barisan baru
         
         System.out.print("61-80:");//mencetak 61-80:
         for(int W=1;W<=D;W++){//untuk W berisi variabel 1,lalu isi variabel W lebih kecil samadengan isi variabel D,lalu setiap perulangan isi variabel W ditambah 1
            System.out.print("*");//mencetak *
         }System.out.println("");//mencetak "" untuk barisan baru
         
         System.out.print("81-100:");//mencetak 81-100:
         for(int V=1;V<=E;V++){//untuk i berisi variabel 1,lalu isi variabel i lebih kecil samadengan isi variabel N,lalu setiap perulangan isi variabel 1 ditambah 1
            System.out.print("*");//mencetak *
         }System.out.println("");//mencetak "" untuk barisan baru   
    }
}
    
