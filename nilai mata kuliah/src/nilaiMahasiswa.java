import java.util.Scanner;

public class nilaiMahasiswa{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.print(" Nama : ");
        String nama = scanner.nextLine();
        
        System.out.print(" NIM : ");
        String NIM = scanner.nextLine();

        System.out.print(" Nilai tubes : ");
        int NilaiTubes = scanner.nextInt();

        System.out.print(" Nilai Quiz : ");
        int nilaiQuiz = scanner.nextInt();

        System.out.print(" Nilai Tugas : ");
        int NilaiTugas = scanner.nextInt();

        System.out.print(" Nilai UTS : ");
        int NilaiUTS = scanner.nextInt();

        System.out.print(" Nilai UAS : ");
        int NilaiUAS = scanner.nextInt();

        int totalNilai = (int) ((0.3 *NilaiTubes)+(0.1* nilaiQuiz)+(0.1*NilaiTugas)+(0.25*NilaiUTS)+(0.25*NilaiUAS));

        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+ NIM);
        System.out.println("Nilai akhir : "+ totalNilai);

        scanner.close();

    }
}