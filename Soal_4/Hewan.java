class Hewan{
    int kaki;
    String Nama,makanan;

    public Hewan(int kaki, String Nama, String makanan){
        this.kaki = kaki;
        this.Nama=Nama;
        this.makanan = makanan;
    }

    public int getKaki(){
        return kaki;
    }

    public String getNama(){
        return Nama;
    }

    public String getMakanan(){
        return makanan;
    }
}