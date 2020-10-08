import java.util.Scanner;

	class MenentukanNilai{
		public static void main(String[] datk){
		Scanner in = new Scanner(System.in);
		System.out.println("Program Menentukan Predikat Dari Sebuah Nilai");
		System.out.print("Masukan Nilai (Dengan Huruf A-D) = ");
		char predikat = in.next(".").charAt(0);


		switch(predikat){
		case 'A':
 				System.out.println("Excellent");
		break;
		case 'B':
 				System.out.println("Good");
			break;
		case 'C':
 				System.out.println("Average");
		break;
		case 'D':
 				System.out.println("Failed");
		break;
		default : 
				System.out.println("Program Error");
}
}
}