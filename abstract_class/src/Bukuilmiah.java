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

    @Override
    public void hargapinjaman() {
        System.out.println("Harga peminjaman buku ilmiah/jurnal sebesar  "+harga);
    }
    // menambahkan overloading
    public int hargapinjaman(int hari, int harga ){
        int totalharga= hari *harga;
        System.out.println("Total harga bukuilmiah selama 3 hari adalah : "+totalharga);
        return totalharga; 
    }

}
