package Day6;

class LC_345 {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(vowels(arr[l])){
                if(vowels(arr[r])){
                    char temp=arr[l];
                    arr[l]=arr[r];
                    arr[r]=temp;
                    r--;
                }
                else{
                    r--;
                    continue;
                }
            }
            l++;
        }
        return new String(arr);
    }
    public boolean vowels(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
