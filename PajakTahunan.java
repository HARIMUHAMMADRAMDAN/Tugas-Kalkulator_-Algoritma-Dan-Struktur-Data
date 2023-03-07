import java.util.Scanner;

public class PajakTahunan {
    public static void main(String[] args) {
        // Input pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan penghasilan tahunan Anda: ");
        double penghasilanTahunan = scanner.nextDouble();
        System.out.print("Masukkan total biaya yang dapat dikurangkan dari pajak: ");
        double biaya = scanner.nextDouble();
        scanner.close();
        
        // Perhitungan pajak
        double pajak = 0;
        if (penghasilanTahunan <= 10000) {
            pajak = penghasilanTahunan * 0.1;
        } else if (penghasilanTahunan <= 50000) {
            pajak = 10000 * 0.1 + (penghasilanTahunan - 10000) * 0.2;
        } else {
            pajak = 10000 * 0.1 + 40000 * 0.2 + (penghasilanTahunan - 50000) * 0.3;
        }
        pajak = pajak - biaya;
        if (pajak < 0) {
            pajak = 0;
        }
        
        // Output hasil perhitungan pajak
        System.out.println("Halo, " + nama);
        System.out.println("Penghasilan tahunan Anda adalah: " + penghasilanTahunan);
        System.out.println("Biaya yang dapat dikurangkan dari pajak adalah: " + biaya);
        System.out.println("Pajak tahunan Anda adalah: " + pajak);
    }
}
