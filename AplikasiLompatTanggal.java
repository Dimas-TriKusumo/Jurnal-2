import java.util.Scanner;

class AplikasiLompatTanggal{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
            System.out.println("Program Menentukan Hari Berikutnya");
            System.out.print("Masukan Tahun : ");
            int tahun = inp.nextInt();
            System.out.print("Masukkan Bulan (1-12) : ");
            int bulan = inp.nextInt();
            System.out.print("Masukkan Tanggal : ");
            int tanggal = inp.nextInt();
            System.out.print("Masukkan N Hari Kedepan : ");
            int nHari = inp.nextInt();

		String namaBulan = "";
		int jumlahTanggal = 0;


		if (bulan == 1){
			namaBulan = "January";
			jumlahTanggal = 31;			
		} else if (bulan == 2){
			namaBulan = "Februari";
                if ((tahun % 400 == 0)){
                    jumlahTanggal = 29;
                    } 
                else if ((tahun % 400!=0)&&(tahun % 100==0)) {
                        jumlahTanggal = 28; }
                else if ((tahun%400!=0)&&(tahun%100!=0)&&(tahun%4==0)) {
                    jumlahTanggal = 29; }
                else {
                    jumlahTanggal = 28; }
		} else if (bulan == 3){
			namaBulan = "March";
			jumlahTanggal = 31;			
		} else if (bulan == 4){
			namaBulan = "April";
			jumlahTanggal = 30;			
		} else if (bulan == 5){
			namaBulan = "May";
			jumlahTanggal = 31;			
		} else if (bulan == 6){
			namaBulan = "June";
			jumlahTanggal = 30;			
		} else if (bulan == 7){
			namaBulan = "July";
			jumlahTanggal = 31;			
		} else if (bulan == 8){
			namaBulan = "August";
			jumlahTanggal = 31;			
		} else if (bulan == 9){
			namaBulan = "September";
			jumlahTanggal = 30;			
		} else if (bulan == 10){
			namaBulan = "October";
			jumlahTanggal = 31;			
		} else if (bulan == 11){
			namaBulan = "November";
			jumlahTanggal = 30;			
		} else if (bulan == 12){
			namaBulan = "December";
			jumlahTanggal = 31;			
		} else {
			System.out.println("Input invalid");
		}
					//statement lainnya/*	int nextDay = val0 + val3 - monthDate;

		/*int nextMonth = 0;
		if ((val0 + val3) > monthDate){
			nextMonth = val1 + 1;
		} else{
			nextMonth = val1;
		}

		System.out.println("No " + val1 + " is " + monthName + " with " + monthDate + " days");

		String nextMonthName="";
		switch (nextMonth){
			case 1 : 
				nextMonthName = "January"; 
				break;
			case 2 : 
				nextMonthName = "February"; 
				break;
			case 3 : nextMonthName = "March"; break;
			case 4 : nextMonthName = "April"; break;
			case 5 : nextMonthName = "May"; break;
			case 6 : nextMonthName = "June"; break;
			case 7 : nextMonthName = "July"; break;
			case 8 : nextMonthName = "August"; break;
			case 9 : nextMonthName = "September"; break;
			case 10 : nextMonthName = "October"; break;
			case 11 : nextMonthName = "November"; break;
			case 12 : nextMonthName = "December"; break;
		}
		System.out.println("Next " + val3 + " days is " + nextDay + " " + nextMonthName);


		/*
		System.out.println("4. April");
		System.out.println("5. May");
		System.out.println("6. June");
		System.out.println("7. July");
		System.out.println("8. August");
		System.out.println("9. September");
		System.out.println("10. October");
		System.out.println("11. November");
		System.out.println("12. December");	
		*/
