import java.util.Scanner;

public class Square18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        // Outer loop (perulangan luar) untuk mengatur baris ke bawah
        for (int iOuter = 1; iOuter <= n; iOuter++) {
            
            // Inner loop (perulangan dalam) untuk mencetak bintang ke samping
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            
            // Pindah ke baris baru setelah satu baris bintang selesai dicetak
            System.out.println(); 
        }

        sc.close();
    }
}

