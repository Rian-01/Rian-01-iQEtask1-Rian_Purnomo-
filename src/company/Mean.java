package company;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        int count, i;
        float sum = 0, mean;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah baris");
        count = scanner.nextInt();

        System.out.println("Masukkan " + count + " baris angka");
        for (i = 0; i < count; i++) {
            sum += scanner.nextInt();
        }
        mean = sum / count;
        System.out.println("Mean dari "+count+ " baris adalah "+ mean);
    }

}
