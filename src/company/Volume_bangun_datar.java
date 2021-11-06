package company;

public class Volume_bangun_datar {
    public static void main(String[] args) {
        float rusuk = 10;
        float panjang = 10;
        float lebar = 6;
        float t_segitiga = 3;
        float r = 7;
        float t_tabung = 10;

        float V_kubus = rusuk*rusuk*rusuk;
        float V_balok = panjang*lebar*t_segitiga;
        double V_tabung = 3.14*(r*r)*t_tabung;

        System.out.println("Volume Kubus " +V_kubus);
        System.out.println("Volume Balok " +V_balok);
        System.out.println("Volume Tabung " +V_tabung);
    }

}
