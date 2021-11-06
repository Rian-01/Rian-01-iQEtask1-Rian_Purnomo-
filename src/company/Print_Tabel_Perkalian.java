package company;

public class Print_Tabel_Perkalian {
    public static void main(String[] args) {
        System.out.println("\t Tabel Perkalian 1-30 \n");
        for (int i = 1; i <= 30; i++) {
            for(int j = 1; j <= 30; j++){
                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n\n");
        }
    }
}
