package PBO.tugas;

class komik extends buku {
    String ilustrasi;

    public komik(String judul, String genre, String tahun_terbit, String penerbit, String ilustrasi) {
        super(judul, genre, tahun_terbit, penerbit);

        this.ilustrasi = ilustrasi;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nilustrsi : " + ilustrasi);
    }

}
