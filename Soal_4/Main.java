public class Main{
    public static void main(String[] args) {
        int kaki = 6;
        String Nama = "Sapi";
        String makanan = "Farouq";
        Hewan h = new Hewan(kaki, Nama, makanan);
        System.out.println("Hewan ini mempunyai : "+h.getKaki()+" kaki");
        System.out.println("Bernama "+h.getNama());
        System.out.println("Makanan kesukaan nya : "+h.getMakanan());
    }
}