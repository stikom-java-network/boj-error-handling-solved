import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        String nama[] = new String[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < nama.length; i++){
            System.out.print("Masukkan nama : ");
            nama[i] = br.readLine();
        }

        for(int j = 0; j < nama.length; j++){
            System.out.println(nama[j]);
        }
    }
}