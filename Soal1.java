import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, total;
        int diskon;
        int jumlah_harga;

        System.out.print("Masukkan harga barang: Rp.");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah barang:");
        jumlah = input.nextInt();

        total = harga * jumlah;
        diskon = total *  15 / 100;
        jumlah_harga = total - diskon;
        System.out.println("Jumlah harga(Diskon 15%): Rp." +jumlah_harga);
        
    }
}
