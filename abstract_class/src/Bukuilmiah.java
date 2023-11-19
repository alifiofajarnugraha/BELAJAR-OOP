public class Bukuilmiah extends Perpustakaan {
    public String penulis;
    public String topik;
    public int tahunTerbit; 

    @Override
    public void Peminjaman() {
        System.out.println("\n******* Halo "+Nama+" *******");
        System.out.println("Judul Buku ilmiah yang anda pinjam adalah : "+ topik +" Dengan penulis : " + penulis);
        System.out.println("Diterbitkan pada "+ tahunTerbit);
    }
}
