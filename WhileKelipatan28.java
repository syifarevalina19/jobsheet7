import java.util.Scanner;

public class WhileKelipatan28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        double rataRata;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0); {
                jumlah += i;
                counter++;
            }
            i++;
        }
        if (counter > 0) {
            rataRata = (double) jumlah / counter;
            System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan,counter);
            System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
            System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %2\n", kelipatan, rataRata);
        } else {
             System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50\n", kelipatan);

        }
    }
}
