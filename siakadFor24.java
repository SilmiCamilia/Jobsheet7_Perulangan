
import java.util.Scanner;

public class siakadFor24 {
    public static void main(String[] args) {
        Scanner ulang = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus=0, tidaklulus=0;
        for (int i = 1; i<=10; i++){
            System.out.print("masukkan nilai mahasiswa ke-"+i+" : ");
            nilai = ulang.nextDouble();
            if(nilai>=60){
                lulus++;
                if(nilai>tertinggi){
                tertinggi = nilai;
                }
                if(nilai<terendah){
                terendah = nilai;
                }
            }
            else if(nilai<60){
                tidaklulus++;
                if(nilai>tertinggi){
                tertinggi = nilai;
                }
                if(nilai<terendah){
                terendah = nilai;
                }
            }
        }
        System.out.println("nilai tertinggi: "+tertinggi);
        System.out.println("nilai terendah: "+terendah);
        System.out.println("jumlah mahasiswa yang lulus: "+lulus);
        System.out.println("jumlah mahasiswa yang tidak lulus: "+tidaklulus);

    }
}
