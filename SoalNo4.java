/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan9;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SoalNo4 {
    public static void main(String[] args) {
        Scanner ganteng=new Scanner (System.in);//memesan tmpat pada scanner
    int pilihan,A=0,B=0,C=0,D=0,E=0,berat,N;//meminta input pada int dengan nama pilihan,A=0,B=0,C=0,D=0,E=0,berat,N
    int jum=0,rata,rataN=0;//meminta input pada int degan nama jumlah,rata,rataN,n
    double kuadratN,jumKuadrat=0,var,varN=0,deviasi;//meminta input pada  double dgn nama data kuadratN,jumKuadrat=0,var,varN=0,deviasi
    boolean menu=true;//meminta variabel boolean dgn nama data  yang sama dengan benar
    
    do{//kerjakan minimal sekali
        System.out.println("------");//mencetak ------
        System.out.println("1.masukan data usianya");//mencetak 1.masukan data usianya
        System.out.println("2.masukan rata ratanya");//mencetak 2.masukan rata ratanya
        System.out.println("3.masukan deviasi ");//mencetak masukan deviasi
        System.out.println("4.masukan diagram batangnya ");//mencetak 4.masukan diagram batangnya
        System.out.println("5.hasil nya");//mencetak 5.hasilnya
        System.out.print(" pilihan:");//mencetak pilihanya
        pilihan=ganteng.nextInt();//memebaca dan menyimpan pilihan ke scanner 
        switch (pilihan) {//jika kalau
            case 1://isi variabel pilih sama dgn 1
                System.out.println("masukan jumlah datanya:");//mencetak masukan jumlah datanya
                N=ganteng.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable N interger ke memori ganteng pada class scanner
                
                for (int i=1;i<=N;i++){//untuk i berisi variabel 1,lalu isi variabel i lebih kecil samadengan isi variabel N,lalu setiap perulangan isi variabel 1 ditambah 1
                System.out.print("Masukan usia "+i+":");//mencetak "Masukan usia :"+i
                berat=ganteng.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable berat interger ke memori ganteng pada class scanner
                jum+=berat;//hasil isi variabel jum tambah sama dgn berat
                kuadratN=Math.pow(berat,2);//menghitung hasil dari isi variable berat pangkat dua dan disimpan ke keuadratN
                jumKuadrat+=kuadratN;//menambahkan isi variable jumlahKuadrat dengan kuadratN
                if(0<=berat&&berat<20){//jika isi variable berat lebih besar sama dengan 0 dan berat lebih kecil sama dengan 20 maka
                    A++;//isi variable A ditambah 1
                }else if (21<=berat&&berat<=40){//atau jika isi variable berat lebih besar sama dengan 21 dan berat lebih kecil sama dengan 40 maka
                    B++;//isi variable B ditambah 1 
                }else if (41<=berat&&berat<=60){//atau jika isi variable berat lebih besar sama dengan 41 dan berat lebih kecil sama dengan 60 maka
                    C++;//isi variable C ditambah 1
                }else if (61<=berat&&berat<=80){//atau jika isi variable berat lebih besar sama dengan 61 dan berat lebih kecil sama dengan 80 maka
                    D++;//isi variable D ditambah 1
                }else if (81<=berat&&berat<=100){//atau jika isi variable berat lebih besar sama dengan 81 dan berat lebih kecil sama dengan 100 maka
                    E++;//isi variable E ditambah 1
                }
                     
        }
        rata=jum/N;//menghitung hasil dari isi variable jumlah dibagi variable N dan disimpan ke variable rata
        rataN+=rata;//menambahkan isi variable rataN dengan rata
        var=(jumKuadrat-(N*Math.pow(rataN,2)))/N;//menghitung hasil dari (jumlahKuadrat-(N*Math.pow(rataN, 2)))/N dan disimpan ke var
        varN+=var;//menambahkan isi variable varN dengan var
        
break;//berhenti
case 2://isi variabel yang dipilih sama dengan 2
System.out.println("rata ratanya :"+rataN);//mencetak rata ratanya :"+rataN

break;//berhenti
case 3://isi variabel yang dipilih sama dengan 3
deviasi=Math.sqrt(varN);//menghitung hasil varN disimpan ke deviasi
System.out.println("deviasi nya:"+deviasi);//

break;//berhenti
case 4://isi variabel yang dipilih sama dengan 4
System.out.print("0-20:");//cetak 0-20:
for(int p=0;p<A;p++){//untuk perulangan p yg berisi 0 dan p kurang dari A ,lalu lalu setiap perulangan isi variabel p ditambah 1
System.out.print("*");//mencetak *
    }
    System.out.println("");//mencetak "" untuk barisan baru
    System.out.print("21-40:");//mencetak 21-40
    for(int q=0;q<B;q++){//untuk perulangan q yg berisi 0 dan q kurang dari B ,lalu lalu setiap perulangan isi variabel q ditambah 1
    System.out.print("*");//mencetak * 
    }
    System.out.println("");//mencetak "" untuk barisan baru
    System.out.print("41-60:");//
    for(int r=0;r<C;r++){////untuk perulangan r yg berisi 0 dan r kurang dari C ,lalu lalu setiap perulangan isi variabel r ditambah 1
    System.out.print("*");//mencetak *
    }
    System.out.println("");//mencetak "" untuk barisan baru
    System.out.print("61-80:");
    for(int s=0;s<D;s++){//untuk perulangan s yg berisi 0 dan s kurang dari D ,lalu lalu setiap perulangan isi variabel s ditambah 1
    System.out.print("*");//mencetak *
    }
    System.out.println("");//mencetak "" untuk barisan baru
    System.out.print("81-100:");
    for(int t=0;t<E;t++){//untuk perulangan t yg berisi 0 dan t kurang dari E ,lalu lalu setiap perulangan isi variabel t ditambah 1
    System.out.print("*");//mencetak *
    }
    System.out.println("");//mencetak "" untuk barisan baru
    break;//berhenti
    case 5://isi variabel yang dipilih sama dengan 5
    menu=false;//ubah nilai boolean jadi salah 
    break;//berhenti
    
        }
    
      }while(menu);//
  
    } 

}

    
 
      