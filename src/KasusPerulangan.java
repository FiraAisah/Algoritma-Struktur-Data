import java.util.Scanner;

public class KasusPerulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input Jumlah Barang
        System.out.print("Masukan Jumlah Barang:");
        int JumlahBarang = scanner.nextInt();
        //inisialisai Jumlah Barang
        double totakHarga = 0;
        //menghitung total harga dengan for
        System.out.println("\n Menggunakan perulangan for");
        for (int i = 0; i <= JumlahBarang;i++) {
            System.out.print("Masukan harga barang ke-:"+i +":");
            double hargaBarang = scanner.nextDouble();
            totakHarga += hargaBarang;
        }
        System.out.println("Total belanja (for): " + totakHarga);

        //reset total harga
        double totalHarga = 0;
        //while
        System.out.println("\n Menggunakan perulangan while");
        int j = 1;
        while ( j <= JumlahBarang) {
            System.out.print("Masukan harga barang ke-:" + j +":");
            double hargaBarang = scanner.nextDouble();
            totakHarga += hargaBarang;
            j++;
        }
        System.out.println("Total belanja (While): " + totakHarga);

        //menutup scanner
        scanner.close();
    }
}
