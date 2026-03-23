package Day2;

class LC_2864 {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        for(char ch:s.toCharArray()){
            if(ch=='1')
                one++;
        }
        StringBuilder sb=new StringBuilder();
        sb.repeat("1",one-1);
        sb.repeat("0",s.length()-one);
        sb.repeat("1",1);
        return sb.toString();
    }
}