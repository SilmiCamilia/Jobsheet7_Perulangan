import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner cinemah = new Scanner(System.in);
        final int pricez = 50000;
        int totalTiket = 0;
        long totalBayar = 0;

        System.out.println("=== Cihuy Cinemah ===");
        System.out.println("Input jumlah tiket per pelanggan, 0 = selesai");

        while (true) {
            System.out.print("Jumlah tiket (0 = selesai): ");
            int jumlah = cinemah.nextInt();

            if (jumlah == 0) {
                break; 
            }

            if (jumlah < 0) {
                System.out.println("Input tidak valid (negatif), masukkan lagi");
                continue; 
            }

            double diskonnzz = 0.0;
            if (jumlah > 10) {
                diskonnzz = 0.15;
            } else if (jumlah > 4) {
                diskonnzz = 0.10;
            }

            int subtotal = jumlah * pricez;
            int discountAmount = (int) Math.round(subtotal * diskonnzz);
            int finalPrice = subtotal - discountAmount;

      
            System.out.println("Subtotal: Rp " + String.format("%,d", subtotal));
            System.out.println("Diskon: " + (int)(diskonnzz*100) + "% -> Rp " + String.format("%,d", discountAmount));
            System.out.println("Total bayar pelanggan: Rp " + String.format("%,d", finalPrice));
            System.out.println("-----------------------------");


            totalTiket += jumlah;
            totalBayar += finalPrice;
        }

        System.out.println("\n=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total pendapatan    : Rp " + String.format("%,d", totalBayar));
        
    }
}
