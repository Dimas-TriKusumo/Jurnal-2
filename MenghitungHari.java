import java.util.Scanner;

class MenghitungHari {
public static void main (String [] datk) {
    Scanner input = new Scanner(System.in);
            System.out.println("Program Menghitung Hari");
            System.out.print("Masukan Bulan (Dalam Angka 1-12) : ");
            int bulan = input.nextInt();
            System.out.print("Masukkan Tahun : ");
            Scanner input2 = new Scanner(System.in);
            int tahun = input.nextInt();
            
            switch (bulan) {
            case 1 :
                    System.out.println("Jumlah Hari = 31 hari");
                    
            break;
            case 2 :
                    if ((tahun % 400 == 0)){
                    System.out.println("Jumlah Hari = 29 hari");
                    } 
                    else if ((tahun % 400!=0)&&(tahun % 100==0)) {
                    System.out.println("Jumlah Hari = 28 hari");}
                else if ((tahun%400!=0)&&(tahun%100!=0)&&(tahun%4==0)) {
                     System.out.println("Jumlah Hari = 29 hari"); }
                else {
                     System.out.println("Jumlah Hari = 28 hari"); }

            break;
            case 3 : 
                    System.out.println("Jumlah Hari = 31 hari");

                     break;
            case 4 :
                    System.out.println("Jumlah Hari = 30 hari");
                      break;
            case 5 :
                    System.out.println ("Jumlah Hari = 31 hari");
            break;
            case 6 :
                    System.out.println ("Jumlah Hari = 30 hari");
            break;
            case 7 :
                   System.out.println ("Jumlah Hari = 31 hari");
            break;
            case 8 :
                    System.out.println ("Jumlah Hari = 31 hari");
            break;
            case 9 :
                    System.out.println ("Jumlah Hari = 30 hari");
            break;
            case 10 :
                   System.out.println ("Jumlah Hari = 31 hari");
            break;
            case 11 :
                    System.out.println ("Jumlah Hari = 30 hari");
            break;
            case 12 :
                    System.out.println ("Jumlah Hari = 31 hari");
            break;
            default :
                    System.out.println ("Program Error!!");
            break;
                }
}
}