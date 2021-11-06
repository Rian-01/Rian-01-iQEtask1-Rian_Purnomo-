package company;

public class Luas_Keliling_Bidang {
    public static void main(String [] args) {
        float sisi = 4;
        float alas = 3;
        float tinggi = 4;
        float panjang = 8;
        float lebar = 7;

        float kel_persegi = sisi*4;
        float kel_segitiga = alas*tinggi;
        float kel_persegipanjang = 2*(panjang+lebar);

        float luas_persegi = sisi*sisi;
        float luas_segitiga = (alas*tinggi)/2;
        float luas_persegipanjang = panjang*lebar;

        System.out.println("Keliling Persegi "+kel_persegi);
        System.out.println("Keliling segitiga "+kel_segitiga);
        System.out.println("Keliling Persegi Panjang "+kel_persegipanjang);
        System.out.println("Luas persegi "+luas_persegi);
        System.out.println("Luas segitiga "+luas_segitiga);
        System.out.println("Luas persegi panjang "+luas_persegipanjang);
    }

}
