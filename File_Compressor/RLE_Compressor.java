package File_Compressor;
/*
RLE algo only efficient for strings with many repeated characters.
eg: "aaabbcccccc" -> "3a2b6c"
*/
class RLE_Compressor extends Compressor{
    RLE_Compressor(){
        super("RLE Compression");
    }
    @Override
    String compress(String data){
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= data.length(); i++){
            if (i < data.length() && data.charAt(i) == data.charAt(i - 1)) {
                count++;
            } else {
                res.append(count).append(data.charAt(i - 1));
                count = 1;
            }
        }
        return res.toString();
    }
    @Override
    String decompress(String data) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < data.length(); i += 2) {
            int count = data.charAt(i) - '0';
            char ch = data.charAt(i + 1);
            for (int j = 0; j < count; j++) {
                res.append(ch);
            }
        }
        return res.toString();
    }
}