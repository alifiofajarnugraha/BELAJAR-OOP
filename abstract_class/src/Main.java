import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Bukubacaan peminjam1 = new Bukubacaan();
        peminjam1.karya = "Dedy corbuzer";
        peminjam1.judul = "Sukses untuk masa depan";
        
        Bukuilmiah peminjam2 = new Bukuilmiah();
        peminjam2.penulis = "agung sudrajad";
        peminjam2.topik = "'kesehatan masyarakat'";
        peminjam2.tahunTerbit= 2019;
    
        System.out.println("Buku yang dapat di pinjam adalah 1. Bukubacaan{1} 2. Bukuilmiah{2}");
        System.out.println("Masukan kode buku : ");
        String kodebuku = scanner.nextLine();
        
        if (kodebuku.equals("1")){
            System.out.println("Masukan nama anda : ");
            peminjam1.Nama = scanner.nextLine();
            peminjam1.Peminjaman();
            peminjam1.peraturanPeminjaman();
            peminjam1.terimakasih();
        }else if (kodebuku.equals("2")){
            System.out.println("Masukan nama anda : ");
            peminjam2.Nama = scanner.nextLine();
            peminjam2.Peminjaman();
            peminjam2.peraturanPeminjaman();
            peminjam2.terimakasih();

        }else {
            System.out.println("Kode tidak di temukan");
        }
    scanner.close();
    }
        
}
