package PBO.tugas2;

public class app {
    public static void main(String[] args) {
        abstractclass mobil1 = new mobil(
                "SUV", "Honda", "Rp.1M");
        abstractclass mobil2 = new mobil(
                "Sport", "Toyota", "Rp.1.5M");

        mobil1.cetak();
        mobil2.cetak();
    }
}
