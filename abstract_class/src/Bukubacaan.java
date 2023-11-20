public class Bukubacaan extends Perpustakaan {
    public String karya;
    public String judul;
    
    @Override
    public void Peminjaman() {
        System.out.println("\n******* Halo "+Nama+" *******");
        System.out.println("buku yang anda pinjam adalah : "+judul);
        System.out.println("karya                        : "+ karya); 
    }

    @Override
    public void hargapinjaman() {
        System.out.println("Harga peminjaman buku bacaan sebesar  "+harga);
    }

    // menambahkan overriding
    @Override
    public void peraturanPeminjaman() {
        System.out.println("\nBuku bacaan yang di pinjam hanya buku berjenis NOVEL ");
        super.peraturanPeminjaman();
    }

    // menambahkan overloading
    public int hargapinjaman(int hari, int harga ){
        int totalharga= hari *harga;
        System.out.println("Total harga buku bacaan selama 3 hari adalah : "+totalharga);
        return totalharga; 

    }
    
}



    
  