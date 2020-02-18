
import java.util.Scanner;


public class bangundatar {
        public static void datar(){
            System.out.println("MENGHITUNG LUAS DAN KELILING");
            System.out.println("1.Luas");
            System.out.println("2.Keliling");
             System.out.println("Pilih :");
                Scanner pil = new Scanner(System.in);
                int menu1 =pil.nextInt();
                switch(menu1)
                {
                    case 1:
                        System.out.println("MENGHITUNG LUAS");
                        System.out.println("1.Segitiga");
                        System.out.println("2.Persegi panjang ");
                        System.out.println("Pilih:");
                int menu =pil.nextInt();
                switch(menu)
                {
                    case 1:
                        System.out.println("Luas Segitiga ");
                        System.out.println("Panjang Alas :");
                        int alas =pil.nextInt();
                        System.out.println("Tinggi: ");
                        int tinggi=pil.nextInt();
                        System.out.println("Jadi luas segitiga :"+ alas*tinggi/2);
                        break;

                    case 2:
                        System.out.println("Luas Persegi :");
                        System.out.println("panjang :");
                        int pjg =pil.nextInt();
                        System.out.println("lebar :");
                        int lbr =pil.nextInt();
                        System.out.println("Jadi luas persegi panjang: "+pjg*lbr);
                        break;
                }
                    break;
                    case 2:
                        System.out.println("MENGHITUNG KELILING");
                        System.out.println("1.Segitiga");
                        System.out.println("2.Persegi Panjang");
                        System.out.println("Pilih:");
                        int menu2=pil.nextInt();
                        switch(menu2)
                        {
                            case 1:
                                System.out.println("Keliling Segitiga");
                                System.out.println("sisi 1: ");
                                int sisi1=pil.nextInt();
                                System.out.println("sisi 2: ");
                                int sisi2=pil.nextInt();
                                System.out.println("sisi 3: ");
                                int sisi3=pil.nextInt();
                                System.out.println("Jadi keliling segitiga : "+sisi1+sisi2+sisi3);
                                break;
                                
                            case 2:
                                System.out.println("Keliling Persegi Panjang");
                                System.out.println("panjang :");
                                int panjang=pil.nextInt();
                                System.out.println("lebar :");
                                int lebar=pil.nextInt();
                                System.out.println("Jadi keliling persegi panjang :"+2*(panjang+lebar));
                                break;
                        }
                    break;
                }
                
            
        }
}
