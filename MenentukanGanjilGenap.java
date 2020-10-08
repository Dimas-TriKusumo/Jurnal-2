import java.util.Scanner;

class MenentukanGanjilGenap {
  public static void main(String[] args) {
    int a;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Masukkan angka : ");
    a = scan.nextInt();
    
    if (a % 2 == 0) {
      System.out.println("Bilangan " + a + " adalah genap");
    } else {
      System.out.println("Bilangan " + a + " adalah ganjil");
    }
  }
}