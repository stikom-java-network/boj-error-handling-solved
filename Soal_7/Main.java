public class Main {
    public static void main(String[] args){
        
        String data_integer = "100";
        String data2_integer = "928";
        String data_float = "456.60";
        
        byte kon_byte = Byte.valueOf(data_integer);
        short kon_short = Short.parseShort(data_integer); 
        int kon_int = Integer.parseInt(data2_integer);
        long kon_long = Long.valueOf(data2_integer);
        
        float kon_float = Float.valueOf(data_float);
        double kon_double = Double.parseDouble(data_float); 
        
        System.out.println("Test Konversi Byte: "+kon_byte / 2);
        System.out.println("Test Konversi Short: "+kon_short * 2);
        System.out.println("Test Konversi Int: "+kon_int + 5699);
        System.out.println("Test Konversi Long: "+kon_long * 100);
        System.out.println("Test Konversi Float: "+kon_float / 4);
        System.out.println("Test Konversi Double: "+kon_double + 4889.90);
    }
    
}