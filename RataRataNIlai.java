import java.util.Scanner;
public class RataRataNIlai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSiswa,nilai = 0,siswa,Ratarata,temp= 0;
        double total;

        System.out.println("Masukan Jumlah Siswa");
        jumlahSiswa = input.nextInt();
        siswa = 1;

        while (siswa <= jumlahSiswa) {
            System.out.println("Masukan Nilai Siswa "+siswa+":" );
            nilai = input.nextInt();
            temp += nilai;
            siswa++;
        }
        total = temp;
        Ratarata= temp / jumlahSiswa;
        System.out.println("Total Nilai Adalah: "+total);
        System.out.println("Nilai Rata rata: "+Ratarata);
    }
}