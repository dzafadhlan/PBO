package PBO.tugas;

public class buku {

    // inisiasi
    String judul;
    String genre;
    String tahun_terbit;
    String penerbit;

    public buku(String judul, String genre, String tahun_terbit, String penerbit) {
        this.judul = judul;
        this.genre = genre;
        this.tahun_terbit = tahun_terbit;
        this.penerbit = penerbit;
    }

    // methode untuk print
    public String toString() {
        System.out.println("Informasi Buku Dan Komik");
        return ("Genre : " + genre + "\nJudul : " + judul + "\nTahun Terbit : " + tahun_terbit + "\nPenerbit : "
                + penerbit + "\n============\n");
    }

}
