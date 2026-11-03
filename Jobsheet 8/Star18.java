import java.util.Scanner; // Poin 4: Import library Scanner

public class Star18 {
    public static void main(String[] args) {
        // Poin 5: Deklarasi objek Scanner dengan nama sc
        Scanner sc = new Scanner(System.in);

        // Poin 6: Meminta input nilai n
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        // Poin 7: Perulangan for untuk mencetak bintang secara horizontal
        // Catatan: Gunakan print, bukan println
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        sc.close();
    }
}
