
package bgnRuang;

import java.util.Scanner;


public class operasihitung {
    public static void hitung(){
                System.out.println("Operasi Hitung");
                 Scanner angka=new Scanner(System.in);
                    System.out.println("Angka 1: ");
                    double angka1=angka.nextInt();
                    System.out.println("Angka 2: ");
                    double angka2=angka.nextInt();
                     System.out.println("Angka 3: ");
                     double angka3=angka.nextInt();
                     System.out.println("Hasil Tambah :"+(angka1+angka2+angka3));
                     System.out.println("Hasil pengurangan:"+(angka1-angka2-angka3));
                     System.out.println("Hasil Perkalian:"+angka1*angka2*angka3);
                     System.out.println("Hasil Pembagian :"+angka1/angka2/angka3);
}
}
