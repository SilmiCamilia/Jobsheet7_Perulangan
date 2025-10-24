import java.util.Scanner;

public class Parkingz {
    public static void main(String[] args) {
        Scanner park = new Scanner(System.in);
        final int carz = 3000;
        final int mwotor = 2000;
        final int flat = 12500;

        int mesinSolidz = 0;
        long totals = 0;

        System.out.println("=== Parkingz ===");
        System.out.println("Pilih jenis kendaraan: \t1.Mobil\t2.Motor\t0.Keluar");

        while (true) {
            System.out.print("Jenis kendaraan (1/2/0): ");
            int type = park.nextInt();

            if (type == 0) {
                break;
            }

            if (type != 1 && type != 2) {
                System.out.println("Pilihan tidak valid. Masukkan 1 (Mobil), 2 (Motor), atau 0 (Keluar).");
                continue;
            }

            System.out.print("Durasi parkir (jam): ");
            int jamm = park.nextInt();

            if (jamm <= 0) {
                System.out.println("Durasi tidak valid. Masukkan angka jam > 0.");
                continue;
            }

            int moneyh;
            if (jamm > 5) {
                moneyh = flat;
            } else {
                moneyh = jamm * (type == 1 ? carz : mwotor);
            }

            System.out.println("Biaya parkir: Rp " + String.format("%,d", moneyh));
            System.out.println("-----------------------------");

            mesinSolidz++;
            totals += moneyh;
        }

        System.out.println("\n=== Rekap Parkir ===");
        System.out.println("Kendaraan terproses : " + mesinSolidz);
        System.out.println("Total pendapatan     : Rp " + String.format("%,d", totals));
    }
}
