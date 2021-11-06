package company;

public class Ongkos_kirim {
    public static void main(String[] args) {
        float p = 5;
        float l = 2;
        float t = 4;
        int harga;
        int ongkir = 5000;
        int berat = 1;

        float dimensi = p*l*t;
        if (dimensi <= 50 && berat <=1) {
            harga = berat * ongkir;
            System.out.println("Biaya Pengiriman Sebesar Rp" + harga);
        }
        else if (dimensi > 50 && berat >1) {
            harga = berat*2*ongkir;
            System.out.println("Biaya Pengiriman Sebesar RP" +harga);
        }

    }
}
