public abstract class Perpustakaan {
    public String Nama;

    public void peraturanPeminjaman(){
        System.out.println("\nbaca peraturan peminjaman buku/jurnal yang telah di berikan");
    }
    public void terimakasih(){
        System.out.println("\n-----terimakasih sudah meminjam buku di sini-----");
    }
    public abstract void Peminjaman();    
} 