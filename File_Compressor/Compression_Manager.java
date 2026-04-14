package File_Compressor;

class Compression_Manager{
    private Compressor comp; // encapsulation
    Compression_Manager(Compressor comp) {
        this.comp = comp;
    }
    void setCompressor(Compressor comp) {//To change the compression algorithm at runtime without rewriting everything.
        this.comp = comp;
    }
    void process(String data) {
        comp.show();
        String c = comp.compress(data);
        System.out.println("Compressed: " + c);
        String d = comp.decompress(c);
        System.out.println("Decompressed: " + d);
    }
}