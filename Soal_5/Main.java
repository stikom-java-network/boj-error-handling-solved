import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Masukkan angka 1 : ");
            int angka1 = Integer.parseInt(br.readLine());
            System.out.print("Masukkan angka 2 : ");
            int angka2 = Integer.parseInt(br.readLine());
            int hasil = angka1 + angka2;
            System.out.println();
            System.out.println("Hasil : "+hasil);
            String cek = hasil > 10 ? "Angka lebih dari 10" : "Angka kurang dari 10";
            System.out.println();
            System.out.println(cek);
        }catch(Exception e){

        }
    }
}