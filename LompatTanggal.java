import java.util.Scanner;

class LompatTanggal {
public static void main (String [] datk) {
            String namaBulan = "",
                namaBulanBerikutnya = "";

            int jumlahTanggal = 0;

    Scanner input = new Scanner(System.in);
            System.out.println("Program Menentukan Hari Berikutnya");
            System.out.print("Masukan Tahun : ");
            int tahun = input.nextInt();
            System.out.print("Masukkan Bulan (1-12) : ");
            int bulan = input.nextInt();
            System.out.print("Masukkan Tanggal : ");
            int tanggal = input.nextInt();
            System.out.print("Masukkan N Hari Kedepan : ");
            int nHari = input.nextInt();

            
            switch (bulan) {
            case 1 :
                    namaBulan = "Januari";
                    jumlahTanggal = 31;
                    
            break;
            case 2 :
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

            break;
            case 3 :
                    namaBulan = "Maret";
                    jumlahTanggal = 31;

            break;
            case 4 : 
                    namaBulan = "April";
                    jumlahTanggal = 30;
            break;
            case 5 :
                    namaBulan = "Mei";
                    jumlahTanggal = 31;
            break;
            case 6 :
                    namaBulan = "Juni";
                    jumlahTanggal = 30;
            break;
            case 7 :
                    namaBulan = "Juli";
                    jumlahTanggal = 31;
            break;
            case 8 :
                    namaBulan = "Agustus";
                    jumlahTanggal = 31;
            break;
            case 9 :
                    namaBulan = "September";
                    jumlahTanggal = 30;
            break;
            case 10 :
                    namaBulan = "Oktober";
                    jumlahTanggal = 31;
            break;
            case 11 :
                    namaBulan = "November";
                    jumlahTanggal = 30;
            break;
            case 12 :
                    namaBulan = "Desember";
                    jumlahTanggal = 31;
            break;
            default :
                    System.out.println ("Program Error!!");
            break;
        }
int hariBerikutnya = tanggal + nHari - jumlahTanggal;

        int bulanBerikutnya = 0;
        if ((tahun + nHari) > jumlahTanggal){
            bulanBerikutnya = bulan + 1;
        } else{
            bulanBerikutnya = bulan;
        }

        System.out.println("Nomor " + bulan + " adalah " + namaBulan + " dengan " + jumlahTanggal + " hari");

        switch (bulanBerikutnya){
            case 1 : 
               namaBulanBerikutnya = "Januari"; 
            break;
            case 2 : 
                namaBulanBerikutnya = "Februari"; 
            break;
            case 3 :  namaBulanBerikutnya = "Maret"; 
            break;
            case 4 :  namaBulanBerikutnya = "April"; 
            break;
            case 5 :  namaBulanBerikutnya = "Mei"; 
            break;
            case 6 :  namaBulanBerikutnya = "Juni"; 
            break;
            case 7 :  namaBulanBerikutnya = "Juli"; 
            break;
            case 8 :  namaBulanBerikutnya = "Agustus"; 
            break;
            case 9 :  namaBulanBerikutnya = "September"; 
            break;
            case 10 :  namaBulanBerikutnya = "Oktober"; 
            break;
            case 11 :  namaBulanBerikutnya = "November"; 
            break;
            case 12 :  namaBulanBerikutnya = "Desember"; 
            break;
        }
        System.out.println(nHari + " Hari Berikutnya Hari  " + hariBerikutnya + " " +  namaBulanBerikutnya);


}
}
  