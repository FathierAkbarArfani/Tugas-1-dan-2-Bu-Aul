import java.util.Scanner;
public class While {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int i= 0;
        int batasAwal,batasAkhir;

        System.out.println("Masukan Batas Awal Angka: ");
        batasAwal = input.nextInt();
        System.out.println("Masukan Batas Akhir Angka: ");
        batasAkhir = input.nextInt();
        while (i >= batasAwal && i <= batasAkhir) {
            System.out.println(i);
            i+=6;
        }
    }
}
