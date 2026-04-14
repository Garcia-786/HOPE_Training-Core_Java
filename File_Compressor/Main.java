package File_Compressor;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        Compressor rle = new RLE_Compressor(); // abstraction
        Compression_Manager manager = new Compression_Manager(rle);
        manager.process(data);
        sc.close();
    }
}