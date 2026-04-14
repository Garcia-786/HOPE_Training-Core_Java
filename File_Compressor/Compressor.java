package File_Compressor;

abstract class Compressor {
    String name;
    Compressor(String name) {
        this.name = name;
    }
    abstract String compress(String data);
    abstract String decompress(String data);
    void show() {
        System.out.println("Using: " + name);
    }
}