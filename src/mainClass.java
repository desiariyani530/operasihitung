
                    /*DESI ARIYANI 123180043*/
import bgnRuang.bangunruang;
import bgnRuang.operasihitung;
import java.util.Scanner;
public class mainClass {

 
    public static void main(String[] args) {
      System.out.println("MENU BANGUN RUANG BANGUN DATAR dan OPERASI HITUNG");
        System.out.println("1.Bangun Ruang");
        System.out.println("2.Bangun Datar");
        System.out.println("3.Operasi Hitung");
        System.out.println("Pilihan: ");
         Scanner pil = new Scanner(System.in);
        int menu = pil.nextInt();
        switch (menu)
        {
            case 1:
              bangunruang ruang=new bangunruang();
              bangunruang.bangun();
                break;
            case 2:
                bangundatar datar=new bangundatar();
                bangundatar.datar();
                break;
            case 3:
                 operasihitung operasihitung = new operasihitung();
                operasihitung.hitung();
                break;
        }
        
        
    
}
}

