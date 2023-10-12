import java.util.Scanner;

public class WhileGaji28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        
        System.out.print("Masukkan jumlah karyawan");
        jumlahKaryawan = scan.nextInt();

        int i =0;
        while (i < jumlahKaryawan) {
            System.out.println("pilihan jabatan - Direktur, Manajer, Karyawan: ");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan.nextInt();
            
            i++;
            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 1000000;
            }
            else if (jabatan.equalsIgnoreCase("Karyawan")) { 
                gajiLembur = jumlahJamLembur * 75000;
            }

            totalGajiLembur += gajiLembur;
        }
           System.out.println("Total gaji lembur: "+ totalGajiLembur);
    }
}
