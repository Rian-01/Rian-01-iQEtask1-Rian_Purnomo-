package company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int hasil = 1;
        int angka = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pertama : ");
        int angka1 = input.nextInt();
        System.out.print("Pilih operasi : ");
        int Operasi = input.nextInt();
        if (Operasi == 1 || Operasi == 2 || Operasi == 3 || Operasi == 4) {
            System.out.println("Masukkan angka kedua : ");
            angka = input.nextInt();
        } else {
            System.out.println("Operasi tidak tersedia");
        }


        switch (Operasi) {
            case 1:
                hasil = angka + angka1;
                break;
            case 2:
                hasil = angka - angka1;
                break;
            case 3:
                hasil = angka * angka1;
                break;
            case 4:
                hasil = angka / angka1;
                break;
        }
        System.out.println(hasil);
    }

}
