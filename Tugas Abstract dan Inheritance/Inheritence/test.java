package PBO.tugas;

public class test {
    public static void main(String[] args) {
        buku in = new buku(
                "The last of Us", "Adventure", "2018", "Mizan");
        System.out.println(in.toString());
        komik out = new komik("YuGi-Oh", "Card", "2001", "Nippong", "Hitam Putih");
        System.out.println(out.toString());
    }
}
