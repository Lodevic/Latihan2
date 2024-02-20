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
public class SoalNo5 {
    public static void main(String[] args) {
        Scanner ganteng=new Scanner(System.in);//meminta mememori dengan nama ganteng
        int a;//meminta tempat pada interger dengan nama a
        long x,b,c,p,hasil;//meminta tempat pada long dengan nama  x,b,c,p,hasil
        
        System.out.print("Masukan Nilai :");//mencetak Masukan Nilai :
        a=ganteng.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable a interger ke memori ganteng pada class scanner
        
        for(int i=0;i<a;i++){//untuk i berisi variabel 0,lalu isi variabel i lebih kecil dari isi variabel a,lalu setiap perulangan isi variabel 1 ditambah 1
            for(int j=0;j<a-i-1;j++){//untuk j berisi variabel 0,lalu isi variabel j lebih kecil dari isi variabel a dikurang variabel i dan dikurang 1,lalu setiap perulangan isi variabel j ditambah 1
                System.out.print(" ");// mencetak " " untuk jarak   
            }
            for(int j=0;j<=i;j++){//untuk j berisi variabel 0,lalu isi variabel j lebih kecil dari isi variabel i,lalu setiap perulangan isi variabel j ditambah 1
                if(j==0){//jika j samadengan 0 maka
                    System.out.print(1+" ");// mencetak 1 " " untuk jarak
                }else if(j==i){//atau jika j samadengan isi variabel i maka
                    System.out.print(1+" ");// mencetak 1 " " untuk jarak
                }else if(j>=1){//atau jika j lebih besar samadengan 1 maka
                    x=1;//simpan 1 ke variabel x
                    b=1;//simpan 1 ke variabel b
                    p=i-j;//hitung hasil dari i dikurangi j dan disimpan ke p
                    c=1;//simpan 1 ke variabel c
                    for(int k=1;k<=i;k++){//untuk perulangan int k yang berisi 1 dengan kondisi k lebih kecil sama dengann i dan untuk setiap perulangan isi variable k ditambah 1
                        x=x*k;//menghitung hasil dari x dikali k dan disimpan kembali ke x
                    }
                     for(int k=1;k<=j;k++){//untuk perulangan int k yang berisi 1 dengan kondisi k lebih kecil sama dengann j dan untuk setiap perulangan isi variable k ditambah 1
                         b=b*k;//menghitung hasil dari b dikali k dan disimpan kembali ke b
                     }
                     for(int k=1;k<=p;k++){//untuk perulangan int k yang berisi 1 dengan kondisi k lebih kecil sama dengann p dan untuk setiap perulangan isi variable k ditambah 1
                         c=c*k;//menghitung hasil dari c dikali k dan disimpan kembali ke c
                     }
                     hasil=x/(b*c);//menghitung hassil dari x/(b*c) dan disimpan ke vvariable hasil
                     System.out.print(hasil+" ");//mencetak variable hasil dan jarak
                }
            }
            System.out.println(" ");//mencetak "" untuk barisan baru   
        }
    }
}
