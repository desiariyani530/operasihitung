
package bgnRuang;

import java.util.Scanner;


public class bangunruang {
    public static void bangun(){
        System.out.println("MENGHITUNG VOLUME BANGUN RUANG");
                System.out.println("Volume :");
                System.out.println("1.Limas Segi 4");
                System.out.println("2.Tabung ");
                System.out.println("Pilih :");
                Scanner pil = new Scanner(System.in);
                int menu3 =pil.nextInt();
                switch (menu3)
                {
                    case 1:
                        System.out.println("MENGHITUNG VOLUME LIMAS  ");
                        System.out.println("panjang alas :");
                        int p = pil.nextInt();
                        System.out.println("lebar alas :");
                        int l = pil.nextInt();
                        System.out.println("tinggi : ");
                        int t = pil.nextInt();
                        System.out.println("Jadi volume Limas :" + p*l*t/3);
                        break;
                    case 2:
                        System.out.println("MENGHITUNG VOLUME TABUNG :");
                        System.out.println("jari jari : ");
                        float r = pil.nextFloat();
                        System.out.println("tinggi :");
                        float tinggi = pil.nextFloat();
                        System.out.println("volume : "+3.14*r*r*tinggi);
                        break;
                 }
    }
}
