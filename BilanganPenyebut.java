import java.util.Scanner;

class BilanganPenyebut {
  public static void main(String[] datk) {
  Scanner input = new Scanner(System.in);
    
    System.out.print("Masukan Jumlah Bilangan : ");
    double Bilangan = input.nextDouble();

    long hitung = (long)(Bilangan/1000000000);
     long sisa = (long)(Bilangan%1000000000);

     long hitung2 = (long)(sisa/100000000);
     long sisa2 = (long)(sisa%100000000);

     long hitung3 = (long)(sisa2/10000000);
     long sisa3 = (long)(sisa2%10000000);

     long hitung4 = (long)(sisa3/1000000);
     long sisa4 = (long)(sisa3%1000000);

     long hitung5 = (long)(sisa4/100000);
     long sisa5 = (long)(sisa4%100000);

     long hitung6 = (long)(sisa5/10000);
     long sisa6 = (long)(sisa5%10000);

     long hitung7 = (long)(sisa6/1000);
     long sisa7 = (long)(sisa6%1000);

     long hitung8 = (long)(sisa7/100);
     long sisa8 = (long)(sisa7%100);

     long hitung9 = (long)(sisa8/10);
     long sisa9 = (long)(sisa8%10);

     long hitung10 = (long)(sisa9/1);
     long sisa10 = (long)(sisa9%1);

     
    System.out.println("Jumlah Milyaran " + hitung);
    System.out.println("Jumlah Ratusan juta " + hitung2);
    System.out.println("Jumlah Puluhan juta " + hitung3);
    System.out.println("Jumlah Jutaan " + hitung4);
    System.out.println("Jumlah Ratusan ribu " + hitung5);
    System.out.println("Jumlah Puluhan ribu " + hitung6);
    System.out.println("Jumlah Ribuan " + hitung7);
    System.out.println("Jumlah Ratusan " + hitung8);
    System.out.println("Jumlah Puluhan " + hitung9);
    System.out.println("Jumlah Satuan " + hitung7);
 
 
  }
}





