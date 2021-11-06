package company;

public class Konversi_Nilai {
    public static void main(String[] args){
        //input
        int studentScore = 80;
        //Proses
        if (studentScore < 100)
            System.out.println("Nilai invalid");
        else if (studentScore >= 80 && studentScore <=100)
            System.out.println("Nilai Anda A");
        else if (studentScore >=65 && studentScore <=79)
            System.out.println("Nilai Anda B+");
        else if (studentScore >=50 && studentScore <=64)
            System.out.println("Nilai Anda B");
        else if (studentScore >=49 && studentScore >=35)
            System.out.println("Nilai Anda C");
        else if (studentScore >=34 && studentScore >= 0)
            System.out.println("Nilai Anda D");
        else if (studentScore <0)
            System.out.println("Nilai Invalid");
        //output
        //Nilai A
    }

}
