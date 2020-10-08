import java.util.Scanner;

class PecahanUang {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    
    System.out.print("Masukan Jumlah Uang :");
    double Uang = input.nextDouble();

    int hitung = (int)(Uang/100000);
    int sisa = (int)(Uang%100000);

    int hitung2 = (int)(sisa/50000);
    int sisa2 = (int)(sisa%50000);

    int hitung3 = (int)(sisa2/20000);
    int sisa3 = (int)(sisa2%20000);

    int hitung4 = (int)(sisa3/10000);
    int sisa4 = (int)(sisa3%10000);

    int hitung5 = (int)(sisa4/5000);
    int sisa5 = (int)(sisa4%5000);

    int hitung6 = (int)(sisa5/2000);
    int sisa6 = (int)(sisa5%2000);

    int hitung7 = (int)(sisa6/1000);
    int sisa7 = (int)(sisa6%1000);

    int hitung8 = (int)(sisa7/500);
    int sisa8 = (int)(sisa7%500);

    int hitung9 = (int)(sisa8/100);
    int sisa9 = (int)(sisa8%100);

    int hitung10 = (int)(sisa9/50);
    int sisa10 = (int)(sisa9%50);

    int hitung11 = (int)(sisa10/10);
    int sisa11 = (int)(sisa10%10);

    int hitung12 = (int)(sisa11/1);
    int sisa12 = (int)(sisa11%1);

    System.out.println("Jumlah uang 100000 sebanyak" + hitung);
    System.out.println("Jumlah uang 50000 sebanyak" + hitung2);
    System.out.println("Jumlah uang 20000 sebanyak" + hitung3);
    System.out.println("Jumlah uang 10000 sebanyak" + hitung4);
    System.out.println("Jumlah uang 5000 sebanyak" + hitung5);
    System.out.println("Jumlah uang 2000 sebanyak" + hitung6);
    System.out.println("Jumlah uang 1000 sebanyak" + hitung7);
    System.out.println("Jumlah uang 500 sebanyak" + hitung8);
    System.out.println("Jumlah uang 100 sebanyak" + hitung9);
    System.out.println("Jumlah uang 50 sebanyak" + hitung10);
    System.out.println("Jumlah uang 10 sebanyak" + hitung11);
    System.out.println("Jumlah uang 1 sebanyak" + hitung12);
 
  }
}





