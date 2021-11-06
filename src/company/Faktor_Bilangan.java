package company;

import java.util.Scanner;

public class Faktor_Bilangan {
    public static void main(String[] args){
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka untuk mencari faktor Bilangan : ");
        bilangan = input.nextInt();
        System.out.println("Faktor dari : " + bilangan +" adalah");

        for (int i=1;i<bilangan;i++) {
            if (bilangan%i == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println(bilangan);
    }
}
