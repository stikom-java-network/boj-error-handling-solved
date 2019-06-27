public class Main {
    
    public static void main(String[] args){
        String nama = "institut bisnis dan informatika stikom surabaya";
        String ukp = "STIKOM JAVA NETWORK";

        nama = nama.toUpperCase();
        ukp = ukp.toLowerCase();
        int lengtNama = nama.length();
        int lengtUkp = ukp.length();

        System.out.println("nama : "+nama+"\npanjang karakter : "+lengtNama);
        System.out.println("ukp : "+ukp+"\npanjang karakter : "+lengtUkp);
    }
}