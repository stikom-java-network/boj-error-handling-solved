public class Main{
    public static void main(String[] args) {
        int hasil = 0;
        int[] data = {4,5,8,9,4,2};
        
        for(int w=0; w<data.length; w++){
            hasil += data[w];
            System.out.print(hasil+" ");
        }
        
        System.out.println();
        
        for(int w=0; w<data.length; w++){
            hasil *= data[w];
            System.out.print(hasil+" ");
        }
        System.out.println();
    }
}