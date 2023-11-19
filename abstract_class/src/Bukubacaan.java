public class Bukubacaan extends Perpustakaan {
    public String karya;
    public String judul;
    
    @Override
    public void Peminjaman() {
        System.out.println("\n******* Halo "+Nama+" *******");
        System.out.println("buku yang anda pinjam adalah : "+judul);
        System.out.println("karya                        : "+ karya); 
    }
}
