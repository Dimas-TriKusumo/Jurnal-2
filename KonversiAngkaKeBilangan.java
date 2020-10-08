import java.util.Scanner;


public class KonversiAngkaKeBilangan {

    public static void main(String[] datk) {
        Scanner input = new Scanner (System.in);
        
        int angka;
        System.out.print("Masukkan Bilangan = ");
        angka = input.nextInt();
        
        System.out.println();
        System.out.print("Terbilang = ");
        
        if(angka==0 && angka<=999){
            System.out.print("nol ");
        }
        if (angka%1000/100==1 && angka<=999){
            System.out.print("seratus");
        }
        if (angka%1000/100==2 && angka<=999){
            System.out.print("dua ratus");
        }
        if(angka%1000/100==3 && angka<=999){
            System.out.print("tiga ratus");
        }
        if(angka%1000/100==4 && angka<=999){
            System.out.print("empat ratus");
        }
        if(angka%1000/100==5 && angka<=999){
            System.out.print("lima ratus");
        }
        if(angka%1000/100==6 && angka<=999){
            System.out.print("enam ratus");
        }
        if(angka%1000/100==7 && angka<=999){
            System.out.print("tujuh ratus");
        }
        if(angka%1000/100==8 && angka<=999){
            System.out.print("delapan ratus");
        }
        if(angka%1000/100==9 && angka<=999){
            System.out.print("sembilan ratus");
        }
        if(angka%100/10==2 && angka<=999){
            System.out.print(" dua puluh");
        }
        if(angka%100/10==3 && angka<=999){
            System.out.print(" tiga puluh");
        }
        if(angka%100/10==4 && angka<=999){
            System.out.print(" empat puluh");
        }
        if(angka%100/10==5 && angka<=999){
            System.out.print(" lima puluh");
        }
        if(angka%100/10==6 && angka<=999){
            System.out.print(" enam puluh");
        }
        if(angka%100/10==7 && angka<=999){
            System.out.println(" tujuh puluh");
        }
        if(angka%100/10==8 && angka<=999){
            System.out.print(" delapan puluh");
        }
        if(angka%100/10==9 && angka<=999){
            System.out.print(" sembilan puluh");
        }
        if(angka%100==11 && angka<=999){
            System.out.print(" sebelas");
        }
        if(angka%10==1 && angka%100!=11 && angka<=999){
            System.out.print(" satu");
        }
        if(angka%10==2 && angka<=999){
            System.out.print(" dua");
        }
        if(angka%10==3 && angka<=999){
            System.out.print(" tiga");
        }
        if(angka%10==4 && angka<=999){
            System.out.print(" empat");
        }
        if(angka%10==5 && angka<=999){
            System.out.print(" lima");
        }
        if(angka%10==6 && angka<=999){
            System.out.print(" enam");
        }
        if(angka%10==7 && angka<=999){
            System.out.print(" tujuh");
        }
        if(angka%10==8 && angka<=999){
            System.out.print(" delapan");
        }
        if(angka%10==9 && angka<=999){
            System.out.print(" sembilan");
        }
        if(angka%100/10>0 && angka%100/10<=1 && angka%1000/100>=0 && angka%100<=10 && angka%10==0 && angka<=999){
            System.out.print(" sepuluh");
        }
        if(angka%1000/100<0 && angka%100==0 && angka%100/10==0 && angka<=999){
            System.out.print(" sepuluh");
        }
        
        if(angka%100/10==1 && angka%100!=10 && angka%100!=11 && angka%100/10<2 && angka<=999){
            System.out.println(" belas");
        }
        if(angka>999){
            System.out.println("Angka diluar batas konversi");
        }
        
        
        
    }
    
}
